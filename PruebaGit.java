/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebagit;

import java.util.Scanner;

/**
 *
 * @author luisl
 */
import java.util.Scanner;
public class PruebaGit {
public static void main(String []args){
        double a,b,c,d,e,f,g,h,n,i,j,x,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Se calculara la ecuacion de segundo grado");
        System.out.println("Usando la fórmula general ax^2+bx+c=0");
        System.out.println("Ingrese a:");
        a=sc.nextDouble();
        System.out.println("Ingrese b:");
        b=sc.nextDouble();
        System.out.println("Ingrese c:");
        c=sc.nextDouble();
        System.out.println("Calculando tenemos:");
        d=b*-1;
        f=Math.pow(b, 2);
        g=(a*c)*-4;
        h=f+g;
        e=Math.sqrt(h);
        n=d+e;
        x=d-e;
        i=2*a;
        j=n/i;
        z=x/i;
        System.out.println("El resultado de la operación es:"+j+"o \n es: "+z);
      
    }


}