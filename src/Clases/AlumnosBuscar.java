package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlumnosBuscar extends javax.swing.JFrame {

    public AlumnosBuscar() {
        initComponents();
        this.setLocation(500, 70);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        materno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        correo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        social = new javax.swing.JTextField();
        Back1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        Buscar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        modificar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 190, 30));

        jLabel4.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        paterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paternoKeyTyped(evt);
            }
        });
        getContentPane().add(paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, 30));

        jLabel6.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel6.setText("Apellido Materno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        materno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        materno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maternoKeyTyped(evt);
            }
        });
        getContentPane().add(materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 190, 30));

        jLabel9.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel9.setText("Correo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        correo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correo1KeyTyped(evt);
            }
        });
        getContentPane().add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 190, 30));

        jLabel8.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 190, 30));

        jLabel1.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel1.setText("Red Social");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        social.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        social.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                socialKeyTyped(evt);
            }
        });
        getContentPane().add(social, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 190, 30));

        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714728_Revert.png"))); // NOI18N
        Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back1MouseClicked(evt);
            }
        });
        getContentPane().add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 81, 30));

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448772194_Magnifier.png"))); // NOI18N
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 50, 40));

        jLabel3.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel3.setText("Codigo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714413_Remove-Male-User.png"))); // NOI18N
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448714401_Edit-Male-User.png"))); // NOI18N
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void paternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paternoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_paternoKeyTyped

    private void maternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maternoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_maternoKeyTyped

    private void correo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_correo1KeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoKeyTyped

    private void socialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_socialKeyTyped

    private void Back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back1MouseClicked

        this.setVisible(false);

        Modalidad mod= new Modalidad();
        mod.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Back1MouseClicked

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isWhitespace(c) || codigo.getText().trim().length() == 9) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_codigoKeyTyped

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked

        if(!"".equals(codigo.getText())){
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
                    nombre.setText(rs.getString("nombre"));
                    paterno.setText(rs.getString("apellido_paterno"));
                    materno.setText(rs.getString("apellido_materno"));
                    correo1.setText(rs.getString("correo"));
                    telefono.setText(rs.getString("telefono"));
                    social.setText(rs.getString("red_social"));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Alumno no registrado", "Error", JOptionPane.ERROR_MESSAGE);
                    limpiarCampos();
                }
                stmt.close();
                rs.close();
                conex.desconectar();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "No se encontro el admin");
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No se ingreso el codigo");         
    }//GEN-LAST:event_BuscarMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked

        if(!"".equals(codigo.getText())){
            if(!camposLlenos()){
                JOptionPane.showMessageDialog(null, "Campos vacios"); 
            }
            else{
                if(JOptionPane.showConfirmDialog(new JFrame(), ""
                    + "Seguro de eliminar al alumno?", "Advertencia", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
                    Conexion conex = null;
                    Statement stmt = null; 
                    ResultSet rs = null;
                    conex= new Conexion();
                    try {
                        stmt = conex.getConnection().createStatement();
                        stmt.executeUpdate("DELETE FROM alumno where codigo ='"+ codigo.getText() +"'");
                        limpiarCampos();
                        JOptionPane.showMessageDialog(null, "Alumno eliminado");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al eliminar");        
                    }
                }
                else
                    JOptionPane.showMessageDialog(null, "Ha cancelado el proceso"); 
            }
        }
        else
           JOptionPane.showMessageDialog(null, "No se ha ingresado codigo del alumno"); 
    }//GEN-LAST:event_eliminarMouseClicked

    private void limpiarCampos(){
        codigo.setText("");
        nombre.setText("");
        paterno.setText("");
        materno.setText("");
        correo1.setText("");
        telefono.setText("");
        social.setText("");
    }
    
    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked

        if(!"".equals(codigo.getText())){
            if(!camposLlenos()){
                JOptionPane.showMessageDialog(null, "Campos vacios"); 
            }
            else{
                if(JOptionPane.showConfirmDialog(new JFrame(), "Se reescribiran los datos"
                        + "\ncontinuar?", "Advertencia", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
                    Conexion conex = null;
                    Statement stmt = null; 
                    ResultSet rs = null;
                    conex= new Conexion();
            
                    try {
                        stmt = conex.getConnection().createStatement();
                        stmt.executeUpdate("Update alumno set"
                                    + " nombre = '"+ nombre.getText() +"'"
                                    + ", apellido_paterno = '"+ paterno.getText() +"', apellido_materno = '"+ materno.getText() +"'"
                                    + ", correo = '"+ correo1.getText() +"', telefono = '"+ telefono.getText() +"', red_social = '"+ social.getText() +"'"
                                    + " where codigo = '"+ codigo.getText() +"'");
            
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al actualizar");        
                    }
                }
                else
                    JOptionPane.showMessageDialog(null, "Ha cancelado el proceso"); 
            }
        }
        else
           JOptionPane.showMessageDialog(null, "No se ha ingresado codigo del alumno"); 
    }//GEN-LAST:event_modificarMouseClicked

    private boolean camposLlenos(){
        if(nombre.getText().length() > 0 && paterno.getText().length() > 0
               && materno.getText().length() > 0 && correo1.getText().length() > 0
                && telefono.getText().length() > 0 && social.getText().length() > 0 )
            return true;
        return false;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back1;
    private javax.swing.JLabel Buscar;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField correo1;
    private javax.swing.JLabel eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField materno;
    private javax.swing.JLabel modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField paterno;
    private javax.swing.JTextField social;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables

}