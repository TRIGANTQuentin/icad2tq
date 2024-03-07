/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.model;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author a.andissac
 */
public class UtilisateursDAO {
    private Connection connexion;
    
    public UtilisateursDAO() {
        this.connexion = MySQLConnection.getConnexion();
    }
//    public Utilisateurs create(Utilisateurs unUtilisateur) {
//        
//    }
//    public Utilisateurs get(Integer id) {
//        
//    }
//    public List<Utilisateurs> getAll() {
//        
//    }
//    public void update(Utilisateurs unUtilisateur) {
//        
//    }
//    public void delete(Integer id) {
//        
//    }
//    public void delete(Utilisateurs unUtilisateur) {
//        
//    }
}
