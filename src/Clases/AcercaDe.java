package Clases;

import java.awt.Color;
import javax.swing.ImageIcon;

public class AcercaDe extends javax.swing.JDialog {

    public AcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/Icon/Graduate.png"));  
        icono.setIcon(icon); 
        this.setLocationRelativeTo(parent);
        this.getContentPane().setBackground(new Color(199,212,237));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cerrar = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 165));
        setResizable(false);
        getContentPane().setLayout(null);

        cerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(cerrar);
        cerrar.setBounds(203, 100, 80, 23);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Graduate.png"))); // NOI18N
        getContentPane().add(icono);
        icono.setBounds(10, 10, 64, 64);

        texto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(texto);
        texto.setBounds(92, 38, 0, 0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jLabel1.setText("Titulación Icco");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 139, 25);

        jLabel2.setText("Desarrollado por:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 40, 200, 14);

        jLabel3.setText("Marco Antonio Hernandez Ramirez");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 60, 200, 14);

        jLabel4.setText("Oscar Alfredo Flores Solano");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 80, 200, 14);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 300, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AcercaDe dialog = new AcercaDe(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
