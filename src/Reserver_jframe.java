
import BLL.CoucheMetier;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cha
 */
public class Reserver_jframe extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Reserver_jframe
     */
    public Reserver_jframe() {
        initComponents();
        CoucheMetier objBll = new CoucheMetier(); 
        conn=objBll.ConnecrDb();
    }
    private void Update_table() {
        String sql ="select * from reserver";
        try {
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table_admin.setModel(DbUtils.resultSetToTableModel(rs));
 
            }
        catch(Exception e) {
                            JOptionPane.showMessageDialog(null,e);
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_admin = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idClient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        txt_nb = new javax.swing.JTextField();
        txt_idCircuit = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Cmd_update = new javax.swing.JButton();
        Cmd_delete = new javax.swing.JButton();
        Cmd_save = new javax.swing.JButton();
        Cmd_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reserver");

        Table_admin.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_adminMouseClicked(evt);
            }
        });
        Table_admin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Table_adminKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table_admin);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Users information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 153, 255)));

        jLabel2.setText("Nombre de place");

        jLabel3.setText("Date de réservation");

        jLabel1.setText("ID");

        jLabel5.setText("IdClient");

        jLabel4.setText("IdCircuit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_idClient, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(txt_nb)
                            .addComponent(txt_date)
                            .addComponent(txt_idCircuit))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_idCircuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_idClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        txt_search.setToolTipText("Rechercher nom ou prénom");
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 51), null));

        Cmd_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        Cmd_update.setText("Update");
        Cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmd_updateActionPerformed(evt);
            }
        });

        Cmd_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        Cmd_delete.setText("Delete");
        Cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmd_deleteActionPerformed(evt);
            }
        });

        Cmd_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        Cmd_save.setText("Save");
        Cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmd_saveActionPerformed(evt);
            }
        });

        Cmd_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        Cmd_clear.setText("Clear");
        Cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmd_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Cmd_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cmd_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cmd_update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cmd_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cmd_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cmd_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Table_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_adminMouseClicked
        try {
            int row = Table_admin.getSelectedRow();
            String Table_click = (Table_admin.getModel().getValueAt(row,0).toString());
            String sql ="select * from reserver where idreserv ='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()){
                String add1 = rs.getString("IDRESERV");
                txt_id.setText(add1);
                String add2 = rs.getString("NBPLACE");
                txt_nb.setText(add2);
                String add3 = rs.getString("DATERESERV");
                txt_date.setText(add3);
                String add4 = rs.getString("ID");
                txt_idCircuit.setText(add4);
                String add5 = rs.getString("IDCLIENT");
                txt_idClient.setText(add5);
                

            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_Table_adminMouseClicked

    private void Table_adminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table_adminKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN ||evt.getKeyCode()==KeyEvent.VK_UP ){
            try {
                int row = Table_admin.getSelectedRow();
                String Table_click = (Table_admin.getModel().getValueAt(row,0).toString());
                String sql ="select * from reserver where idreserv ='"+Table_click+"'";
                pst=conn.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()){
                String add1 = rs.getString("IDRESERV");
                txt_id.setText(add1);
                String add2 = rs.getString("NBPLACE");
                txt_nb.setText(add2);
                String add3 = rs.getString("DATERESERV");
                txt_date.setText(add3);
                String add4 = rs.getString("ID");
                txt_idCircuit.setText(add4);
                String add5 = rs.getString("IDCLIENT");
                txt_idClient.setText(add5);
             }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }

        }
    }//GEN-LAST:event_Table_adminKeyPressed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try {
            String sql ="select * from reserver where datereserv =? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("IDRESERV");
                txt_id.setText(add1);
                String add2 = rs.getString("NBPLACE");
                txt_nb.setText(add2);
                String add3 = rs.getString("DATERESERV");
                txt_date.setText(add3);
                String add4 = rs.getString("ID");
                txt_idCircuit.setText(add4);
                String add5 = rs.getString("IDCLIENT");
                txt_idClient.setText(add5);
             }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        try {
            String sql ="select * from reserver where idreserv =? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("IDRESERV");
                txt_id.setText(add1);
                String add2 = rs.getString("NBPLACE");
                txt_nb.setText(add2);
                String add3 = rs.getString("DATERESERV");
                txt_date.setText(add3);
                String add4 = rs.getString("ID");
                txt_idCircuit.setText(add4);
                String add5 = rs.getString("IDCLIENT");
                txt_idClient.setText(add5);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void Cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_updateActionPerformed
        try {
            String value1 = txt_id.getText();
            String value2 = txt_nb.getText();
            String value3 = txt_date.getText();
            String value4 = txt_idCircuit.getText();
            String value5 = txt_idClient.getText();

            String sql="update reserver set idreserv='"+value1+"',nbplace='"+value2+"',datereserv='"+value3+"',id='"+value4+"',idclient='"+value5+"' where id='"+value1+"' ";
            pst=conn.prepareStatement(sql);
            pst.executeQuery();

            JOptionPane.showMessageDialog(null,"Mise à jour effectuée");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
    }//GEN-LAST:event_Cmd_updateActionPerformed

    private void Cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_deleteActionPerformed
        int p = JOptionPane.showConfirmDialog(null,"Confirmer la suppression ?","Supprimée",JOptionPane.YES_NO_OPTION);
        if(p==0){
            String sql = "delete from reserver where idreserv = ?";
            try {
                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_id.getText());
                pst.executeQuery();

                JOptionPane.showMessageDialog(null,"Ligne supprimée");

            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
            Update_table();
        }
    }//GEN-LAST:event_Cmd_deleteActionPerformed

    private void Cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_saveActionPerformed
        try {
            String sql ="Insert into reserver (IDRESERV,NBPLACE, DATERESERV,ID,IDCLIENT) values (?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_id.getText());
            pst.setString(2,txt_nb.getText());
            pst.setString(3,txt_date.getText());
            pst.setString(4,txt_idCircuit.getText());
            pst.setString(5,txt_idClient.getText());
            pst.executeQuery();

            JOptionPane.showMessageDialog(null,"Sauvegarde effectuée");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
    }//GEN-LAST:event_Cmd_saveActionPerformed

    private void Cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_clearActionPerformed
        txt_id.setText("");
        txt_nb.setText("");
        txt_date.setText("");
        txt_idCircuit.setText("");
        txt_idClient.setText("");
    }//GEN-LAST:event_Cmd_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Reserver_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserver_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserver_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserver_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserver_jframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cmd_clear;
    private javax.swing.JButton Cmd_delete;
    private javax.swing.JButton Cmd_save;
    private javax.swing.JButton Cmd_update;
    private javax.swing.JTable Table_admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_idCircuit;
    private javax.swing.JTextField txt_idClient;
    private javax.swing.JTextField txt_nb;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
