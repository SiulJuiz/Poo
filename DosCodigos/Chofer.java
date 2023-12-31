/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DosCodigos;

/**
 *
 * @author luisl
 */
public class Chofer extends Persona{
    public String Nplaca;
    public int codigotaxi;

    public Chofer(String Nplaca, int codigotaxi, String nombre, int edad, int cedula) {
        super(nombre, edad, cedula);
        this.Nplaca = Nplaca;
        this.codigotaxi = codigotaxi;
    }
    public void aceptarcarrera(){
        System.out.println(nombre+" ha aceptado la carrera y está en camino");
        
    }
    public void cancelarcarrera(){
        System.out.println("El chofer "+ nombre+" ha cancelado");
    }
}
