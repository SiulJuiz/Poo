/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DosCodigos.Animals;

import DosCodigos.Animals.Gato;
import DosCodigos.Animals.Perro;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Aniprincipal {
    public static void main (String []args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Usted podrá crear un gatito y un perrito");
        System.out.println("Por favor ingrese los datos");
        System.out.println("Datos del gatito: ");
        //Excepción para el ingreso de datos del gatito
        try{
            System.out.print("Nombre: ");
        String nom=entrada.next();
        System.out.print("Color de pelo: ");
        String pelo=entrada.nextLine();
        System.out.print("Edad (solo años del gatito): ");
        int eda=entrada.nextInt();
        Gato g1=new Gato(pelo,nom,eda);
        g1.cazar_raton();
        g1.trepar_arbol();
        entrada.nextLine();
        System.out.println("*************");
            
        }catch(InputMismatchException ex){
            System.out.println("!Ingrese datos correctos¡");
        //Exepción para el ingreso de datos del perrito
        }
        
        try{
            System.out.println("Ahora ingrese los datos del perro:");
        System.out.print("Nombre: ");
        String name=entrada.nextLine();
        System.out.print("Raza: ");
        String raza=entrada.nextLine();
        System.out.print("Edad (solo años del perrito): ");
        int age=entrada.nextInt();
        
        Perro p1=new Perro(name,raza,age);
        p1.correr();
        p1.jugar();
            
        }catch(InputMismatchException e){
            System.out.println("!Ingrese datos correctos¡");
        }
   
    }
}
