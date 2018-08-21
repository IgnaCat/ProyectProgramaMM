/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamamm;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.List;
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
import javax.swing.JFileChooser;
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



public class VentanaTablaClientes{
    
    private JFrame frame1;
    private JTable table;
    private JScrollPane scroll;
    private JTextField txtBuscar;
    private DefaultTableModel model = new DefaultTableModel();;
    private VentanaTablaClientes me = this;
    private JComboBox comboBuscar;
    private JLabel lblBuscar;
    private TableRowSorter trsFiltro;
    private File file;
    private String nom_files;
    private Cliente cliente;
    
//    private static NuevoCliente nuevoCliente = new NuevoCliente();
    
    public VentanaTablaClientes() {
        frame1 = new JFrame("Cliente");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1300, 800);
        frame1.getContentPane().setBackground(Color.lightGray);
        frame1.setResizable(false);

        frame1.setLayout(null);
        
        
        
        table = new JTable(model);
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Fecha de Inicio");
        model.addColumn("Profesor");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        
//        model.addRow(new Object[]{"lol"});
        
        table.setFont(new java.awt.Font("Tahoma", 30, 15));
        table.setRowHeight(25);
//        table.getColumnModel().getColumn(0).setPreferredWidth(200);       

        scroll = new JScrollPane(table);
        scroll.setBounds(400, 25, 840, 700);
        
        lblBuscar = new JLabel("Buscar por:");
        lblBuscar.setBounds(120,60,200,30);
        
        comboBuscar = new JComboBox();
        comboBuscar.addItem("Nombre");
        comboBuscar.addItem("Apellido");
        comboBuscar.addItem("DNI");
        comboBuscar.addItem("Fecha de Inicio");
        comboBuscar.addItem("Profesor");
        comboBuscar.addItem("Direccion");
        comboBuscar.addItem("Telefono");
        comboBuscar.setBounds(120,100,200,30);
        
        txtBuscar = new JTextField();
        txtBuscar.setToolTipText("Busque algo aqui");
        txtBuscar.setBounds(120, 150, 200, 35);
        
        
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(120, 200, 200, 30);
        
        JButton btnNuevoCliente = new JButton("Nuevo Cliente");
        btnNuevoCliente.setBounds(120, 400, 200, 30);
        
        JButton btnEliminar = new JButton("Eliminar ");
        btnEliminar.setBounds(120, 240, 200, 30);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(120, 450, 200, 30);
        
        JButton btnExportar = new JButton("Guardar");
        btnExportar.setBounds(120, 500, 200, 30);
        
        btnExportar.addActionListener((ActionEvent e) -> {
            guardar();
        });

        
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
        
        btnNuevoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevoCliente nuevoCliente = new NuevoCliente(me);
                
            }
        });
        
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               buscar(); 
            }
        });
           
        frame1.add(btnNuevoCliente);
        frame1.add(lblBuscar);
        frame1.add(comboBuscar);
        frame1.add(txtBuscar);
        frame1.add(btnBuscar);
        frame1.add(scroll);
        frame1.add(btnEliminar);
        frame1.add(btnVolver);
        frame1.add(btnExportar);
        
        
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
    
    public void setVisible(boolean b){
        frame1.setVisible(b);
    }

    void addClienteRow(String[] cliente) {
        this.getModel().addRow(cliente);
    }
    
    public void buscar(){
        String cadena = (txtBuscar.getText());               
        trsFiltro = new TableRowSorter(table.getModel());
        table.setRowSorter(trsFiltro);
        filtro();
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
    
    public void guardar(){
        JFileChooser jF1 = new JFileChooser();
            String ruta = "Gym/gym.txt";
//            try {
//                if (jF1.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
//                    ruta = jF1.getSelectedFile().getAbsolutePath(); // /home/.gym
//                }
//            } catch (HeadlessException ex) {
//                ex.printStackTrace();
//            }

            File filename = new File(ruta);
            


            JFrame frame1 = new JFrame();

            try {

                try (BufferedWriter bfw = new BufferedWriter(new FileWriter(filename))) {
//                    for(int i = 0; i<contenido.length;i++){ 
//                        fileOut.write(contenido[i] + " - ");
//                    }
                 for (int i = 0 ; i < table.getRowCount(); i++) 
            {
                for(int j = 0 ; j < table.getColumnCount();j++) 
                {
                    bfw.write((String)(table.getValueAt(i,j)));
                    if (j < table.getColumnCount() -1) { 
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
            String file = "Gym/gym.txt";
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null) {
                Vector data = new Vector();// this is important
                StringTokenizer st1 = new StringTokenizer(line, " - ");
                while (st1.hasMoreTokens()) {
                    String nextToken = st1.nextToken();
                    data.add(nextToken);
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
