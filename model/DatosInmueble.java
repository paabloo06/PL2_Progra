
package model;

import java.io.Serial;
import java.io.Serializable;


public class DatosInmueble implements Serializable{
    
    @Serial
    private static final long serialVersionUID = -5560288983675830078L;
    
    private int huespedes;
    private Anfitrion anfitrion;

    public int getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(int huespedes) {
        this.huespedes = huespedes;
    }
    
    private int habitaciones;

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    private int camas;

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }
    
    private int baños;

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public DatosInmueble(int huespedes, int habitaciones, int camas, int baños) {
        this.huespedes = huespedes;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.baños = baños;
    }
    
}
