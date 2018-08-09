
package proyectoprogamamm;



public class ProyectoProgramaMM {
    
    public static Inicio inicio = new Inicio();
    public static Cliente cliente = new Cliente();
    public static NuevoCliente nuevoCliente = new NuevoCliente();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        inicio.setVisible(true);
    }
    
    public void abrirCliente(){
        cliente.setVisible(true);
    }
    public void abrirNuevoCliente(){
        nuevoCliente.setVisible(true);
    }
    public void cerrarCliente(){
        cliente.setVisible(false);
    }
    public void cerrarNuevoCliente(){
        nuevoCliente.setVisible(false);
    }
    
    public void agregarATabla(){
//        String[] arrayRow = new String[7];
//        arrayRow[0] = nuevoCliente.getTxtNombre().getText();
//        arrayRow[1] = nuevoCliente.getTxtApellido().getText();
//        arrayRow[2] = nuevoCliente.getTxtDni().getText();
//        arrayRow[3] = nuevoCliente.getTxtFechaDia().getText() + "/" + nuevoCliente.getTxtFechaMes().getText() + "/" + nuevoCliente.getTxtFechaAño().getText();
//        arrayRow[4] = nuevoCliente.getTxtProfesor().getText();
//        arrayRow[5] = nuevoCliente.getTxtDireccion().getText();
//        arrayRow[6] = nuevoCliente.getTxtTelefono().getText();
//        return arrayRow;
        cliente.getModel().addRow(new Object[]{ nuevoCliente.getTxtNombre().getText(), nuevoCliente.getTxtApellido().getText()});

        
    }
    
}
