
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Inmueble;
import model.Reserva;
import view.ClienteParticular;

public class FileUtilsReservas {
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static Reserva reserva;
        
        
    public static void setReserva(ArrayList<Reserva> r) {
        reservas = r;
    }
    public static ArrayList<Reserva> getReservas() {
        //Comparador para ordenar las clientes por su nombre
        Comparator NomInmComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Reserva p1 = (Reserva) o1;
                Reserva p2 = (Reserva) o2;
                return p1.getIdReserva().compareTo(p2.getIdReserva());
            }
        };
        //Ordenamos el array
        Collections.sort(reservas, NomInmComp);
        return reservas;
    }
    public static boolean altaReservas(Reserva objinm) {
        if (!reservas.contains(objinm)) {
            reservas.add(objinm);
            System.out.println("Reserva realizada a nombre de " + objinm.getCliente().getNombre() + " para el dia " + objinm.getFecha());
            return true;
        } else {
            return false;
        }

    }

    public static boolean bajaReservas(Reserva objinm) {
        if (reservas.contains(objinm)) {
            reservas.remove(objinm);
            return true;
        } else {
            return false;
        }
    }
    public static Reserva consultaReservas(int indice) {
        reserva = reservas.get(indice);
        return reserva;
    }

    /** Modifica los datos de una persona
     * @return boolean */
    

    public static void cargarDatosReservass() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamInm = new FileInputStream("copiasegRes.dat");
            ObjectInputStream oisInm = new ObjectInputStream(istreamInm);
            reservas = (ArrayList) oisInm.readObject();
            istreamInm.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos
    public static void guardarDatosReservass() {
        try {
            //Si hay datos los guardamos...
            if (!reservas.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las clientes
                FileOutputStream ostreamInm = new FileOutputStream("copiasegRes.dat");
                ObjectOutputStream oosInm = new ObjectOutputStream(ostreamInm);
                //guardamos el array de clientes
                oosInm.writeObject(reservas);
                ostreamInm.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static Reserva buscarReservasPorID(String id) {
    for (Reserva inmueble : reservas) {
        if (inmueble.getIdReserva().equals(id)) {
            return inmueble;
        }
    }
    return null; // Si no se encuentra el inmueble con el título especificado
}

    public static void generaFicha(Reserva res) throws IOException {
        // Ruta de la carpeta donde se guardarán las fichas
        String carpetaFichas = "./fichasReservas/";
        // Verificar si la carpeta existe, si no, crearla
        File carpeta = new File(carpetaFichas);
        if (!carpeta.exists()) {
            carpeta.mkdir(); // Crear la carpeta si no existe
        }
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(carpetaFichas + res.getInmueble().getTitulo() + res.getIdReserva() + ".txt")));
        
        salida.println("-------------------------------- Ficha ClienteBase --------------------------------");
        salida.println("\n");
        salida.println("Inmueble: " + res.getInmueble().getTitulo());
        salida.println("\n");
        salida.println("Fecha: " + res.getFecha());
        salida.println("\n");
        salida.println("Importe: " + res.getImporte());
        salida.println("\n");        
        salida.println("ID de la Reserva: " + res.getIdReserva());
        
        
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

