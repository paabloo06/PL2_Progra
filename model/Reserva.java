
package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{
    
    @Serial
    private static final long serialVersionUID = 3534235606559157089L;
    
    private String idReserva;
    private ClienteParticular cliente;
    private Inmueble inmueble;
    private Date fecha;
    private double importe;

    public Reserva(String idReserva, ClienteParticular cliente, Inmueble inmueble, Date fecha, double importe) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.inmueble = inmueble;
        this.fecha = fecha;
        this.importe = importe;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public ClienteParticular getCliente() {
        return cliente;
    }

    public void setCliente(ClienteParticular cliente) {
        this.cliente = cliente;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
