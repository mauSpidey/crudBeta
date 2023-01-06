/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

/**
 *
 * @author HP
 */
public class fecha {
    String fecha,id;
    public fecha(){
        
    }

    public fecha(String fecha, String id) {
        this.fecha = fecha;
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "fecha{" + "fecha=" + fecha + ", id=" + id + '}';
    }

    
    
}
