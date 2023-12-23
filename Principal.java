/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deb;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Principal {
    public static void main (String []args){
        System.out.println("----- Bienvenido al sistema ---------");
        Scanner sc=new Scanner(System.in);

        try{
            //datos del visitante
            System.out.print("Ingrese el nombre del visitante: ");
            String nombreVisitante = sc.next();
            System.out.print("Ingrese la edad del visitante: ");
            int edadVisitante = sc.nextInt();
            System.out.print("Ingrese la cédula del visitante: ");
            int cedulaVisitante = sc.nextInt();
            System.out.print("Ingrese el número de carnet del visitante: ");
            int ncarnet = sc.nextInt();

            Visitante vo = new Visitante(ncarnet, nombreVisitante, edadVisitante, cedulaVisitante);
            System.out.println("El visitante se ha creado correctamente.");
            vo.Vcomprar();
            System.out.println("*************Usted ingreso lo siguiente***********");
            System.out.println("\nDatos del visitante:");
            System.out.println("Nombre: " + vo.getNombre());
            System.out.println("Edad: " + vo.getEdad());
            System.out.println("Cédula: " + vo.getCedula());
            System.out.println("Número de carnet: " + vo.getNcarnet());
            
            //datos del leon
            sc.nextLine(); // Limpiar el buffer
            System.out.print("\nIngrese la vacuna del león: ");
            String vacunaLeon = sc.next();
            System.out.print("Ingrese el nombre del león: ");
            String nombreLeon = sc.next();
            System.out.print("Ingrese la edad del león: ");
            int edadLeon = sc.nextInt();
            System.out.print("Ingrese el número de registro del león: ");
            int nregistroLeon = sc.nextInt();

            Leon leo = new Leon(vacunaLeon, nombreLeon, edadLeon, nregistroLeon);
            System.out.println("El león se ha creado correctamente.");
            System.out.println("*************Usted ingreso lo siguiente***********");
            System.out.println("\nDatos del León:");
            System.out.println("Vacuna: " + leo.getVacuna());
            System.out.println("Nombre: " + leo.getNombre());
            System.out.println("Edad: " + leo.getEdad());
            System.out.println("Número de carnet: " + leo.getNregistro());
            leo.Rugir();
            leo.Cazar();
            
        }catch(InputMismatchException ex){
            System.out.println("Ingrese valores correctos ");
        }
        System.out.println("El visitante se ha creado");
        

        try{
            //datos del cuidador
            System.out.print("Ingrese el nombre del cuidador: ");
            String nombreCuidad = sc.next();
            System.out.print("Ingrese la edad del cuidador: ");
            int edadCuidad = sc.nextInt();
            System.out.print("Ingrese la cédula del cuidador: ");
            int cedulaCuidad = sc.nextInt();
            System.out.print("Ingrese el número de carnet del cuidador: ");
            int nidCuidad = sc.nextInt();

            Cuidador cui = new Cuidador(nidCuidad, nombreCuidad, edadCuidad, cedulaCuidad);
            System.out.println("*************Usted ingreso lo siguiente***********");
            System.out.println("\nDatos del visitante:");
            System.out.println("Nombre: " + cui.getNombre());
            System.out.println("Edad: " + cui.getEdad());
            System.out.println("Cédula: " + cui.getCedula());
            System.out.println("Número de carnet: " + cui.getNid());
            cui.alimentar_animales();
            
            //datos del pinguino
            
            System.out.print("Ingrese el nombre del pinguino: ");
            String nombrePingui = sc.next();
            System.out.print("Ingrese la edad del pinguino: ");
            int edadPingui = sc.nextInt();
            System.out.print("Ingrese el número de registro del pinguino: ");
            int nregistroPingui = sc.nextInt();
            Pinguino pi = new Pinguino(nombrePingui, edadPingui, nregistroPingui);
            System.out.println("*************Usted ingreso lo siguiente***********");
            System.out.println("\nDatos del León:");
            System.out.println("Nombre: " + pi.getNombre());
            System.out.println("Edad: " + pi.getEdad());
            System.out.println("Número de carnet: " + pi.getNregistro());
            pi.Nadar();
            pi.Pezcar();
            
        }catch(InputMismatchException ex){
            System.out.println("Ingrese valores correctos ");
        }
        System.out.println("El cuidador se ha creado");
       
        
        
    }
   
    
}
