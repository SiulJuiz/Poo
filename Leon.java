/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deb;

/**
 *
 * @author luisl
 */
public class Leon extends Zoo{
    public String vacuna;

    public Leon(String vacuna, String nombre, int edad, int nregistro) {
        super(nombre, edad, nregistro);
        this.vacuna = vacuna;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }
    

    
    
    public void Rugir(){
        System.out.println(nombre +" está rugiendo");
    }
    public void Cazar(){
        System.out.println(nombre+" sabe cazar a su presa");
    }
}
