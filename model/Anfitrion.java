package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Anfitrion extends ClienteBase implements Serializable {

    @Serial
    private static final long serialVersionUID = 2837603243841441928L;

    Date fechaRegistro;
    boolean superAnfitrion;
    private ArrayList<Inmueble> inmueblesPropios;
    

    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public boolean isSuperAnfitrion() {
        return superAnfitrion;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
     
    public Anfitrion() {
        super();
        inmueblesPropios = new ArrayList<>();
        setRol(UsuarioBase.Rol.Anfitrion);
    }

    public Anfitrion(Date fechaRegistro, boolean superAnfitrion, String correo, String clave, String dni, Rol rol, String nombre, String telefono) {
        super(correo, clave, dni, rol, nombre, telefono);
        this.fechaRegistro = fechaRegistro;
        this.superAnfitrion = superAnfitrion;
    }
    
    public boolean esSuperAnfitrion(List<Inmueble> alojamientos) {
        double sumaResenas = 0;
        int contadorResenas = 0;

        for (Inmueble alojamiento : alojamientos) {
            for (Puntuacion resena : alojamiento.getPuntuaciones()) {
                sumaResenas += resena.getCalificacion();
                contadorResenas++;
            }
        }

        double mediaResenas = sumaResenas / contadorResenas;
        return mediaResenas > 4.0;
    }
    
    public void agregarAlojamiento(Inmueble inmueble) {
        inmueblesPropios.add(inmueble);
    }

}
