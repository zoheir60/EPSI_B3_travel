
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
public class LieuAvisiter_jframe extends javax.swing.JFrame {
Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form LieuAvisiter
     */
    public LieuAvisiter_jframe() {
        initComponents();
        CoucheMetier objBll = new CoucheMetier(); 
        conn=objBll.ConnecrDb();
        Update_table();
    }
private void Update_table() {
        String sql ="select * from lieuxavisiter";
        try {
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table_place.setModel(DbUtils.resultSetToTableModel(rs));
 
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_namePlace = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_country = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_place = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Cmd_update = new javax.swing.JButton();
        Cmd_delete = new javax.swing.JButton();
        Cmd_save = new javax.swing.JButton();
        Cmd_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lieux à visiter");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 153, 255)));

        jLabel2.setText("Ville");

        jLabel3.setText("Pays");

        jLabel1.setText("Nom du lieu");

        jLabel5.setText("Prix");

        jLabel4.setText("Descriptif");

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
                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_namePlace, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(txt_city)
                            .addComponent(txt_country)
                            .addComponent(txt_description))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_namePlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table_place.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_place.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_placeMouseClicked(evt);
            }
        });
        Table_place.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table_placeKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Table_place);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Table_placeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_placeMouseClicked
        try {
            int row = Table_place.getSelectedRow();
            String Table_click = (Table_place.getModel().getValueAt(row,0).toString());
            String sql ="select * from lieuxavisiter where nomlieu ='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()){
                String add1 = rs.getString("NOMLIEU");
                txt_namePlace.setText(add1);
                String add2 = rs.getString("VILLE");
                txt_city.setText(add2);
                String add3 = rs.getString("PAYS");
                txt_country.setText(add3);
                String add4 = rs.getString("DESCRIPTIF");
                txt_description.setText(add4);
                String add5 = rs.getString("PRIX");
                txt_price.setText (add5);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_Table_placeMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try {
            String sql ="select * from lieuxavisiter where nomlieu =? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("NOMLIEU");
                txt_namePlace.setText(add1);
                String add2 = rs.getString("VILLE");
                txt_city.setText(add2);
                String add3 = rs.getString("PAYS");
                txt_country.setText(add3);
                String add4 = rs.getString("DESCRIPTIF");
                txt_description.setText(add4);
                String add5 = rs.getString("PRIX");
                txt_price.setText(add5);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        try {
            String sql ="select * from lieuxavisiter where ville =? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("NOMLIEU");
                txt_namePlace.setText(add1);
                String add2 = rs.getString("VILLE");
                txt_city.setText(add2);
                String add3 = rs.getString("PAYS");
                txt_country.setText(add3);
                String add4 = rs.getString("DESCRIPTIF");
                txt_description.setText(add4);
                String add5 = rs.getString("PRIX");
                txt_price.setText(add5);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void Cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_updateActionPerformed
        try {
            String value1 = txt_namePlace.getText();
            String value2 = txt_city.getText();
            String value3 = txt_country.getText();
            String value4 = txt_description.getText();
            String value5 = txt_price.getText();
            

            String sql="update lieuxavisiter set nomlieu='"+value1+"',ville='"+value2+"',pays='"+value3+"',descriptif='"+value4+"',prix='"+value5+"' where nomlieu='"+value1+"' ";
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
            String sql = "delete from lieuxavisiter where nomlieu = ?";
            try {
                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_namePlace.getText());
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
            String sql ="Insert into lieuxavisiter (NOMLIEU,VILLE,PAYS,DESCRIPTIF,PRIX) values (?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_namePlace.getText());
            pst.setString(2,txt_city.getText());
            pst.setString(3,txt_country.getText());
            pst.setString(4,txt_description.getText());
            pst.setString(5,txt_price.getText());
       
            pst.executeQuery();

            JOptionPane.showMessageDialog(null,"Sauvegarde effectuée");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
    }//GEN-LAST:event_Cmd_saveActionPerformed

    private void Cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_clearActionPerformed
        txt_namePlace.setText("");
        txt_city.setText("");
        txt_country.setText("");
        txt_description.setText("");
        txt_price.setText("");
        
    }//GEN-LAST:event_Cmd_clearActionPerformed

    private void Table_placeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table_placeKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DOWN ||evt.getKeyCode()==KeyEvent.VK_UP ){
            try {
                int row = Table_place.getSelectedRow();
                String Table_click = (Table_place.getModel().getValueAt(row,0).toString());
                String sql ="select * from lieuxavisiter where nomlieu ='"+Table_click+"'";
                pst=conn.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()){
                    String add1 = rs.getString("NOMLIEU");
                    txt_namePlace.setText(add1);
                    String add2 = rs.getString("VILLE");
                    txt_city.setText(add2);
                    String add3 = rs.getString("PAYS");
                    txt_country.setText(add3);
                    String add4 = rs.getString("DESCRIPTIF");
                    txt_description.setText(add4);
                    String add5 = rs.getString("PRIX");
                    txt_price.setText(add5);
                    
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_Table_placeKeyReleased
    }
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
            java.util.logging.Logger.getLogger(LieuAvisiter_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LieuAvisiter_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LieuAvisiter_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LieuAvisiter_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LieuAvisiter_jframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cmd_clear;
    private javax.swing.JButton Cmd_delete;
    private javax.swing.JButton Cmd_save;
    private javax.swing.JButton Cmd_update;
    private javax.swing.JTable Table_place;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_country;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_namePlace;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}