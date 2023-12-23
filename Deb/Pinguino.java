/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deb;

/**
 *
 * @author luisl
 */
public class Pinguino extends Zoo{

    public Pinguino(String nombre, int edad, int nregistro) {
        super(nombre, edad, nregistro);
    }
    
    
    public void Nadar(){
        System.out.println(nombre+" sabe nadar muy bien");
        
    }
    public void Pezcar(){
        System.out.println(nombre+" es hábil en la pesca");
        
    }
    
    
}
