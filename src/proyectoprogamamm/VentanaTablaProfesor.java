
package proyectoprogamamm;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    private DefaultTableModel model = new DefaultTableModel();;
    private VentanaTablaProfesor pp = this;
    private JComboBox comboBuscar;
    private JLabel lblBuscar;
    private TableRowSorter trsFiltro;
    
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
        model.addColumn("Tipo de Clase");
        
//        model.addRow(new Object[]{"lol"});
        
        table.setFont(new java.awt.Font("Tahoma", 30, 15));
        table.setRowHeight(25);
//        table.getColumnModel().getColumn(0).setPreferredWidth(200);       

        scroll = new JScrollPane(table);
        scroll.setBounds(300, 25, 640, 500);
              
        JButton btnNuevoProfesor= new JButton("Agregar Profesor ");
        btnNuevoProfesor.setBounds(20, 200, 200, 30);
        
        JButton btnEliminar = new JButton("Eliminar ");
        btnEliminar.setBounds(20, 240, 200, 30);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(20, 280, 200, 30);
        
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
        
       
           
        frame1.add(btnNuevoProfesor);
        frame1.add(scroll);
        frame1.add(btnEliminar);
        frame1.add(btnVolver);
        
        
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
    

    

}