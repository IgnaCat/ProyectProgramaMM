
package proyectoprogamamm;


public class Profesor extends PersonaGym {
 
    private String clase;

    public Profesor(String nombre, String apellido, String dni, String telefono, String clase) {
       super(nombre, apellido, dni, telefono);
        this.clase = clase;
    }

    public Profesor() {
    }
   
    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String[] getCampos(){
        String[] campos = new String[5];
        campos[0] = super.getNombre();
        campos[1] = super.getApellido();
        campos[2] = super.getDni();
        campos[3] = super.getTelefono();
        campos[4] = clase;
        
        return campos;        
    }
    
}
