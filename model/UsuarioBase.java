
package model;

import java.io.Serial;
import java.io.Serializable;


public class UsuarioBase implements Serializable {

    @Serial
    private static final long serialVersionUID = 1513555783268590371L;

    public UsuarioBase() {}

    public enum Rol {Particular, Anfitrion}

    private String correo;
    private String contrasena;
    private Rol rol;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String Clave) {
        this.contrasena = Clave;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Correo=" + correo + ", Clave=" + contrasena + '}';
    }

    public UsuarioBase(String Correo, String contrasena, Rol rol) {
        this.correo = Correo;
        this.contrasena = contrasena;
        this.rol = rol;
    }


}
