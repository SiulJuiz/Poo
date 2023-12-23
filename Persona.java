/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deb;

/**
 *
 * @author luisl
 */


   abstract class Persona {
    public String nombre;
    public int edad;
    private int cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }
  
   
    public void Pcomer(){
        System.out.println(nombre +" está comiendo.");
    }
    
    public void Pdormir(){
        System.out.println(nombre +" está dormido.");
    }
    
    
}
