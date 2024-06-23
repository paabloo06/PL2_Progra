
package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

public class Inmueble implements Serializable {

    @Serial
    private static final long serialVersionUID = 3534235606559157077L;
    private ClienteBase anfitrion;
    private String titulo;
    private Direccion direccion;
    private DatosInmueble datosInmueble;
    private String tipoPropiedad;
    private double precioPorNoche;
    private String servicios;
    private String fotografia;
    private ArrayList<Puntuacion> puntuaciones;
    private int calificacionMedia;

    public Inmueble(String tituloNuevo, Direccion direccionNueva, DatosInmueble datosInmuebleNuevos, String tipoPropiedadNueva, double precioPorNocheNuevo, String serviciosNuevos, String fotografiaNueva, int calificacion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datosInmueble = datosInmueble;
        this.tipoPropiedad = tipoPropiedad;
        this.precioPorNoche = precioPorNoche;
        this.servicios = servicios;
        this.fotografia = fotografia;
        this.puntuaciones = new ArrayList<>();
        this.calificacionMedia = calificacion;

    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DatosInmueble getDatosInmueble() {
        return datosInmueble;
    }

    public void setDatosInmueble(DatosInmueble datosInmueble) {
        this.datosInmueble = datosInmueble;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
    
    
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Puntuacion> getPuntuaciones() {
        return puntuaciones;
    }

    public void setPuntuaciones(ArrayList<Puntuacion> puntuaciones) {
        this.puntuaciones = puntuaciones;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
    
    public int getCalificacionMedia() {
        if (puntuaciones == null || puntuaciones.isEmpty()) {
            return 0;
        }
        int sumaCalificaciones = 0;
        for (Puntuacion puntuacion : puntuaciones) {
            sumaCalificaciones += puntuacion.getCalificacion();
        }
        return sumaCalificaciones / puntuaciones.size();
    }

    public String getCalificacionMediaEstrellas() {
        int calificacionMedia = getCalificacionMedia();
        return Puntuacion.convertirCalificacionEnEstrellas(calificacionMedia);
    }

    public void agregarPuntuacion(Puntuacion nuevaPuntuacion) {
        this.puntuaciones.add(nuevaPuntuacion);
        this.calificacionMedia = getCalificacionMedia(); // Recalcular la calificación media
    }
    
    public ClienteBase getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(ClienteBase anfitrion) {
        this.anfitrion = anfitrion;
    }
    
    public Inmueble(String titulo, Direccion direccion, DatosInmueble datosInmueble, String tipoPropiedad, double precioPorNoche, String servicios, int calificacion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datosInmueble = datosInmueble;
        this.tipoPropiedad = tipoPropiedad;
        this.precioPorNoche = precioPorNoche;
        this.servicios = servicios;
        this.puntuaciones = new ArrayList<>();
        this.calificacionMedia = calificacion;

    }

    @Override
    public String toString() {
        return "Inmueble{" + "titulo=" + titulo + ", direccion=" + direccion + ", datosInmueble=" + datosInmueble + ", tipoPropiedad=" + tipoPropiedad + ", precioPorNoche=" + precioPorNoche + ", servicios=" + servicios + ", fotografia=" + fotografia + ", puntuaciones=" + puntuaciones + '}';
    }

}
 