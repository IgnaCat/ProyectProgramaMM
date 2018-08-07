
package proyectoprogamamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
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
    private JLabel lblFecha;
    private JButton btnCancelar;
    private JButton btnAgregar;
    


    public NuevoCliente(){
        
        frame2 = new JFrame("Nuevo Cliente");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setSize(800, 600);
        frame2.getContentPane().setBackground(Color.ORANGE);
        frame2.setResizable(false);

        frame2.setLayout(null);
        
        lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(40, 30, 100, 30);
        
        lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(40, 30, 100, 150);
        
        lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(40, 30, 100, 270);
        
        lblDireccion = new JLabel("Direccion");
        lblDireccion.setBounds(40, 30, 100, 390);
        
        lblFechaAño = new JLabel("Año");
        lblFechaAño.setBounds(300, 30, 100, 510);
        
        lblFechaDia = new JLabel("Dia");
        lblFechaDia.setBounds(100, 30, 100, 510);
        
        lblFechaMes = new JLabel("Mes");
        lblFechaMes.setBounds(200, 30, 100, 510);
        
        lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(40, 30, 100, 510);
        
        lblProfesor = new JLabel("Profesor");
        lblProfesor.setBounds(450, 30, 100, 30);
        
        lblDni = new JLabel("DNI");
        lblDni.setBounds(475, 30, 100, 150);
        
        
        
        txtNombre = new JTextField();
        txtNombre.setBounds(110, 30, 160, 30);
        
        txtApellido = new JTextField();
        txtApellido.setBounds(110, 90, 160, 30);
        
        txtTelefono = new JTextField();
        txtTelefono.setBounds(110, 150, 160, 30);
        
        txtDireccion = new JTextField();
        txtDireccion.setBounds(110, 210, 160, 30);
        
        txtFechaDia = new JTextField();
        txtFechaDia.setBounds(130, 270, 60, 30);
        
        txtFechaMes = new JTextField();
        txtFechaMes.setBounds(235, 270, 60, 30);
        
        txtFechaAño = new JTextField();
        txtFechaAño.setBounds(340, 270, 60, 30);
        
        txtProfesor = new JTextField();
        txtProfesor.setBounds(525, 30, 160, 30);
        
        txtDni = new JTextField();
        txtDni.setBounds(525, 90, 160, 30);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(450, 270, 100, 25);
        
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(600, 270, 100, 25);
        
       btnCancelar.addActionListener(
                (ActionEvent e) -> {
                    frame2.setVisible(false);
               }
        );
       
       btnAgregar.addActionListener(
                (ActionEvent e) -> {
                    
               }
        );
       
       
        
       
        
        
        frame2.add(txtNombre);
        frame2.add(lblNombre);
        frame2.add(lblApellido);
        frame2.add(txtApellido);
        frame2.add(lblTelefono);
        frame2.add(txtTelefono);
        frame2.add(lblDireccion);
        frame2.add(txtDireccion);
        frame2.add(lblFecha);
        frame2.add(lblFechaAño);
        frame2.add(lblFechaDia);
        frame2.add(lblFechaMes);
        frame2.add(txtFechaMes);
        frame2.add(txtFechaDia);
        frame2.add(txtFechaAño);
        frame2.add(btnAgregar);
        frame2.add(btnCancelar);
        frame2.add(lblProfesor);
        frame2.add(lblDni);
        frame2.add(txtProfesor);
        frame2.add(txtDni);
        
        frame2.setVisible(
                true);
    }
    
 
    public void setVisible(boolean b){
        frame2.setVisible(b);
    }
    
}
