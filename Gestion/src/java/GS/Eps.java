/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GS;

/**
 *
 * @author Profesional
 */
public class Eps{
    private String nombreEPS;

    public String getNombreEPS() {
        return nombreEPS;
    }

    public Eps(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }
    public void mostrar(){
        System.out.println("EPS: "+getNombreEPS());
    }
}
