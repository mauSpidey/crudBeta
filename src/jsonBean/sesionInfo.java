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
public class sesionInfo {
    ArrayList<info> info;
    String id;
    
    public sesionInfo(){
        
    }

    public sesionInfo(ArrayList<info> info, String id) {
        this.info = info;
        this.id = id;
    }

    public ArrayList<info> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<info> info) {
        this.info = info;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "sesionInfo{" + "info=" + info + ", id=" + id + '}';
    }
    
    
}
