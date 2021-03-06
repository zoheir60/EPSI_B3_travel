
import BLL.CoucheMetier;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Etape_jframe extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Etape_jframe
     */
    public Etape_jframe() {
        initComponents();
        CoucheMetier objBll = new CoucheMetier(); 
        conn=objBll.ConnecrDb();
        Update_table();
        FillCombo();
    }
    private void Update_table() {
        String sql ="select * from etape";
        try {
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table_etape.setModel(DbUtils.resultSetToTableModel(rs));
 
            }
        catch(Exception e) {
                            JOptionPane.showMessageDialog(null,e);
        }
}
    private void FillCombo(){
       
        String sql ="select * from lieuxavisiter";
        try {
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("nomlieu");
                ComboBox_place.addItem(name);
                
                
            }
        }
        catch (Exception e){
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
        Table_etape = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_ordre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_duration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_country = new javax.swing.JTextField();
        txt_idCircuit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        ComboBox_place = new javax.swing.JComboBox();
        txt_date = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Cmd_update = new javax.swing.JButton();
        Cmd_delete = new javax.swing.JButton();
        Cmd_save = new javax.swing.JButton();
        Cmd_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Etape");

        Table_etape.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_etape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_etapeMouseClicked(evt);
            }
        });
        Table_etape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table_etapeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table_etape);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Users information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 153, 255)));

        jLabel2.setText("IDcircuit");

        jLabel3.setText("Pays");

        jLabel1.setText("Ordre");

        jLabel6.setText("Nom du lieu");

        jLabel5.setText("Durée");

        jLabel4.setText("Date Etape");

        jLabel7.setText("Ville");

        ComboBox_place.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ComboBox_placePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txt_date.setDateFormatString("yyyy-MM-dd");

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
                        .addComponent(txt_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_city)
                            .addComponent(ComboBox_place, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_ordre, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(txt_idCircuit)
                                    .addComponent(txt_country)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ordre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idCircuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(ComboBox_place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Table_etapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_etapeMouseClicked
        try {
            int row = Table_etape.getSelectedRow();
            String Table_click = (Table_etape.getModel().getValueAt(row,0).toString());
            String sql ="select * from etape where ordre ='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()){
                String add1 = rs.getString("ORDRE");
                txt_ordre.setText(add1);
                String add2 = rs.getString("ID");
                txt_idCircuit.setText(add2);
                String add3 = rs.getString("PAYS");
                txt_country.setText(add3);
                Date add4 = rs.getDate("DATEETAPE");
                txt_date.setDate(add4);
                String add5 = rs.getString("DUREE");
                txt_duration.setText(add5);
                String add6 = rs.getString("NOMLIEU");
                ComboBox_place.setSelectedItem(add6);
                String add7 = rs.getString("VILLE");
                txt_city.setText(add7);
                

            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_Table_etapeMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try {
            String sql ="select * from etape where ordre =? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("ORDRE");
                txt_ordre.setText(add1);
                String add2 = rs.getString("ID");
                txt_idCircuit.setText(add2);
                String add3 = rs.getString("PAYS");
                txt_country.setText(add3);
                Date add4 = rs.getDate("DATEETAPE");
                txt_date.setDate(add4);
                String add5 = rs.getString("DUREE");
                txt_duration.setText(add5);
                String add6 = rs.getString("NOMLIEU");
                ComboBox_place.setSelectedItem(add6);
                String add7 = rs.getString("VILLE");
                txt_city.setText(add7);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        try {
            String sql ="select * from etape where ID =? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("ORDRE");
                txt_ordre.setText(add1);
                String add2 = rs.getString("ID");
                txt_idCircuit.setText(add2);
                String add3 = rs.getString("PAYS");
                txt_country.setText(add3);
                Date add4 = rs.getDate("DATEETAPE");
                txt_date.setDate(add4);
                String add5 = rs.getString("DUREE");
                txt_duration.setText(add5);
                String add6 = rs.getString("NOMLIEU");
                ComboBox_place.setSelectedItem(add6);
                String add7 = rs.getString("VILLE");
                txt_city.setText(add7);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void Cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_updateActionPerformed
        try {
            String value1 = txt_ordre.getText();
            String value2 = txt_idCircuit.getText();
            String value3 = txt_country.getText();
            String value4 = new SimpleDateFormat("dd/MM/YYYY").format(txt_date.getDate());
            String value5 = txt_duration.getText();
            Object value6 = ComboBox_place.getSelectedItem();
            String value7 = txt_city.getText();

            String sql="update etape set ordre='"+value1+"',id='"+value2+"',pays='"+value3+"',dateEtape='"+value4+"',duree='"+value5+"',nomlieu='"+value6+"',ville='"+value7+"' where ordre='"+value1+"' ";
            System.out.println(sql);
            pst=conn.prepareStatement(sql);
            pst.executeQuery();

            JOptionPane.showMessageDialog(null,"Mise à jour effectuée");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
    }//GEN-LAST:event_Cmd_updateActionPerformed

    /*appel à la fonction PL/SQL suppEtape.
     * retourne un int.
     *  1: succés de l'éxécution de la fonction
     */
     /*   public int eraseStep(int ordre,int idCircuit) throws SQLException{
            
            CallableStatement cstmt = conn.prepareCall("{?=call suppEtape(?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, ordre);
            cstmt.setInt(3, idCircuit);
            cstmt.executeUpdate();
            int ret = cstmt.getInt(1);
            return ret;
        }*/
        
    private void Cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_deleteActionPerformed
       
        int p = JOptionPane.showConfirmDialog(null,"Confirmer la suppression ?","Supprimée",JOptionPane.YES_NO_OPTION);
        CoucheMetier objBll = new CoucheMetier();
        if(p==0){
            int row = Table_etape.getSelectedRow();
            String Table_click = Table_etape.getModel().getValueAt(row,0).toString();
            String Table_click1 = Table_etape.getModel().getValueAt(row,4).toString();
            
            int a;
            a = Integer.parseInt(Table_click);
            int b;
            b = Integer.parseInt(Table_click1);
            try {
                
            objBll.eraseStep(a,b);
               //eraseStep(a,b);
            } catch (SQLException ex) {
                Logger.getLogger(Etape_jframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            Update_table();
        }
    }//GEN-LAST:event_Cmd_deleteActionPerformed

    private void Cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_saveActionPerformed
        try {
            String sql ="Insert into etape (ORDRE,ID,PAYS,DATEETAPE,DUREE,NOMLIEU,VILLE) values (?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_ordre.getText());
            pst.setString(2,txt_idCircuit.getText());
            pst.setString(3,txt_country.getText());
            pst.setDate(4, new java.sql.Date(txt_date.getDate().getTime()));
            pst.setString(5,txt_duration.getText());
            pst.setObject(6,ComboBox_place.getSelectedItem());
            pst.setString(7,txt_city.getText());
            pst.executeQuery();

            JOptionPane.showMessageDialog(null,"Sauvegarde effectuée");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
    }//GEN-LAST:event_Cmd_saveActionPerformed

    private void Cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_clearActionPerformed
        txt_ordre.setText("");
        txt_idCircuit.setText("");
        txt_country.setText("");
        txt_date.setDateFormatString("");
        txt_duration.setText("");
        ComboBox_place.setSelectedItem("");
        txt_city.setText("");
    }//GEN-LAST:event_Cmd_clearActionPerformed

    private void ComboBox_placePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ComboBox_placePopupMenuWillBecomeInvisible
        String tmp = (String)ComboBox_place.getSelectedItem();
        String sql = "select * from lieuxavisiter where nomlieu = ?";
        
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,tmp);
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("PAYS");
                txt_country.setText(add1);
                String add2 = rs.getString("VILLE");
                txt_city.setText(add2);
            }       
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_ComboBox_placePopupMenuWillBecomeInvisible

    private void Table_etapeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table_etapeKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DOWN ||evt.getKeyCode()==KeyEvent.VK_UP ){
            try {
                int row = Table_etape.getSelectedRow();
                String Table_click = (Table_etape.getModel().getValueAt(row,0).toString());
                String sql ="select * from etape where ordre ='"+Table_click+"'";
                pst=conn.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()){
                    String add1 = rs.getString("ORDRE");
                    txt_ordre.setText(add1);
                    String add2 = rs.getString("ID");
                    txt_idCircuit.setText(add2);
                    String add3 = rs.getString("PAYS");
                    txt_country.setText(add3);
                    Date add4 = rs.getDate("DATEETAPE");
                    txt_date.setDate(add4);
                    String add5 = rs.getString("DUREE");
                    txt_duration.setText(add5);
                    String add6 = rs.getString("NOMLIEU");
                    ComboBox_place.setSelectedItem(add6);
                    String add7 = rs.getString("VILLE");
                    txt_city.setText(add7);
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }

        }
    }//GEN-LAST:event_Table_etapeKeyReleased

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
            java.util.logging.Logger.getLogger(Etape_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etape_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etape_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etape_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etape_jframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cmd_clear;
    private javax.swing.JButton Cmd_delete;
    private javax.swing.JButton Cmd_save;
    private javax.swing.JButton Cmd_update;
    private javax.swing.JComboBox ComboBox_place;
    private javax.swing.JTable Table_etape;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_country;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_duration;
    private javax.swing.JTextField txt_idCircuit;
    private javax.swing.JTextField txt_ordre;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
