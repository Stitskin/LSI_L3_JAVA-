/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Jacques
 */
public class ProgrammeurBean {

    private String matricule;
    private String nom;
    private String prenom;
    private String addresse;
    private String pseudo;
    private String responsable;
    private String hobby;
    private Date dateNaissance;
    private Date dateEmbauche;
    
    public ProgrammeurBean() {
    }

    @Override
    public String toString() {
        String affichage = "Matricule : " + this.getMatricule() + "\n"
                            + "Nom : " + this.getNom() + "\n"
                            + "Prenom : " + this.getPrenom() + "\n"
                            + "Adresse : " + this.getAddresse() + "\n"
                            + "Pseudo : " + this.getPseudo() + "\n"
                            + "Responsable: " + this.getResponsable() + "\n"
                            + "Hobby: " + this.getHobby() + "\n"
                            + "Date de naissance: " + this.dateNaissance + "\n"
                            + "Date d'embauche: " + this.getDateEmbauche() + "\n"
                            + "\n";

        return affichage;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

}
