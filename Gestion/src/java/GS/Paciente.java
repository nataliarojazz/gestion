/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GS;

/**
 *
 * @author Profesional
 */
public class Paciente extends Persona{
    private final String direccion;
    private final String motivo;
    private final String medico;
    private final String eps;
    private final String fecha;
    private final int codigo;
    private char sexo;

    public Paciente(String nombre, String apellido, String direccion, String motivo, String medico, String eps, String fecha, int codigo, char sexo) {
        super(nombre,apellido);
        this.direccion = direccion;
        this.motivo = motivo;
        this.medico = medico;
        this.eps = eps;
        this.fecha = fecha;
        this.codigo = codigo;
        this.sexo = sexo;
    }
    @Override
    public void mostrar(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nDireccion: "+direccion+
                "\nMotivo Consulta: "+motivo+
                "\nMedico: "+medico+
                "\nEPS: "+eps+
                "\nfecha: "+fecha+
                "\nCodigo: "+codigo+
                "\nSexo: "+sexo);
               
    }
    
    public String mostrar2(){
        return ("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nDireccion: "+direccion+
                "\nMotivo Consulta: "+motivo+
                "\nMedico: "+medico+
                "\nEPS: "+eps+
                "\nfecha: "+fecha+
                "\nCodigo: "+codigo+
                "\nSexo: "+sexo);
    }
}
