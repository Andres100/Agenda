package Principal;

import Clases.AcercaDe;
import Clases.Conexion;
import Clases.Modalidad;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/Graduate.png")).getImage());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        usuarioTF = new javax.swing.JTextField();
        passPF = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titulación Icco");
        setBackground(new java.awt.Color(0, 149, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("Titulacion"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTFActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 111, -1));

        passPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passPFKeyPressed(evt);
            }
        });
        getContentPane().add(passPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 111, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1448708578_user.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1448708571_lock.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1448709359_12.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1448712467_app_type_university_512px_GREY.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 110));

        jLabel6.setFont(new java.awt.Font("gargi", 0, 36)); // NOI18N
        jLabel6.setForeground(java.awt.Color.orange);
        jLabel6.setText("Titulación");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("gargi", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.orange);
        jLabel7.setText("CuTonala");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(370, 500));
        jLabel4.setMinimumSize(new java.awt.Dimension(370, 500));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 290, 440));

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca De");

        jMenuItem3.setText("Acerda De");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(JOptionPane.showConfirmDialog(new JFrame(), "Desea salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void usuarioTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTFActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AcercaDe acerca = new AcercaDe(this, true);
        acerca.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

     
    private void ingresar(){
        if(camposLlenos()){
            Conexion conex = null;
            Statement stmt = null; 
            ResultSet rs = null;
            
            conex= new Conexion();
            try {
                stmt = conex.getConnection().createStatement();
                rs = stmt.executeQuery("select * " +
                                        "from administrador " +
                                        "where usuario = '"+usuarioTF.getText()+"'" +
                                        "and password = '"+String.valueOf(passPF.getPassword())+"'");
                if(rs.next()){
                    //JOptionPane.showMessageDialog(null, "Existe","Información",JOptionPane.INFORMATION_MESSAGE);
                    Modalidad mod = new Modalidad();
                    mod.setVisible(true);
                    this.dispose();
                }
                else{
                    rs = stmt.executeQuery("select * " +
                                            "from administrador " +
                                            "where usuario = '"+usuarioTF.getText()+"'");
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null, "Password incorrecta","Información",JOptionPane.INFORMATION_MESSAGE);
                        passPF.setText("");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Datos erróneos","Error",JOptionPane.ERROR_MESSAGE);
                    }
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
    }
    
    private void passPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passPFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ingresar();
        }
    }//GEN-LAST:event_passPFKeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    
        ingresar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    public boolean camposLlenos(){
        if(usuarioTF.getText().length() > 0 && String.valueOf(passPF.getPassword()).length() > 0)
            return true;
        return false;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPasswordField passPF;
    private javax.swing.JTextField usuarioTF;
    // End of variables declaration//GEN-END:variables
}
