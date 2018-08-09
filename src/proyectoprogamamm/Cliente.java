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
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaDia;
    private String fechaMes;
    private String fechaAño;
    //private Profesor profesor;
    private String profesor;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String apellido, String dni, String fechaDia, String fechaMes, String fechaAño, String profesor, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaDia = fechaDia;
        this.fechaMes = fechaMes;
        this.fechaAño = fechaAño;
        this.profesor = profesor;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(String fechaDia) {
        this.fechaDia = fechaDia;
    }

    public String getFechaMes() {
        return fechaMes;
    }

    public void setFechaMes(String fechaMes) {
        this.fechaMes = fechaMes;
    }

    public String getFechaAño() {
        return fechaAño;
    }

    public void setFechaAño(String fechaAño) {
        this.fechaAño = fechaAño;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String[] getCampos(){
        String[] campos = new String[7];
        campos[0] = nombre;
        campos[1] = apellido;
        campos[2] = dni;
        campos[3] = fechaDia + "/" + fechaMes + "/" + fechaAño + "/";
        campos[4] = profesor;
        campos[5] = direccion;
        campos[6] = telefono;
        return campos;        
    }
        
}
