/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamamm;

/**
 *
 * @author ignacio
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private String telefono;
    private String clase;

    public Profesor(String nombre, String apellido, String telefono, String clase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.clase = clase;
    }

    public Profesor() {
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String[] getCampos(){
        String[] campos = new String[4];
        campos[0] = nombre;
        campos[1] = apellido;
        campos[2] = telefono;
        campos[3] = clase;
        return campos;        
    }
    
}
