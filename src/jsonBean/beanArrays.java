/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;


/**
 *
 * @author HP
 */
public class beanArrays {
    String[] cursos;
    String[] carreras;
    String[] sesiones;
    
    public beanArrays(){
        
    }

    public beanArrays(String[] cursos, String[] carreras,String[] sesiones) {
        this.cursos = cursos;
        this.carreras = carreras;
        this.sesiones=sesiones;
    }

    public String[] getSesiones() {
        return sesiones;
    }

    public void setSesiones(String[] sesiones) {
        this.sesiones = sesiones;
    }
    

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[] getCarreras() {
        return carreras;
    }

    public void setCarreras(String[] carreras) {
        this.carreras = carreras;
    }

    

    @Override
    public String toString() {
        return "beanArrays{" + "cursos=" + cursos + ", carreras=" + carreras + '}';
    }
    
    
}
