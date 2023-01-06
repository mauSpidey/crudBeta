/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

/**
 *
 * @author HP
 */
public class info {
    String id,nombre,apellido,dni,entrada,estado_entrada,salida,estado_salida;
    public info(){
        
    }

    public info(String id, String nombre, String apellido, String dni, String entrada, String estado_entrada, String salida, String estado_salida) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.entrada = entrada;
        this.estado_entrada = estado_entrada;
        this.salida = salida;
        this.estado_salida = estado_salida;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getEstado_entrada() {
        return estado_entrada;
    }

    public void setEstado_entrada(String estado_entrada) {
        this.estado_entrada = estado_entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getEstado_salida() {
        return estado_salida;
    }

    public void setEstado_salida(String estado_salida) {
        this.estado_salida = estado_salida;
    }

    @Override
    public String toString() {
        return "info{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", entrada=" + entrada + ", estado_entrada=" + estado_entrada + ", salida=" + salida + ", estado_salida=" + estado_salida + '}';
    }
    
}
