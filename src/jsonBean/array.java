/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

import java.util.List;

/**
 *
 * @author HP
 */
public class array extends datos{
    datos[] dato;
    
    public array(){
        
    }

    public array(datos[] dato) {
        this.dato = dato;
    }

    public datos[] getDato() {
        return dato;
    }

    public void setDato(datos[] dato) {
        this.dato = dato;
    }
    
    

    @Override
    public String toString() {
        return "array{" + "dato=" + dato + '}';
    }
    
    
}
