/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GS;

/**
 *
 * @author Profesional
 */
public class Doctor extends Persona{
    public Doctor (String Nombre, String Apellido){
        super(Nombre, Apellido);
    }
     public void mostrar(){
        System.out.println("Doctor: "+getNombre()+" "+getApellido());
               
    }
    
}
