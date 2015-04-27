/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan
 */

public class CoucheMetier{
    
    Connection conn = ConnecrDb();
    
    public Connection ConnecrDb() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TP_CIRCUIT","admin");
            //JOptionPane.showMessageDialog(null, "Connection établie");
            return conn;
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }

    
    
    /*appel à la fonction PL/SQL calculPrixTotal2.
     * retourne un int. Cette int représent le cout d'un voyage ( prix du circuit et de ses étapes)
     */
    public int CalculatetotalPrice(int idCircuit) throws SQLException{
            CallableStatement cstmt = conn.prepareCall("{?=call calculPrixTotal2(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, idCircuit);
            cstmt.executeUpdate();
            int ret = cstmt.getInt(1);
            return ret;
     }
    
    
    
    /*appel à la fonction PL/SQL ReservationClient.
     * retourne un int. Cette int représent le succés ou non de la réservation
     *  1: réservation correctement éffectué (nouvelle ligne inséré dans la table reserver)
     * -1: erreur, problème de date
     * -2: erreur, problème d'état
     */
    public int reservTravel(String dateReserv, int idCircuit,int nbPerson,int idClient) throws SQLException{
            
            CallableStatement cstmt = conn.prepareCall("{?=call ReservationClient(?,?,?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, dateReserv);
            cstmt.setInt(3, idCircuit);
            cstmt.setInt(4, nbPerson);
            cstmt.setInt(5, idClient);
            cstmt.executeUpdate();
            int ret = cstmt.getInt(1);
        return ret;
    }
    
    
    
    /*appel à la fonction PL/SQL suppEtape.
     * retourne un int.
     *  1: succés de l'éxécution de la fonction
     *  ne renvoi rien sinon
     */
     public int eraseStep(int ordre,int idCircuit) throws SQLException{
            
            CallableStatement cstmt = conn.prepareCall("{?=call suppEtape(?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, ordre);
            cstmt.setInt(3, idCircuit);
            cstmt.executeUpdate();
            int ret = cstmt.getInt(1);
        return ret;
    }
    
     
     
     /*appel à la fonction PL/SQL infoCircuit.
     * retourne un varchar de 200.
     * renvoie une chaine de description sur le circuit entré en parametre
     */
    public String enquiryCircuit(int idCircuit) throws SQLException{
            
            CallableStatement cstmt = conn.prepareCall("{?=call infocircuit(?)}");
            cstmt.registerOutParameter(1, Types.VARCHAR);
            cstmt.setInt(2,idCircuit);
            cstmt.executeUpdate();
            String ret = cstmt.getString(1);
        return ret;
    }
    
    public void cleanPlaceToVisit(){
        try {
            String sql = "delete from lieuxavisiter where dejavisite = 0";
            PreparedStatement pst = conn.prepareStatement(sql);        
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CoucheMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}