package proyectoprogamamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NuevoProfesor {

    private JFrame frame2;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblTelefono;
    private JLabel lblClase;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtTelefono;
    private JTextField txtClase;
    private JButton btnCancelar;
    private JButton btnAgregar;
    private JLabel lblDni;
    private JTextField txtDni;
    private final VentanaTablaProfesor parent;

    public NuevoProfesor(VentanaTablaProfesor pp) {
        parent = pp;
        frame2 = new JFrame("Nuevo Profesor");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setSize(390, 450);
        frame2.getContentPane().setBackground(Color.ORANGE);
        frame2.setResizable(false);

        frame2.setLayout(null);

        lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(40, 30, 100, 30);

        lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(40, 30, 100, 150);

        lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(40, 30, 100, 270);

        lblClase = new JLabel("Tipo De Clase");
        lblClase.setBounds(10, 30, 100, 400);

        lblDni = new JLabel("Dni");
        lblDni.setBounds(40, 30, 100, 520);

        txtNombre = new JTextField();
        txtNombre.setBounds(110, 30, 160, 30);

        txtApellido = new JTextField();
        txtApellido.setBounds(110, 90, 160, 30);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(110, 150, 160, 30);

        txtClase = new JTextField();
        txtClase.setBounds(110, 210, 160, 30);

        txtDni = new JTextField();
        txtDni.setBounds(110, 270, 160, 30);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(50, 330, 100, 25);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(190, 330, 100, 25);

        btnCancelar.addActionListener(
                (ActionEvent e) -> {
                    frame2.setVisible(false);
                }
        );

        btnAgregar.addActionListener(
                (ActionEvent e) -> {
                    agregar1();
                }
        );

        frame2.add(txtNombre);
        frame2.add(lblNombre);
        frame2.add(lblApellido);
        frame2.add(txtApellido);
        frame2.add(lblTelefono);
        frame2.add(txtTelefono);
        frame2.add(btnAgregar);
        frame2.add(btnCancelar);
        frame2.add(lblClase);
        frame2.add(txtClase);
        frame2.add(lblDni);
        frame2.add(txtDni);

        frame2.setVisible(
                true);
    }

//    NuevoProfesor(VentanaTablaProfesor pp) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public void setVisible(boolean b) {
        frame2.setVisible(b);
    }

    public JFrame getFrame2() {
        return frame2;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public JLabel getLblApellido() {
        return lblApellido;
    }

    public JLabel getLblTelefono() {
        return lblTelefono;
    }

    public JLabel getLblClase() {
        return lblClase;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public JTextField getTxtClase() {
        return txtClase;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JLabel getLblDni() {
        return lblDni;
    }

    public void setLblDni(JLabel lblDni) {
        this.lblDni = lblDni;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public void setTxtDni(JTextField txtDni) {
        this.txtDni = txtDni;
    }

    public void agregar1() {
        frame2.setVisible(false);
        Profesor profe = new Profesor(getTxtNombre().getText(),
                getTxtApellido().getText(),
                getTxtTelefono().getText(),
                getTxtDni().getText(),
                getTxtClase().getText());
        parent.addClienteRow(profe.getCampos());
    }

}
