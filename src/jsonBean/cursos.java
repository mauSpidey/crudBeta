/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonBean;

/**
 *
 * @author HP
 */
public class cursos {
    String[] cursos;
    public cursos(){
        
    }

    public cursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "cursos{" + "cursos=" + cursos + '}';
    }
    
}
