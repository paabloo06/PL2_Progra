package model;

import controller.SessionManager;
import java.io.Serial;
import java.io.Serializable;

public class ClienteBase extends UsuarioBase implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 4187524878138390919L;
    
    private String nombre;
    private String dni;
    private  String telefono;
    
    public ClienteBase() {
        super();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public ClienteBase(String correo, String clave, String dni, UsuarioBase.Rol rol, String nombre, String telefono) {
        super(correo, clave, rol);
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ClienteBase(String nombre, String dni, UsuarioBase.Rol rol, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }
    public static ClienteBase obtenerClienteActual() {
        return SessionManager.getInstance().getClienteActual(); 
    }
    @Override
    public String toString() {
        return "CLIENTES{" + "Correo=" + getCorreo() + ", Clave=" + getContrasena() + ", Nombre=" + nombre + ", Telefono=" + telefono + '}';
    }
}
