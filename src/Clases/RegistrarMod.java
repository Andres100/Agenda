package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistrarMod extends javax.swing.JDialog {
    DateFormat df;
    
    public RegistrarMod(java.awt.Frame parent, boolean modal) {
        super(parent, modal);    
        initComponents();
        df = DateFormat.getDateInstance();
        this.setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        modalidades = new javax.swing.JComboBox();
        codigo = new javax.swing.JTextField();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        fechaEgreso = new com.toedter.calendar.JDateChooser();
        promedio = new javax.swing.JTextField();
        creditos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fecha de ingreso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de egreso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Promedio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Creditos cursados");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 20));

        modalidades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modalidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelencia académica  ", "Titulación por promedio  ", "Examen global teórico-practico  ", "Examen global teórico  ", "Examen general de certificación profesional (ceneval)  ", "Examen de capacitación profesional o técnico-profesional   ", "Replica verbal o por escrito  ", "Guías comentadas o ilustradas  ", "Paquete didáctico  ", "Propuesta pedagógica  ", "Trabajo monográfico de actualización  ", "Seminario de investigación  ", "Seminario de titulación  ", "Diseño y rediseño de equipo, aparato o maquinaria  ", "Tesis  ", "Tesina  ", "Informe de practicas profesionales  ", "Informe de servicio social" }));
        getContentPane().add(modalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 81, 30));

        fechaIngreso.setDateFormatString("dd/MM/yyyy");
        fechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 115, 30));

        fechaEgreso.setDateFormatString("dd/MM/yyyy");
        fechaEgreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fechaEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 115, 30));

        promedio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        promedio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promedioKeyTyped(evt);
            }
        });
        getContentPane().add(promedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 81, 30));

        creditos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        creditos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditosKeyTyped(evt);
            }
        });
        getContentPane().add(creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 81, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, 20));

        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714440_sign-check.png"))); // NOI18N
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714728_Revert.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c) || codigo.getText().trim().length() == 9) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_codigoKeyTyped

    private void creditosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditosKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_creditosKeyTyped

    private void promedioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promedioKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_promedioKeyTyped

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        if(camposLlenos()){
            Conexion conex = null;
            Statement stmt = null;
            ResultSet rs = null;

            conex= new Conexion();
            try {
                stmt = conex.getConnection().createStatement();
                rs = stmt.executeQuery("select * " +
                    "from alumno " +
                    "where codigo = '"+codigo.getText()+"'");
                if(rs.next()){
                    ResultSet alumnoEnRegistro = stmt.executeQuery("select * " +
                                                "from registro " +
                                                "where codigo_alumno = '"+codigo.getText()+"'");
                    if(alumnoEnRegistro.next()){
                        if(JOptionPane.showConfirmDialog(new JFrame(), "El alumno ya tiene registrada una modalidad"
                                + "\nDesea sobreecribir la informacion?", "Informacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                            stmt.executeUpdate("Update registro set id_modalidad = '"+ (modalidades.getSelectedIndex()+1) +"'"
                                    + ", codigo_alumno = '"+ codigo.getText() +"', fecha_registro = '"+ fechaActual() +"'"
                                    + ", fecha_ingreso = '"+ calculaFechaIngreso() +"', fecha_egreso = '"+ calculaFechaEgreso() +"'"
                                    + ", promedio_egreso = '"+ promedio.getText() +"', creditos_cursados = '"+ creditos.getText() +"'"
                                    + " where codigo_alumno = '"+ codigo.getText() +"'");
                        }
                        //JOptionPane.showMessageDialog(null, "El alumno ya tiene registrada una modalidad","Información",JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos();
                    }
                    else{
                        //JOptionPane.showMessageDialog(null, "Existe","Información",JOptionPane.INFORMATION_MESSAGE);
                        stmt.executeUpdate("INSERT INTO registro (id_modalidad, codigo_alumno, fecha_registro, fecha_ingreso, fecha_egreso, promedio_egreso, creditos_cursados) "
                            + "VALUES ('" + (modalidades.getSelectedIndex()+1) + "', '" + codigo.getText() + "', '" + fechaActual() + "', '" + calculaFechaIngreso()
                            + "', '" + calculaFechaEgreso() + "', '" + promedio.getText() + "', '" + creditos.getText() + "')");
                        limpiarCampos();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Alumno no registrado", "Error", JOptionPane.ERROR_MESSAGE);
                }
                stmt.close();
                rs.close();
                conex.desconectar();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "No se encontro el admin");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos vacios");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        this.setVisible(false);
        
        Modalidad mod= new Modalidad();
        mod.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void limpiarCampos(){
        codigo.setText("");
        promedio.setText("");
        creditos.setText("");
        fechaIngreso.cleanup();
        fechaEgreso.cleanup();
    }
    
    private boolean camposLlenos(){
        if(codigo.getText().length() > 0 && promedio.getText().length() > 0 && creditos.getText().length() > 0
                && !calculaFechaIngreso().equals("vacio") && !calculaFechaEgreso().equals("vacio"))
            return true;
        return false;
    }
    
    private String fechaActual(){
        java.util.Date dates = new java.util.Date();
        long fechaSis = dates.getTime();
        java.sql.Date d = new java.sql.Date(fechaSis);
        return d.toString();
    }
    
    private String calculaFechaIngreso(){
        if(fechaIngreso.getDate() == null)
            return "vacio";
        String fechain = df.format(fechaIngreso.getDate());
        String fechaInConFormato;
        char[] date = fechain.toCharArray();
        if(date.length == 9){
            fechaInConFormato = String.valueOf(date[5]) + String.valueOf(date[6]) + String.valueOf(date[7]) + String.valueOf(date[8]) + "-" +
                    String.valueOf(date[2]) + String.valueOf(date[3]) + "-" +
                    "0" + String.valueOf(date[0]);
        }
        else{
            fechaInConFormato = String.valueOf(date[6]) + String.valueOf(date[7]) + String.valueOf(date[8]) + String.valueOf(date[9]) + "-" +
                    String.valueOf(date[3]) + String.valueOf(date[4]) + "-" +
                    String.valueOf(date[0]) + String.valueOf(date[1]);
        }
        return fechaInConFormato;
    }
    
    private String calculaFechaEgreso(){
        if(fechaEgreso.getDate() == null)
            return "vacio";
        String fechaegre = df.format(fechaEgreso.getDate());
        String fechaEConFormato;
        char[] date = fechaegre.toCharArray();
        if(date.length == 9){
            fechaEConFormato = String.valueOf(date[5]) + String.valueOf(date[6]) + String.valueOf(date[7]) + String.valueOf(date[8]) + "-" +
                    String.valueOf(date[2]) + String.valueOf(date[3]) + "-" +
                    "0" + String.valueOf(date[0]);
        }
        else{
            fechaEConFormato = String.valueOf(date[6]) + String.valueOf(date[7]) + String.valueOf(date[8]) + String.valueOf(date[9]) + "-" +
                    String.valueOf(date[3]) + String.valueOf(date[4]) + "-" +
                    String.valueOf(date[0]) + String.valueOf(date[1]);
        }
        return fechaEConFormato;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarMod dialog = new RegistrarMod(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Aceptar;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField creditos;
    private com.toedter.calendar.JDateChooser fechaEgreso;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox modalidades;
    private javax.swing.JTextField promedio;
    // End of variables declaration//GEN-END:variables
}
