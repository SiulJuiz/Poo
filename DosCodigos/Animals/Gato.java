/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DosCodigos.Animals;

import DosCodigos.Animals.Animales;

/**
 *
 * @author luisl
 */
public class Gato extends Animales {
    public String colorpelo;

    public Gato(String colorpelo, String nombre, int edad) {
        super(nombre, edad);
        this.colorpelo = colorpelo;
    }
    public void trepar_arbol(){
        System.out.println("El gato "+nombre+" de color "+colorpelo+" está trepando el árbol");
    }
   public void cazar_raton(){
       System.out.println("El gato atrapó al ratón");
   }
    
}
