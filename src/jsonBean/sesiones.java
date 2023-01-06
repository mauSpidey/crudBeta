/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

/**
 *
 * @author HP
 */
public class sesiones {
    String [] sesiones;
    public sesiones(){
        
    }

    public sesiones(String[] sesiones) {
        this.sesiones = sesiones;
    }

    public String[] getSesiones() {
        return sesiones;
    }

    public void setSesiones(String[] sesiones) {
        this.sesiones = sesiones;
    }

    @Override
    public String toString() {
        return "sesiones{" + "sesiones=" + sesiones + '}';
    }
    
}
