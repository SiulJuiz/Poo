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
public class Perro extends Animales {
    public String raza;

    public Perro(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }
    public void correr(){
        System.out.println("El perro está corriendo");
        
    }
    public void jugar(){
        System.out.println("El perro está jugando con su pelota");
    }
    
}
