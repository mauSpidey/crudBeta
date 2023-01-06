/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class registroCollection {
    ArrayList<registro> registro;
    public registroCollection(){
        
    }

    public registroCollection(ArrayList<registro> registro) {
        this.registro = registro;
    }

    public ArrayList<registro> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<registro> registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "registroCollection{" + "registro=" + registro + '}';
    }
    
}
