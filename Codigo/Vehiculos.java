/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

/**
 *
 * @author luisl
 */
public class Vehiculos {
    public String marca,color;
    public int nllantas;
    private int km=1000;

    public Vehiculos(String marca, String color, int nllantas) {
        this.marca = marca;
        this.color = color;
        this.nllantas = nllantas;
        
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    

    public static void main (String []args){
        Carro c1=new Carro();
        System.out.println("Se imprimirán los vehículos: ");
        System.out.println("El carro"+ "\nMarca: " +c1.marca+"\nColor "+c1.color+"\nNúmero de llantas: "+c1.nllantas);
        System.out.println("\ny con kilometraje: "+c1.getKm()+"km");
        c1.mostrarCarro();
        System.out.println("************");
        Moto m1=new Moto();
        System.out.print("La moto"+ "\nMarca: " +m1.marca+"\nColor "+m1.color+"\nNúmero de llantas: "+m1.nllantas);
        System.out.println("\ny con kilometraje: "+m1.getKm()+"km");
        m1.mostrarMoto();
        
        
    }
    
}
