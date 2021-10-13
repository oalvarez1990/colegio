
package taller3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class conexionSQL extends javax.swing.JPanel {

    /**
     * Creates new form conexionSQL
     */
    public conexionSQL() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConectar = new javax.swing.JButton();

        btnConectar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnConectar)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(btnConectar)
                .addGap(136, 136, 136))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed

        // Vamos a crear una conexion a la bd 
        String bases = "";
        try {
            Statement sql = conexion.getConexion().createStatement();

            String consulta = "SELECT name FROM colegio.dbo.sysdatabase";
            ResultSet resultado = sql.executeQuery(consulta);

            while (resultado.next()) {
                bases += resultado.getString(1) + "\n";
            }
            JOptionPane.showConfirmDialog(null, bases);

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }


    }//GEN-LAST:event_btnConectarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    // End of variables declaration//GEN-END:variables
}
