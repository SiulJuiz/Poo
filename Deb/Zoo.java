/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deb;

/**
 *
 * @author luisl
 */
abstract class Zoo extends Principal{
    public String nombre;
    public int edad;
    private int nregistro;

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

    public int getNregistro() {
        return nregistro;
    }

    public void setNregistro(int nregistro) {
        this.nregistro = nregistro;
    }

    public Zoo(String nombre, int edad, int nregistro) {
        this.nombre = nombre;
        this.edad = edad;
        this.nregistro = nregistro;
    }
    
    
    
    public void Zoocomer(){
        System.out.println(nombre+"está comiendo");
    }
    public void Zoodormir(){
        System.out.println(nombre+"está dormido");
    }
    
}
