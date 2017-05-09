package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Alumnos extends javax.swing.JDialog {
    DefaultTableModel modelo;
    AlumnosAgregar al;
    AlumnosBuscar ab;
    
    public Alumnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarAlumnos();
        this.setLocationRelativeTo(parent);
        al = new AlumnosAgregar();
        ab = new AlumnosBuscar();
    }

    Alumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mostrarAlumnos(){
        Conexion conex = null;
        Statement stmt = null; 
        ResultSet rs = null;
        
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Red Social");
        
        conex= new Conexion();
        try {
            stmt = conex.getConnection().createStatement();
            rs = stmt.executeQuery("select * " +
                "from alumno ");
            
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("codigo"), rs.getString("nombre"), rs.getString("apellido_paterno"), 
                                        rs.getString("apellido_materno"), rs.getString("correo"), rs.getString("telefono"),
                                        rs.getString("red_social")});
            }
            
            stmt.close();
            rs.close();
            conex.desconectar();    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro el admin");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(935, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448713498_Add-Male-User.png"))); // NOI18N
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(790, 20, 50, 50);

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448713486_Search-Male-User.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(850, 20, 50, 50);

        jScrollPane1.setBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setInheritsPopupMenu(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setEnabled(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 896, 320);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714728_Revert.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(10, 10, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-90, 0, 2000, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        tabla.setModel(modelo);
        int fila = tabla.rowAtPoint(evt.getPoint());
        int columna = tabla.columnAtPoint(evt.getPoint());
        if ((fila > -1) && (columna > -1))
            System.out.println(modelo.getValueAt(fila,columna));
    }//GEN-LAST:event_tablaMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.setVisible(false);
        //Modalidad mod= new Modalidad();
        //mod.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        ab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alumnos dialog = new Alumnos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
