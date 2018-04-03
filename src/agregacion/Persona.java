/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion;

/**
 *
 * @author Estudiante
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    private Persona casadoCon;
    

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public int getEdad() {
        return edad;
    }
    
    public void setCasadoCon(Persona casadoCon){
        this.casadoCon = casadoCon;
    }
    
    public static int diferenciaEdad(Persona persona1,Persona persona2){
        return Math.abs(persona1.getEdad()-persona2.getEdad());
    }
    public String mostrarInfo(){
       String info = nombre +" "+ apellido + " tiene "+ edad + " años.";
       
        return info;
    }
    
    }
    

