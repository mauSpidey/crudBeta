/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

/**
 *
 * @author HP
 */
public class datos {
    String max, id_curso,id_carrera,maxSesion;
    
    public datos(){
        
    }

    public datos(String max, String id_curso, String id_carrera,String maxSesion) {
        this.max = max;
        this.id_curso = id_curso;
        this.id_carrera = id_carrera;
        this.maxSesion=maxSesion;
    }

    public String getMaxSesion() {
        return maxSesion;
    }

    public void setMaxSesion(String maxSesion) {
        this.maxSesion = maxSesion;
    }
    
    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public String getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(String id_carrera) {
        this.id_carrera = id_carrera;
    }

    @Override
    public String toString() {
        return "datos{" + "max=" + max + ", id_curso=" + id_curso + ", id_carrera=" + id_carrera + '}';
    }


    
    
    
    
}
