/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deb;

/**
 *
 * @author luisl
 */
public class Cuidador extends Persona{
    public int nid;

    public Cuidador(int nid, String nombre, int edad, int cedula) {
        super(nombre, edad, cedula);
        this.nid = nid;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }
    
    public void alimentar_animales(){
        System.out.println("El cuidador: "+ nombre+" con el número de ID "+nid);
    }
}
