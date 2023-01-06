/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

/**
 *
 * @author HP
 */
public class curso extends beanArrays{
    String curso;
    
    public curso(){
        
    }

    public curso(String curso) {
        this.curso = curso;

    }

    public String getCurso() {
        return curso;
    }



    @Override
    public String toString() {
        return "jsonBean{" + "curso=" + curso + '}';
    }
}
