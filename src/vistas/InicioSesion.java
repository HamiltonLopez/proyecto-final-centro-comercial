/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControladorLocal;
import controladores.ControladorUsuario;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelos.AdminLocal;
import modelos.Administrador;
import modelos.Cliente;
import modelos.EmpleadoGeneral;
import modelos.EmpleadoInterno;
import modelos.Local;
import modelos.Usuario;
import util.Lista;
import vistas.adminLocal.GestionarLocal;
import vistas.administrador.GestionAdministrador;
import vistas.cliente.RegistrarCliente;
import vistas.cliente.VentanaCliente;
import vistas.encargadoInventario.Encargado;
import vistas.parqueadero.VistaParqueadero;
import vistas.vendedor.Vendedor;

/**
 *
 * @author Asus
 */
public class InicioSesion extends javax.swing.JFrame {

    ControladorUsuario controlador;

    public InicioSesion() {
        initComponents();
        controlador = new ControladorUsuario();

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INICIO DE SESIÓN");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        txtDocumento.setForeground(new java.awt.Color(204, 204, 204));
        txtDocumento.setText("Ingrese el número de documento");
        txtDocumento.setBorder(null);
        txtDocumento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtDocumentoMouseMoved(evt);
            }
        });
        txtDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDocumentoMousePressed(evt);
            }
        });
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        jPanel3.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 228, -1));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setText("*******");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        jPanel3.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 228, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTRASEÑA ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        btnInicio.setBackground(new java.awt.Color(0, 153, 153));
        btnInicio.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO DE SESIÓN");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel3.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("¿Eres un nuevo cliente?");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        btnRegistrarse.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistrarse.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 230, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 230, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("USUARIO/DOCUMENTO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setText("jLabel6");
        jPanel3.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("\"123\"");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("\"1\"");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("\"1\"");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocumentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDocumentoMousePressed
        if (txtDocumento.getText().equals("Ingrese el número de documento")) {
            txtDocumento.setText("");
            txtDocumento.setForeground(Color.black);
        }
        if (String.valueOf(txtContra.getPassword()).isEmpty()) {
            txtContra.setText("*******");
            txtContra.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtDocumentoMousePressed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if (String.valueOf(txtContra.getPassword()).equals("*******")) {
            txtContra.setText("");
            txtContra.setForeground(Color.black);

        }
        if (txtDocumento.getText().isEmpty()) {
            txtDocumento.setText("Ingrese el número de documento");
            txtDocumento.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtContraMousePressed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

        if (txtContra.getText().isEmpty() || txtDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
        } else {

            String documento = txtDocumento.getText();
            String contraseña = txtContra.getText();

            Usuario usuario = controlador.ValidarAcceso(documento, contraseña);
            /*Lista<Usuario> lista = controlador.validarAccesoLista(documento, contraseña);
            if (lista.Size() == 2) {
                if (lista.obtener(0) instanceof EmpleadoGeneral) {

                    this.dispose();
                } else if (lista.obtener(0) instanceof EmpleadoInterno) {
                    EmpleadoInterno empleado = (EmpleadoInterno) lista.obtener(0);
                    new ElegirManera(empleado).setVisible(true);
                    this.dispose();
                } else if (lista.obtener(1) instanceof EmpleadoGeneral) {
                } else if (lista.obtener(1) instanceof EmpleadoInterno) {
                    EmpleadoInterno empleado = (EmpleadoInterno) lista.obtener(1);
                    new ElegirManera(empleado).setVisible(true);
                    this.dispose();
                } else {
                    lblError.setText("Tu cargo no condece nigun permiso");
                    lblError.setForeground(Color.red);
                }
            } else {*/
            if (usuario instanceof Administrador) {
                Administrador admin = (Administrador) usuario;
                new GestionAdministrador(admin).setVisible(true);
                this.dispose();
            } else if (usuario instanceof AdminLocal) {
                AdminLocal admin = (AdminLocal) usuario;
                new GestionarLocal(admin).setVisible(true);
                this.dispose();
            } else if (usuario instanceof EmpleadoGeneral) {
                EmpleadoGeneral empleado = (EmpleadoGeneral) usuario;
                if (empleado.getCargo().equalsIgnoreCase("Administrador Parqueadero")) {
                    new VistaParqueadero(empleado).setVisible(true);
                    this.dispose();
                } else {
                    lblError.setText("Tu cargo no condece nigun permiso");
                    lblError.setForeground(Color.red);
                }
            } else if (usuario instanceof Cliente) {
                Cliente cliente = (Cliente) usuario;
                new VentanaCliente(cliente).setVisible(true);
                this.dispose();
            } else if (usuario instanceof EmpleadoInterno) {
                EmpleadoInterno empleado = (EmpleadoInterno) usuario;
                if (empleado.getCargo().equalsIgnoreCase("Vendedor")) {
                    new Vendedor(empleado).setVisible(true);
                    this.dispose();
                } else {
                    new Encargado(empleado).setVisible(true);
                    this.dispose();
                }
            } else {

                lblError.setText("El documento o la contraseña no son correctas");
                lblError.setForeground(Color.red);
            }
            // }

        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        new RegistrarCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtDocumentoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDocumentoMouseMoved

    }//GEN-LAST:event_txtDocumentoMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InicioSesion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblError;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
}
