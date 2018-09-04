package proyectoprogamamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


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
    private JComboBox txtProfesor;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JLabel lblFecha;
    private JButton btnCancelar;
    private JButton btnAgregar;
    private final VentanaTablaClientes parent;
    private NuevoProfesor nuevoprofesor;
    private static final String file2 = "Gym/profesor.txt";
    private static final String vacio = "empty";

    public NuevoCliente(VentanaTablaClientes p) {
        parent = p;
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

        txtProfesor = new JComboBox();
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
                    agregar();
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

    public JLabel getLblDni() {
        return lblDni;
    }

    public JLabel getLblFechaDia() {
        return lblFechaDia;
    }

    public JLabel getLblFechaMes() {
        return lblFechaMes;
    }

    public JLabel getLblFechaAño() {
        return lblFechaAño;
    }

    public JLabel getLblProfesor() {
        return lblProfesor;
    }

    public JLabel getLblDireccion() {
        return lblDireccion;
    }

    public JLabel getLblTelefono() {
        return lblTelefono;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public JTextField getTxtFechaDia() {
        return txtFechaDia;
    }

    public JTextField getTxtFechaMes() {
        return txtFechaMes;
    }

    public JTextField getTxtFechaAño() {
        return txtFechaAño;
    }

    public JComboBox getTxtProfesor() {
        return txtProfesor;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void importarProfesor() {
        try {
            String line = null;
            BufferedReader br = new BufferedReader(new FileReader(file2));

            while ((line = br.readLine()) != null) {
                Vector data = new Vector();
                StringTokenizer st1 = new StringTokenizer(line, " - ");
                String nextToken = st1.nextToken();
                txtProfesor.addItem(nextToken); 
                if (!nextToken.equals(vacio)) {
                    data.add(nextToken);
                } else {
                    data.add(null);
                }
                System.out.println(nextToken);

            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregar() {
        frame2.setVisible(false);
        Cliente client = new Cliente(getTxtNombre().getText(),
                getTxtApellido().getText(),
                getTxtDni().getText(),
                getTxtTelefono().getText(),
                getTxtFechaDia().getText(),
                getTxtFechaMes().getText(),
                getTxtFechaAño().getText(),
                getTxtProfesor().getSelectedItem().toString(),
                getTxtDireccion().getText());

        parent.addClienteRow(client.getCampos());
    }
}
