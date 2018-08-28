package proyectoprogamamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class VentanaTablaProfesor {

    private JFrame frame1;
    private JTable table;
    private JScrollPane scroll;
    private JTextField txtBuscar;
    private DefaultTableModel model = new DefaultTableModel();
    ;
    private VentanaTablaProfesor pp = this;
    private JComboBox comboBuscar;
    private JLabel lblBuscar;
    private TableRowSorter trsFiltro;
    private static final String file1 = "Gym/profesor.txt";
    private static final String vacio = "empty";

//    private static NuevoCliente nuevoCliente = new NuevoCliente();
    public VentanaTablaProfesor() {
        frame1 = new JFrame("Profesor");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1000, 600);
        frame1.getContentPane().setBackground(Color.lightGray);
        frame1.setResizable(false);

        frame1.setLayout(null);

        table = new JTable(model);
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Telefono");
        model.addColumn("Dni");
        model.addColumn("Tipo de Clase");

//        model.addRow(new Object[]{"lol"});
        table.setFont(new java.awt.Font("Tahoma", 30, 15));
        table.setRowHeight(25);
//        table.getColumnModel().getColumn(0).setPreferredWidth(200);       

        scroll = new JScrollPane(table);
        scroll.setBounds(300, 25, 640, 500);

        JButton btnNuevoProfesor = new JButton("Agregar Profesor ");
        btnNuevoProfesor.setBounds(20, 200, 200, 30);

        JButton btnEliminar = new JButton("Eliminar ");
        btnEliminar.setBounds(20, 240, 200, 30);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(20, 280, 200, 30);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(20, 320, 200, 30);

        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inicio inicio = new Inicio();
                frame1.setVisible(false);
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = table.getSelectedRow();
                if (fila >= 0) {
                    model.removeRow(fila);
                }

            }
        });

        btnNuevoProfesor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevoProfesor nuevoProfesor = new NuevoProfesor(pp);

            }
        });

        btnGuardar.addActionListener((ActionEvent e) -> {
            guardar();
        });

        frame1.add(btnNuevoProfesor);
        frame1.add(scroll);
        frame1.add(btnEliminar);
        frame1.add(btnVolver);
        frame1.add(btnGuardar);

        frame1.setVisible(
                true);

//        nuevoCliente.setVisible(false);
//        mm.cerrarNuevoCliente();
    }

    public JFrame getFrame1() {
        return frame1;
    }

    public JTable getTable() {
        return table;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setVisible(boolean b) {
        frame1.setVisible(b);
    }

    void addClienteRow(String[] cliente) {
        this.getModel().addRow(cliente);
    }

    public void filtro() {
        int columnaABuscar = 0;
        if (comboBuscar.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 0;
        }
        if (comboBuscar.getSelectedItem().toString() == "Apellido") {
            columnaABuscar = 1;
        }
        if (comboBuscar.getSelectedItem().toString() == "DNI") {
            columnaABuscar = 2;
        }
        if (comboBuscar.getSelectedItem().toString() == "Fecha de Inicio") {
            columnaABuscar = 3;
        }
        if (comboBuscar.getSelectedItem().toString() == "Profesor") {
            columnaABuscar = 4;
        }
        if (comboBuscar.getSelectedItem().toString() == "Direccion") {
            columnaABuscar = 5;
        }
        if (comboBuscar.getSelectedItem().toString() == "Telefono") {
            columnaABuscar = 6;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), columnaABuscar));
    }

    public void guardar() {
        File filename = new File(file1);
        String carga;
        try {

            try (BufferedWriter bfw = new BufferedWriter(new FileWriter(filename))) {

                for (int i = 0; i < table.getRowCount(); i++) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        carga = (String) table.getValueAt(i, j);
                        System.out.println(carga);
                        try {
                            bfw.write(carga);
                        } catch (NullPointerException p) {
                            bfw.write(vacio);
                        }
                        if (j < table.getColumnCount() - 1) {
                            bfw.write(" - ");
                        }
                    }
                    bfw.newLine();
                }
                bfw.close();

            }

            JOptionPane.showMessageDialog(frame1, "Su archivo ha sido guardado");

        } catch (IOException ioe) {
            System.out.println("Exception Caught : " + ioe.getMessage());
        }
    }

    public void importar() {

        String line = null;
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();

        try {

            BufferedReader br = new BufferedReader(new FileReader(file1));

            while ((line = br.readLine()) != null) {
                Vector data = new Vector();
                StringTokenizer st1 = new StringTokenizer(line, " - ");
                while (st1.hasMoreTokens()) {
                    String nextToken = st1.nextToken();
                    if (!nextToken.equals(vacio)) {
                        data.add(nextToken);
                    } else {
                        data.add(null);
                    }
                    System.out.println(nextToken);

                }
                System.out.println(data);
                dtm.addRow(data);//add here 
                System.out.println(".................................");
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

    

    


