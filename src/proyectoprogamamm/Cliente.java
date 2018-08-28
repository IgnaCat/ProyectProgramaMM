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
public class Cliente extends PersonaGym {
    private String fechaDia;
    private String fechaMes;
    private String fechaAño;
    //private Profesor profesor;
    private String profesor;
    private String direccion;
   

    public Cliente(String nombre, String apellido, String dni, String telefono, String fechaDia, String fechaMes, String fechaAño, String profesor, String direccion) {
        super(nombre, apellido, dni, telefono);
        this.fechaDia = fechaDia;
        this.fechaMes = fechaMes;
        this.fechaAño = fechaAño;
        this.profesor = profesor;
        this.direccion = direccion;

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

    
    
    public String[] getCampos(){
        String[] campos = new String[7];
        campos[0] = super.getNombre();
        campos[1] = super.getApellido();
        campos[2] = super.getDni();
        campos[3] = super.getTelefono();
        campos[4] = fechaDia + "/" + fechaMes + "/" + fechaAño;
        campos[5] = profesor;
        campos[6] = direccion;
       
        return campos;        
    }
        
}
