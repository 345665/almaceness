/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contactoss;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class base extends javax.swing.JFrame {
    conexionMysql con = new conexionMysql();
    Connection cn = con.conectar();
    
    public base() {
        initComponents();
        mostrarDatos();
    }

    private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("tel");
        tblContactos.setModel(modelo);
        String consultasql = "SELECT * FROM contactos";
        String data[] = new String[3];
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);

            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                modelo.addRow(data);
            }

        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContactos = new javax.swing.JTable();
        btnConection = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("ELIMINAR");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jPopupMenu2.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("DATOS DE USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        tblContactos.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        tblContactos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblContactos.setComponentPopupMenu(jPopupMenu1);
        tblContactos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContactosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblContactosMousePressed(evt);
            }
        });
        tblContactos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblContactosPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblContactos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 80, 540, 270));

        btnConection.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnConection.setText("VER CONEXION");
        btnConection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConection, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        btnMostrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnMostrar.setText("MOSTRAR DATOS");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 160, 30));

        txtID.setEditable(false);
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 50, 30));
        jPanel2.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 140, 160, 30));

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 232, -1, 20));

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel4.setText("TEL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setText("NOMBRE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 370, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    mostrarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnConectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectionActionPerformed
    conexionMysql con = new conexionMysql();
    Connection cn = con.conectar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConectionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
           PreparedStatement ps = cn.prepareStatement("UPDATE contactos SET nombre='" + txtNombre.getText() + "', tel='" + txtTel.getText() + "' WHERE id=" + Integer.parseInt(txtID.getText())+"");
           int indice = ps.executeUpdate();
           
           if(indice > 0){
               JOptionPane.showMessageDialog(rootPane,"Datos actualizados correctamente");
               mostrarDatos();
           }else{
                JOptionPane.showMessageDialog(rootPane,"No selecciono una fila");
           }
               
           
       }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane,"Error al actualizar datos!" + e); 
       }
       txtID.setText("");
       txtNombre.setText("");
       txtTel.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           PreparedStatement ps = cn.prepareStatement("INSERT INTO contactos (nombre,tel) VALUES (?,?)");
           ps.setString(1,txtNombre.getText());
           ps.setString(2,txtTel.getText());
           ps.executeUpdate();
           JOptionPane.showMessageDialog(rootPane,"Datos guardados correctamente");
           mostrarDatos();
       } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane,"Error al registrar contacto!" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactosMouseClicked
        int fila = tblContactos.getSelectedRow();
        this.txtID.setText(tblContactos.getValueAt(fila,0).toString());
        this.txtNombre.setText(tblContactos.getValueAt(fila,1).toString());
        this.txtTel.setText(tblContactos.getValueAt(fila,2).toString());
        
    }//GEN-LAST:event_tblContactosMouseClicked

    private void tblContactosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactosMousePressed
       /* int fila = tblContactos.getSelectedRow();
        this.txtID.setText(tblContactos.getValueAt(fila,0).toString());
        this.txtNombre.setText(tblContactos.getValueAt(fila,1).toString());
        this.txtTel.setText(tblContactos.getValueAt(fila,2).toString());
        */
    }//GEN-LAST:event_tblContactosMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try{
           PreparedStatement ps = cn.prepareStatement("DELETE FROM contactos where id='" + txtID.getText() + "'");
           
           int indice = ps.executeUpdate();
           
           if (indice > 0){
               
               mostrarDatos();
           }else{
               JOptionPane.showMessageDialog(rootPane,"No selecciono una fila");
           } 
       }catch (SQLException e) {
                   
          JOptionPane.showMessageDialog(rootPane,"Error al eliminar datos!" + e); 
       }
       txtID.setText("");
       txtNombre.setText("");
       txtTel.setText("");
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tblContactosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblContactosPropertyChange
     
    }//GEN-LAST:event_tblContactosPropertyChange

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new base().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConection;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblContactos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}

