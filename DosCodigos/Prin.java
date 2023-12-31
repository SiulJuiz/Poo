/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DosCodigos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Prin {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        //ingreso de datos del pasajero
        System.out.println("Usted podrá crear un pasajero y un chofer\n"+"por favor ingrese los datos");
        //Se usa esta excepción para el ingreso de datos tanto del pasajero como del chofer 
        try{
            System.out.print("Ingrese el nombre del pasajero: ");
        String nom=sc.next();
        System.out.print("Ingrese el ID: ");
        int aid=sc.nextInt();
        System.out.print("Ingrese la edad: ");
        int age=sc.nextInt();
        System.out.print("Ingrese la cédula: ");
        int ced=sc.nextInt();
        Pasajero p1=new Pasajero(aid,nom,age,ced);
        p1.pedirtaxi();
        sc.nextLine();
         //ingreso de datos del chofer
        System.out.println("*****************");
        System.out.println("Ahora ingrese los datos del chofer");
        System.out.print("Ingrese el nombre del chofer: ");
        String name=sc.next();
        System.out.print("Ingrese la edad: ");
        int eda=sc.nextInt();
        System.out.print("Ingrese la cédula: ");
        int cedu=sc.nextInt();
        System.out.print("Ingrese la Placa del Taxi: ");
        String nplaca=sc.next();
        System.out.print("Ingrese el código del Taxi: ");
        int codtax=sc.nextInt();
        Chofer ch1=new Chofer(nplaca,codtax,name,eda,cedu);
        ch1.aceptarcarrera();
        //imprimir todos los datos
        //datos del pasajero
        System.out.println("Los datos que usted ingresó son: ");
        System.out.println("-------- Datos del Pasajero -----------");
        System.out.println("Nombre: "+p1.nombre);
        System.out.println("ID: "+p1.id);
        System.out.println("Edad: "+p1.edad);
        System.out.println("Cédula: "+p1.getCedula());
        //datos del chofer
        System.out.println("-------- Datos del Chofer -----------");
        System.out.println("Nombre: "+ch1.nombre);
        System.out.println("Edad: "+ch1.edad);
        System.out.println("Cédula: "+ch1.getCedula());
        System.out.println("Placa: "+ch1.Nplaca);
        System.out.println("Código del Taxi: "+ch1.codigotaxi);
        p1.cancelartaxi();
        ch1.cancelarcarrera();  
        }catch(InputMismatchException ec){
            System.out.println("Por favor ingrese datos que sean correctos");
        }//Finaliza la excepción con un mensaje al usuario
  
       
    }
    
}
