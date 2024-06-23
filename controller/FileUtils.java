    package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import model.Anfitrion;
import model.ClienteBase;
import model.ClienteParticular;
import model.Inmueble;
import model.TarjetaCredito;

public class FileUtils {
    
    private static ArrayList<ClienteBase> clientes = new ArrayList<>();
    private static ClienteBase objper;
    
    public static void setClienteBase(ArrayList<ClienteBase> p) {
        clientes = p;
    }

    /**@return Devuelve el ArrayList de clientes */
    public static ArrayList<ClienteBase> getClienteBase() {
        //Comparador para ordenar las clientes por su nombre
        Comparator NomPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                ClienteBase p1 = (ClienteBase) o1;
                ClienteBase p2 = (ClienteBase) o2;
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, NomPerComp);
        return clientes;
    }

    /** Da de alta una persona
     * @param objper
     * @return  boolean */
    
    public static boolean altaClienteBase(ClienteBase objper) {
        if (!clientes.contains(objper)) {
            clientes.add(objper);
            return true;
        } else {
            return false;
        }

    }



    /** Da de baja una persona
     * @param objper
     * @return boolean */
    public static boolean bajaClienteBase(ClienteBase objper) {
        if (clientes.contains(objper)) {
            clientes.remove(objper);
            return true;
        } else {
            return false;
        }
    }

    /** Devuelve una persona por la posición dentro del ArrayList
     * @param indice
     * @return objper */
    public static ClienteBase consultaClienteBase(int indice) {
        objper = clientes.get(indice);
        return objper;
    }

    /** Modifica los datos de una persona
     * @return boolean */
    
    public static boolean modificaClienteBase(ClienteBase per, String nombre, String dni, String telefono, TarjetaCredito tarjetaCredito, boolean vip, Date fechaRegistro) {
        if (per == null || !clientes.contains(per)) {
            return false;
        }
        per.setNombre(nombre);
        per.setDni(dni);
        per.setTelefono(telefono);
        String tipo = per.getClass().getSimpleName();
        if (tipo.equals("Particular")) {
            ClienteParticular particular = (ClienteParticular) per;
            particular.setTarjeta(tarjetaCredito);
            particular.setVIP(vip);
        } else {
            Anfitrion anfitrion = (Anfitrion) per;
            anfitrion.setFechaRegistro(fechaRegistro);
            anfitrion.isSuperAnfitrion();
        }
        return true;
    }
    
    /** Consulta los datos de una persona por su dni
     * @param dni
     * @return objper */
    
    public static ClienteBase consultaClienteBasePorDni(String dni) {
        //Comparador para ordenar las clientes por su dni
        Comparator DniPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                ClienteBase p1 = (ClienteBase) o1;
                ClienteBase p2 = (ClienteBase) o2;
                return p1.getDni().compareTo(p2.getDni());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, DniPerComp);
        //creamos una persona con el dni a buscar
        ClienteBase p = new ClienteBase();
        p.setDni(dni);
        int pos = Collections.binarySearch(clientes, p, DniPerComp);
        if (pos >= 0) {
            objper = clientes.get(pos);
        } else {
            objper = null;
        }

        return objper;
    }

    /** Consulta los datos de una persona por su nombre
     * @param nombre
     * @return objper */
    public static ClienteBase consultaClienteBasePorNombre(String nombre) {
        //Comparador para ordenar las clientes por su nombre
        Comparator NomPerComp = new Comparator() {

            public int compare(Object o1, Object o2) {
                ClienteBase p1 = (ClienteBase) o1;
                ClienteBase p2 = (ClienteBase) o2;
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };
        
        //Ordenamos el array
        Collections.sort(clientes, NomPerComp);
        //creamos una persona con el nombre a buscar
        ClienteBase p = new ClienteBase();
        p.setNombre(nombre);
        int pos = Collections.binarySearch(clientes, p, NomPerComp);
        if (pos >= 0) {
            objper = clientes.get(pos);
        } else {
            objper = null;
        }

        return objper;
    }

    /** Carga los datos de clientes del fichero */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamPer = new FileInputStream("copiasegPer.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            clientes = (ArrayList) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos


    /** Guarda los datos de clientes en el fichero */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!clientes.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las clientes
                FileOutputStream ostreamPer = new FileOutputStream("copiasegPer.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                //guardamos el array de clientes
                oosPer.writeObject(clientes);
                ostreamPer.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos


    /** Crea un fichero de texto con los datos de un cliente
     * @param per
     * @throws java.io.IOException */

    public static void generaFicha(ClienteBase per) throws IOException {
        // Ruta de la carpeta donde se guardarán las fichas
        String carpetaFichas = "./fichas/";
        // Verificar si la carpeta existe, si no, crearla
        File carpeta = new File(carpetaFichas);
        if (!carpeta.exists()) {
            carpeta.mkdir(); // Crear la carpeta si no existe
        }
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(carpetaFichas + per.getCorreo() + " - " + per.getDni() + ".txt")));
        
        salida.println("-------------------------------- Ficha ClienteBase --------------------------------");
        salida.println("\n");
        salida.println("DNI: " + per.getDni());
        salida.println("\n");
        salida.println("Nombre: " + per.getNombre());
        salida.println("\n");
        salida.println("Correo: " + per.getCorreo());
        salida.println("\n");
        salida.println("Telefono: " + per.getTelefono());
        salida.println("\n");
        // Verifica si el cliente es de tipo ClienteParticular
        if (per instanceof ClienteParticular) {
            ClienteParticular clienteParticular = (ClienteParticular) per;
            salida.println("VIP: " + clienteParticular.isVIP());
            salida.println("\n");
            salida.println("Número de tarjeta: " + clienteParticular.getTarjeta().getNumero16());
        } else if (per instanceof Anfitrion) {
            // Verifica si el cliente es de tipo Anfitrion
            Anfitrion anfitrion = (Anfitrion) per;
            salida.println("Fecha de registro: " + anfitrion.getFechaRegistro());
            salida.println("\n");
            salida.println("¿Es super anfitrión?: " + anfitrion.isSuperAnfitrion());
        }

    salida.println("-------------------------------------------------------------------------------");
    salida.close();
        
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }

    public static void createFileIfNotExists(String file) {
        try {
            File f = new File(file);
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void writeToFile(String file, Object object) {
        createFileIfNotExists(file);
        try {
            FileOutputStream fs = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(object);
            os.close();
            fs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static Object readFromFile(String file) {
        createFileIfNotExists(file);
        Object object = null;
        try {
            FileInputStream fs = new FileInputStream(file);
            ObjectInputStream os = new ObjectInputStream(fs);
            object = os.readObject();
            os.close();
            fs.close();
        } catch (Exception e) {
            // si el archivo está vacío, devuelve un arraylist vacío
            object = new ArrayList<>();
        }
        return object;
    }

}
