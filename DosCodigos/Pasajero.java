/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DosCodigos;

/**
 *
 * @author luisl
 */
public class Pasajero extends Persona {
    public int id;

    public Pasajero(int id, String nombre, int edad, int cedula) {
        super(nombre, edad, cedula);
        this.id = id;
    }


    public void pedirtaxi(){
        System.out.println(nombre+" el Taxi va en camino");
    }
    public void cancelartaxi(){
        System.out.println("Ha cancelado el viaje");
        System.out.println(nombre+" con cédula: "+getCedula());
    }
}
