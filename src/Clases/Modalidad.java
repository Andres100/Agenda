package Clases;

import Principal.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modalidad extends javax.swing.JFrame {

    public Modalidad() {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/Graduate.png")).getImage());
        setLocationRelativeTo(null);
        muestraModalidad(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboBoxModalidades = new javax.swing.JComboBox();
        regresar = new javax.swing.JButton();
        orderByAvg = new javax.swing.JButton();
        Alumno = new javax.swing.JLabel();
        orderByLastName = new javax.swing.JButton();
        orderByDate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Registrar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1056, 390));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Registrar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 310, 80, 20));

        comboBoxModalidades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxModalidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelencia académica  ", "Titulación por promedio  ", "Examen global teórico-practico  ", "Examen global teórico  ", "Examen general de certificación profesional (ceneval)  ", "Examen de capacitación profesional o técnico-profesional   ", "Replica verbal o por escrito  ", "Guías comentadas o ilustradas  ", "Paquete didáctico  ", "Propuesta pedagógica  ", "Trabajo monográfico de actualización  ", "Seminario de investigación  ", "Seminario de titulación  ", "Diseño y rediseño de equipo, aparato o maquinaria  ", "Tesis  ", "Tesina  ", "Informe de practicas profesionales  ", "Informe de servicio social" }));
        comboBoxModalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxModalidadesActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxModalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regresar.setText("Cerrar sesión");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 170, 20));

        orderByAvg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderByAvg.setText("Ordenar por promedio");
        orderByAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderByAvgActionPerformed(evt);
            }
        });
        getContentPane().add(orderByAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        Alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448715656_group.png"))); // NOI18N
        Alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlumnoMouseClicked(evt);
            }
        });
        getContentPane().add(Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 120, -1, 70));

        orderByLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderByLastName.setText("Ordenar por apellido");
        orderByLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderByLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(orderByLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        orderByDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderByDate.setText("Ordenar por fecha de registro");
        orderByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderByDateActionPerformed(evt);
            }
        });
        getContentPane().add(orderByDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Modalidades");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Alumnos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 190, 70, -1));

        Registrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448715340_book.png"))); // NOI18N
        Registrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Registrar1MouseClicked(evt);
            }
        });
        getContentPane().add(Registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxModalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxModalidadesActionPerformed
        JComboBox comboBox = (JComboBox) evt.getSource();
        muestraModalidad(comboBox.getSelectedIndex());
    }//GEN-LAST:event_comboBoxModalidadesActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void orderByAvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderByAvgActionPerformed
        Conexion conex = null;
        Statement stmt = null; 
        ResultSet rs = null;
        
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("ID Registro");
        modelo.addColumn("Modalidad");
        modelo.addColumn("Codigo alumno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Fecha registro");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Fecha egreso");
        modelo.addColumn("Promedio egreso");
        modelo.addColumn("Estado");
        modelo.addColumn("Creditos cursados");
        
        conex= new Conexion();
        try {
            stmt = conex.getConnection().createStatement();
            rs = stmt.executeQuery("select registro.id_registro, modalidad.nombre, alumno.codigo, alumno.nombre, " +
                "alumno.apellido_paterno, alumno.apellido_materno, registro.fecha_registro, registro.fecha_ingreso, " +
                "registro.fecha_egreso, registro.promedio_egreso, registro.estado, registro.creditos_cursados " +
                "from registro, modalidad, alumno " +
                "where registro.id_modalidad = modalidad.id_modalidad " +
                "and registro.codigo_alumno = alumno.codigo " +
                "and modalidad.id_modalidad = '"+(comboBoxModalidades.getSelectedIndex()+1)+"'"
                + " order by registro.promedio_egreso desc");
            
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("registro.id_registro"), rs.getString("modalidad.nombre"), rs.getInt("alumno.codigo"),
                                           rs.getString("alumno.nombre"), rs.getString("alumno.apellido_paterno"), rs.getString("alumno.apellido_materno"),
                                           rs.getDate("fecha_registro"), rs.getDate("fecha_ingreso"), rs.getDate("fecha_egreso"),
                                           rs.getFloat("promedio_egreso"), rs.getString("estado"), rs.getInt("creditos_cursados")});
            }
            
            stmt.close();
            rs.close();
            conex.desconectar();    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro el admin");
        }
    }//GEN-LAST:event_orderByAvgActionPerformed

    private void orderByLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderByLastNameActionPerformed
        Conexion conex = null;
        Statement stmt = null; 
        ResultSet rs = null;
        
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("ID Registro");
        modelo.addColumn("Modalidad");
        modelo.addColumn("Codigo alumno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Fecha registro");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Fecha egreso");
        modelo.addColumn("Promedio egreso");
        modelo.addColumn("Estado");
        modelo.addColumn("Creditos cursados");
        
        conex= new Conexion();
        try {
            stmt = conex.getConnection().createStatement();
            rs = stmt.executeQuery("select registro.id_registro, modalidad.nombre, alumno.codigo, alumno.nombre, " +
                "alumno.apellido_paterno, alumno.apellido_materno, registro.fecha_registro, registro.fecha_ingreso, " +
                "registro.fecha_egreso, registro.promedio_egreso, registro.estado, registro.creditos_cursados " +
                "from registro, modalidad, alumno " +
                "where registro.id_modalidad = modalidad.id_modalidad " +
                "and registro.codigo_alumno = alumno.codigo " +
                "and modalidad.id_modalidad = '"+(comboBoxModalidades.getSelectedIndex()+1)+"'"
                + " order by alumno.apellido_paterno, alumno.apellido_materno");
            
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("registro.id_registro"), rs.getString("modalidad.nombre"), rs.getInt("alumno.codigo"),
                                           rs.getString("alumno.nombre"), rs.getString("alumno.apellido_paterno"), rs.getString("alumno.apellido_materno"),
                                           rs.getDate("fecha_registro"), rs.getDate("fecha_ingreso"), rs.getDate("fecha_egreso"),
                                           rs.getFloat("promedio_egreso"), rs.getString("estado"), rs.getInt("creditos_cursados")});
            }
            
            stmt.close();
            rs.close();
            conex.desconectar();    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro el admin");
        }
    }//GEN-LAST:event_orderByLastNameActionPerformed

    private void orderByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderByDateActionPerformed
        Conexion conex = null;
        Statement stmt = null; 
        ResultSet rs = null;
        
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("ID Registro");
        modelo.addColumn("Modalidad");
        modelo.addColumn("Codigo alumno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Fecha registro");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Fecha egreso");
        modelo.addColumn("Promedio egreso");
        modelo.addColumn("Estado");
        modelo.addColumn("Creditos cursados");
        
        conex= new Conexion();
        try {
            stmt = conex.getConnection().createStatement();
            rs = stmt.executeQuery("select registro.id_registro, modalidad.nombre, alumno.codigo, alumno.nombre, " +
                "alumno.apellido_paterno, alumno.apellido_materno, registro.fecha_registro, registro.fecha_ingreso, " +
                "registro.fecha_egreso, registro.promedio_egreso, registro.estado, registro.creditos_cursados " +
                "from registro, modalidad, alumno " +
                "where registro.id_modalidad = modalidad.id_modalidad " +
                "and registro.codigo_alumno = alumno.codigo " +
                "and modalidad.id_modalidad = '"+(comboBoxModalidades.getSelectedIndex()+1)+"'"
                + " order by registro.fecha_registro");
            
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("registro.id_registro"), rs.getString("modalidad.nombre"), rs.getInt("alumno.codigo"),
                                           rs.getString("alumno.nombre"), rs.getString("alumno.apellido_paterno"), rs.getString("alumno.apellido_materno"),
                                           rs.getDate("fecha_registro"), rs.getDate("fecha_ingreso"), rs.getDate("fecha_egreso"),
                                           rs.getFloat("promedio_egreso"), rs.getString("estado"), rs.getInt("creditos_cursados")});
            }
            
            stmt.close();
            rs.close();
            conex.desconectar();    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro el admin");
        }
    }//GEN-LAST:event_orderByDateActionPerformed

    private void AlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlumnoMouseClicked

        Alumnos Al = new Alumnos(this, true);
        Al.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_AlumnoMouseClicked

    private void Registrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Registrar1MouseClicked

        RegistrarMod rm = new RegistrarMod(this, true);
        rm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Registrar1MouseClicked

    private void muestraModalidad(int index){
        Conexion conex = null;
        Statement stmt = null; 
        ResultSet rs = null;
        
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("ID Registro");
        modelo.addColumn("Modalidad");
        modelo.addColumn("Codigo alumno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Fecha registro");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Fecha egreso");
        modelo.addColumn("Promedio egreso");
        modelo.addColumn("Estado");
        modelo.addColumn("Creditos cursados");
        
        conex= new Conexion();
        try {
            stmt = conex.getConnection().createStatement();
            rs = stmt.executeQuery("select registro.id_registro, modalidad.nombre, alumno.codigo, alumno.nombre, " +
                "alumno.apellido_paterno, alumno.apellido_materno, registro.fecha_registro, registro.fecha_ingreso, " +
                "registro.fecha_egreso, registro.promedio_egreso, registro.estado, registro.creditos_cursados " +
                "from registro, modalidad, alumno " +
                "where registro.id_modalidad = modalidad.id_modalidad " +
                "and registro.codigo_alumno = alumno.codigo " +
                "and modalidad.id_modalidad = '"+(index+1)+"'");
            
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("registro.id_registro"), rs.getString("modalidad.nombre"), rs.getInt("alumno.codigo"),
                                           rs.getString("alumno.nombre"), rs.getString("alumno.apellido_paterno"), rs.getString("alumno.apellido_materno"),
                                           rs.getDate("fecha_registro"), rs.getDate("fecha_ingreso"), rs.getDate("fecha_egreso"),
                                           rs.getFloat("promedio_egreso"), rs.getString("estado"), rs.getInt("creditos_cursados")});
            }
            
            stmt.close();
            rs.close();
            conex.desconectar();    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro el admin");
        }
    }
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modalidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alumno;
    private javax.swing.JLabel Registrar1;
    private javax.swing.JComboBox comboBoxModalidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderByAvg;
    private javax.swing.JButton orderByDate;
    private javax.swing.JButton orderByLastName;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
