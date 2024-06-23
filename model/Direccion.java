
package model;


import java.io.Serial;
import java.io.Serializable;

public class Direccion implements Serializable {
    @Serial
    private static final long serialVersionUID = -8827799079058489624L;

    private String calle;
    private String numero;
    private String cp;
    private String ciudad;
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String Calle) {
        this.calle = Calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public String getCodigoPostal() {
        return cp;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.cp= CodigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }


    public Direccion(String Calle, String Numero, String CodigoPostal, String Ciudad) {
        this.calle = Calle;
        this.numero = Numero;
        this.cp = CodigoPostal;
        this.ciudad = Ciudad;
    }
    
    @Override
    public String toString() {
        return "Calle: " + calle + ", Número: " + numero + ", Código Postal: " + cp + ", Ciudad: " + ciudad;
    }
    
    
}
