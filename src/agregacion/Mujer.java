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
public class Mujer extends Persona {
    
    public Mujer(String nombre,String apellido, int edad){
        super(nombre, apellido, edad);
    }
    public int diferenciaEdad(Persona persona){
        return Math.abs(this.edad - persona.getEdad());
    }
}
