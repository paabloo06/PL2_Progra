package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Inmueble;
import model.DatosInmueble;
import model.Direccion;


public class FileUtilsInmuebles {
        private static ArrayList<Inmueble> inmuebles = new ArrayList<>();
        private static Inmueble inmueble;
        
        
    public static void setClienteBase(ArrayList<Inmueble> i) {
        inmuebles = i;
    }
    public static ArrayList<Inmueble> getInmueble() {
        //Comparador para ordenar las clientes por su nombre
        Comparator NomInmComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, NomInmComp);
        return inmuebles;
    }
    public static boolean altaInmueble(Inmueble objinm) {
        if (!inmuebles.contains(objinm)) {
            inmuebles.add(objinm);
            return true;
        } else {
            return false;
        }

    }

    public static boolean bajaInmueble(Inmueble objinm) {
        if (inmuebles.contains(objinm)) {
            inmuebles.remove(objinm);
            return true;
        } else {
            return false;
        }
    }
    public static Inmueble consultaInmueble(int indice) {
        inmueble = inmuebles.get(indice);
        return inmueble;
    }

    /** Modifica los datos de una persona
     * @return boolean */
    
    public static boolean modificaInmuebles(Inmueble inm, String titulo, Direccion direccion, DatosInmueble datosInmueble, String tipoPropiedad, double precioPorNoche, String servicios) {
        
        if (inm == null || !inmuebles.contains(inm)) {
            return false;
        }
        
        inm.setTitulo(titulo);
        inm.setTipoPropiedad(tipoPropiedad);
        inm.setServicios(servicios);
        inm.setPrecioPorNoche(precioPorNoche);
        inm.setDireccion(direccion);
        inm.setDatosInmueble(datosInmueble);
        
        return true;
    }

    public static void cargarDatosInmuebles() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamInm = new FileInputStream("copiasegInm.dat");
            ObjectInputStream oisInm = new ObjectInputStream(istreamInm);
            inmuebles = (ArrayList) oisInm.readObject();
            istreamInm.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos
    public static void guardarDatosInmuebles() {
        try {
            //Si hay datos los guardamos...
            if (!inmuebles.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las clientes
                FileOutputStream ostreamInm = new FileOutputStream("copiasegInm.dat");
                ObjectOutputStream oosInm = new ObjectOutputStream(ostreamInm);
                //guardamos el array de clientes
                oosInm.writeObject(inmuebles);
                ostreamInm.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
    public static Inmueble buscarInmueblePorTitulo(String titulo) {
    for (Inmueble inmueble : inmuebles) {
        if (inmueble.getTitulo().equals(titulo)) {
            return inmueble;
        }
    }
    return null; // Si no se encuentra el inmueble con el título especificado
}

    public static void generaFicha(Inmueble inm) throws IOException {
        // Ruta de la carpeta donde se guardarán las fichas
        String carpetaFichas = "./fichasInmuebles/";
        // Verificar si la carpeta existe, si no, crearla
        File carpeta = new File(carpetaFichas);
        if (!carpeta.exists()) {
            carpeta.mkdir(); // Crear la carpeta si no existe
        }
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(carpetaFichas + inm.getTitulo() + ".txt")));
        
        salida.println("-------------------------------- Ficha ClienteBase --------------------------------");
        salida.println("\n");
        salida.println("Titulo: " + inm.getTitulo());
        salida.println("\n");
        salida.println("Direccion: " + inm.getDireccion());
        salida.println("\n");
        salida.println("Servicios: " + inm.getServicios());
        salida.println("\n");        
        salida.println("Precio: " + inm.getPrecioPorNoche());
        salida.println("\n");
        salida.println("Tipo: " + inm.getTipoPropiedad());
        
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
    
    public static ArrayList<Inmueble> busquedaInmueblesCiudad(String ciudad) {
        ArrayList<Inmueble> resultado = new ArrayList<>();
        String ciudadUpper = ciudad.toUpperCase();
            for (Inmueble inmueble : inmuebles) {
            if (inmueble.getDireccion().getCiudad().toUpperCase().equals(ciudadUpper)) {
                resultado.add(inmueble);
            }
        }
        return resultado;
    }   
    public static ArrayList<Inmueble> getInmueblesPorNombre() {
        //Comparador para ordenar los Productos por su nombre
        Comparator NomproComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, NomproComp);
        return inmuebles;
    }
    public static ArrayList<Inmueble> getInmueblesPorPrecio() {
        //Comparador para ordenar los Productos por su nombre
        Comparator PrecioComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                Double pr1 = p1.getPrecioPorNoche();
                Double pr2 = p2.getPrecioPorNoche();
                return pr1.compareTo(pr2);
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, PrecioComp);
        return inmuebles;
    }
    public static ArrayList<Inmueble> getInmueblesPorCalificacion() {
        // Comparador para ordenar los inmuebles por calificación de mayor a menor
        Comparator<Inmueble> CalificacionComp = new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble p1, Inmueble p2) {
                Integer pr1 = p1.getCalificacionMedia();
                Integer pr2 = p2.getCalificacionMedia();
                return pr2.compareTo(pr1); // Orden descendente
            }
        };
        // Ordenamos el array
        Collections.sort(inmuebles, CalificacionComp);
        return inmuebles;
    }
    
    public static ArrayList<Inmueble> getInmueblesPorTipo() {
        //Comparador para ordenar los Productos por su nombre
        Comparator TipoComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                return p1.getTipoPropiedad().compareTo(p2.getTipoPropiedad());
            }
        };
        //Ordenamos el array
        Collections.sort(inmuebles, TipoComp);
        return inmuebles;
    }
}
