package GS;

import GS.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Profesional
 */
public class Main {

    public static void main(String[] args) {
        Paciente pa = new Paciente("CARLOS", "BERMUDEZ", "CALLE16#3-06", "COVID-19", "DR.JORGE GONZALES", "FAMISANAR", "30-SEP-2022", 1, 'M');
        pa.mostrar();
        System.out.println("\n");
        Paciente pa1 = new Paciente("SOFIA", "ROSERO", "CALLE20#8-06", "VARICELA", "DRA.YEIMMY OCHOA", "ECOOPSOS", "31-SEP-2022", 2, 'F');
        pa1.mostrar();
        System.out.println("\n");
        Doctor dr = new Doctor("JORGE", "GONZALES");
        dr.mostrar();
        System.out.println("\n");
        Doctor dr1 = new Doctor("YEIMMY", "OCHOA");
        dr1.mostrar();
        System.out.println("\n");
        Eps eps =  new Eps ("ECOOPSOS");
        eps.mostrar();
        System.out.println("\n");
        Eps eps1=new Eps ("FAMISANAR");
        eps1.mostrar();
        System.out.println("\n");
        
    }
}
