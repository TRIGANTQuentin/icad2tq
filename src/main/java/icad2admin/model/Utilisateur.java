/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.model;

/**
 *
 * @author a.andissac
 */
public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String mdp;
    private String email;
    private String fonction;
    private String adresse;
    private String tel;
    private Boolean isdeleted;

    public Utilisateur(int id, String nom, String prenom, String mdp, String email, String fonction, String adresse, String tel,Boolean isdeleted ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.email = email;
        this.fonction = fonction;
        this.adresse = adresse;
        this.tel = tel;
        this.isdeleted = isdeleted;
    }

    public Utilisateur(String nom, String prenom, String mdp, String email, String fonction, String adresse, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.email = email;
        this.fonction = fonction;
        this.adresse = adresse;
        this.tel = tel;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public Boolean getEtat(){
        return isdeleted;
       
    }
    public void setEtat(Boolean isdeleted){
        this.isdeleted = isdeleted; 
    }
    
    
    
}
