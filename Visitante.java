/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deb;

/**
 *
 * @author luisl
 */
public class Visitante extends Persona {
    public int ncarnet;

    public Visitante(int ncarnet, String nombre, int edad, int cedula) {
        super(nombre, edad, cedula);
        this.ncarnet = ncarnet;
    }

    public int getNcarnet() {
        return ncarnet;
    }

    public void setNcarnet(int ncarnet) {
        this.ncarnet = ncarnet;
    }

  
    
    public void Vcomprar(){
        System.out.println("¡"+nombre+" ha realizado bien la compra¡");
    }
    
}
