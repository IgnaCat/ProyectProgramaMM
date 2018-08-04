
package proyectoprogamamm;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class NuevoCliente {
    
    private JFrame frame2;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblDni;
    private JLabel lblFechaDia;
    private JLabel lblFechaMes;
    private JLabel lblFechaAño;
    private JLabel lblProfesor;
    private JLabel lblDireccion;
    private JLabel lblTelefono;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDni;
    private JTextField txtFechaDia;
    private JTextField txtFechaMes;
    private JTextField txtFechaAño;
    private JTextField txtProfesor;
    private JTextField txtDireccion;
    private JTextField txtTelefono;

    public NuevoCliente(){
        
        frame2 = new JFrame("Nuevo Cliente");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setSize(800, 600);
        frame2.getContentPane().setBackground(Color.lightGray);
        frame2.setResizable(false);

        frame2.setLayout(null);
        
        lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(40, 30, 100, 30);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(110, 30, 160, 30);
        
        
        frame2.add(txtNombre);
        frame2.add(lblNombre);
        frame2.setVisible(
                true);
    }
    
 
    public void setVisible(boolean b){
        frame2.setVisible(b);
    }
    
}
