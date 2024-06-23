
package model;

import java.io.Serial;
import java.io.Serializable;

public class ClienteParticular extends ClienteBase implements Serializable {


    @Serial
    private static final long serialVersionUID = -5560288983675830063L;
    
    boolean VIP;
    private TarjetaCredito tarjeta;
    
    public ClienteParticular() {
        super();
        setRol(UsuarioBase.Rol.Particular);
    }

    public ClienteParticular(boolean VIP, TarjetaCredito tarjeta, String correo, String clave, String dni, Rol rol, String nombre, String telefono) {
        super(correo, clave, dni, rol, nombre, telefono);
        this.VIP = VIP;
        this.tarjeta = tarjeta;
    }
    
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }


}