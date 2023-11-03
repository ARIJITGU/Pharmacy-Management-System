
import DAO.ConnectionProvider;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author ARIJIT
 */
public class UpdateMedicine extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMedicine
     */
    public UpdateMedicine() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 102));
        jLabel1.setText("UPDATE MEDICINE");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel2.setText("MEDICINE ID");

        jTextField1.setBackground(new java.awt.Color(255, 131, 64));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel3.setText("NAME");

        jTextField2.setBackground(new java.awt.Color(255, 131, 64));
        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel4.setText("COMPANY NAME");

        jTextField3.setBackground(new java.awt.Color(255, 131, 64));
        jTextField3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel5.setText("PRICE PER UNIT");

        jTextField4.setBackground(new java.awt.Color(255, 131, 64));
        jTextField4.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel6.setText("QUANTITY");

        jTextField5.setBackground(new java.awt.Color(255, 131, 64));
        jTextField5.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int checkmedicineexist=0;
        String Uniqueid=jTextField1.getText();
        if(Uniqueid.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER VALID MEDICINE ID");
        }
        else
        {
            try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select *from medicine where medicine_id='"+Uniqueid+"'");
                while(rs.next())
                {
                    jTextField1.setEditable(false);
                    jTextField2.setText(rs.getString("name"));
                    jTextField3.setText(rs.getString("company_name"));
                    jTextField4.setText(rs.getString("price_per_unit"));
                    jTextField5.setText(rs.getString("quantity"));
                    checkmedicineexist=1;
                }
            }catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            if(checkmedicineexist==0)
            {
                JOptionPane.showMessageDialog(null,"MEDICINE DOESN'T EXIST");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String uniqueid=jTextField1.getText();
        String name=jTextField2.getText();
        String company_name=jTextField3.getText();
        String quantity=jTextField5.getText();
        String price_per_unit=jTextField4.getText();
        if (uniqueid.equals(""))
        {
            JOptionPane.showMessageDialog(null,"MEDICINE ID IS REQUIRED");
        }
        else if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE NAME OF MEDICINE");
        }
        else if(company_name.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE COMPANY NAME OF THE MEDICINE");
        }
        else if(quantity.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE TOTAL QUANTITY");
            
        }
        else if(price_per_unit.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE PRICE PER UNIT");
        }
        else
        {
            try
            {
                Connection con=ConnectionProvider.getCon(); //connection to the  mysql database
                PreparedStatement ps=con.prepareStatement("update medicine set name=?,company_name=?,quantity=?,price_per_unit=? where medicine_id=?");
                ps.setString(1, name);
                ps.setString(2,company_name);
                ps.setString(3, quantity);
                ps.setString(4, price_per_unit);
                ps.setInt(5, Integer.parseInt(uniqueid));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"MEDICINE UPDATED SUCCESSFULLY");
                setVisible(false);
                new UpdateMedicine().setVisible(true);
            }catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
