package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlumnosAgregar extends javax.swing.JFrame {
    private int limite;
    
    public AlumnosAgregar() {
        initComponents();
        //this.setAlwaysOnTop(true);
        this.setLocation(500, 70);
        limite = 9;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        paterno = new javax.swing.JTextField();
        materno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        correo1 = new javax.swing.JTextField();
        correo2 = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        Aceptar = new javax.swing.JLabel();
        social = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714728_Revert.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel1.setText("Red Social");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel3.setText("Codigo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel6.setText("Apellido Materno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
        jLabel7.setText("@");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 81, 30));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 190, 30));

        paterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, 30));

        materno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 190, 30));

        jLabel9.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel9.setText("Correo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        correo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 81, 30));

        correo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(correo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 81, 30));

        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 190, 30));

        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714440_sign-check.png"))); // NOI18N
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AceptarMouseEntered(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        social.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(social, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 190, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        //Modalidad mod= new Modalidad();
        //mod.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseClicked

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c) || codigo.getText().trim().length() == 9) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_codigoKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_telefonoKeyTyped

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
                    if(JOptionPane.showConfirmDialog(new JFrame(), "El alumno ya esta registrado"
                                + "\nDesea sobreecribir la informacion?", "Informacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                            stmt.executeUpdate("Update alumno set codigo = '"+ codigo.getText() +"'"
                                    + ", nombre = '"+ nombre.getText() +"', apellido_paterno = '"+ paterno.getText() +"'"
                                    + ", apellido_materno = '"+ materno.getText() +"', correo = '"+ (correo1.getText() + "@" + correo2.getText()) +"'"
                                    + ", telefono = '"+ telefono.getText() +"', red_social = '"+ social.getText() +"'"
                                    + " where codigo = '"+ codigo.getText() +"'");
                        }
                        //JOptionPane.showMessageDialog(null, "El alumno ya tiene registrada una modalidad","Información",JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos();
                }
                //JOptionPane.showMessageDialog(null, "Existe","Información",JOptionPane.INFORMATION_MESSAGE);
                else{
                    stmt.executeUpdate("INSERT INTO alumno (codigo, nombre, apellido_paterno, apellido_materno, correo, telefono, red_social) "
                        + "VALUES ('" + codigo.getText() + "', '" + nombre.getText() + "', '" + paterno.getText() + "', '" 
                        + materno.getText() + "', '" + (correo1.getText() + "@" + correo2.getText()) + "', '" + telefono.getText() + "', '" + social.getText() + "')");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosAgregar.class.getName()).log(Level.SEVERE, null, ex);
            }
                        limpiarCampos();
                        JOptionPane.showMessageDialog(null, "Alumno agregado");

            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosAgregar.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosAgregar.class.getName()).log(Level.SEVERE, null, ex);
            }
                conex.desconectar();
            
                    }

        
        else{
            JOptionPane.showMessageDialog(null, "Campos vacios");
        }
    }//GEN-LAST:event_AceptarMouseClicked

    private void limpiarCampos(){
        codigo.setText("");
        nombre.setText("");
        paterno.setText("");
        materno.setText("");
        correo1.setText("");
        correo2.setText("");
        telefono.setText("");
        social.setText("");

    }
    
    private boolean camposLlenos(){
        if(codigo.getText().length() > 0 && nombre.getText().length() > 0 && paterno.getText().length() > 0
               && materno.getText().length() > 0 && correo1.getText().length() > 0 && correo2.getText().length() > 0 
                && telefono.getText().length() > 0 && social.getText().length() > 0 )
            return true;
        return false;
    }
    
    
    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aceptar;
    private javax.swing.JLabel Back;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField correo1;
    private javax.swing.JTextField correo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField materno;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField paterno;
    private javax.swing.JTextField social;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
