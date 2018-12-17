/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import data.DataTransac;
import data.ProgrammeurBean;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Jacques
 */
public class Vue extends JFrame implements ActionListener {

    // Déclaration des attributs
    // L'initialisation se fera "en local" dans des méthodes
//    private JButton btnAfficherTous;
//    private JButton btnRechercher;
    private JMenuBar menuBar;
    private JMenu menuProgrammeur;
    private JMenu menuAction;
    private JMenu sMenuAfficher;
    private JMenuItem ssMenuAfficherTous;
    private JMenuItem sMenuModifier;
    private JMenuItem sMenuSupprimer;
    private JMenuItem sMenuAjouter;
    private JMenuItem sMenuQuitter;
    private JMenuItem sMenuAfficherTous;
    
    
    private JLabel labelNom;
    private JTextField champNom;
    private JTextArea zoneAffichageProgrammeurs;
    private JPanel pane;
    private JScrollPane scroll;
    private ProgrammeurBean progrBean;
    private String contenuTextArea;
    private DataTransac dt;

    public void init() {
        pane = new JPanel(); // Créantion d'un panel pour gérer les widgets
        
        menuBar = new JMenuBar();
        menuProgrammeur = new JMenu(IhmConstantes.MENU_PROGRAMMEUR);
        menuAction = new JMenu(IhmConstantes.MENU_ACTION);
        
        sMenuAfficher = new JMenu(IhmConstantes.SMENU_AFFICHER);
        sMenuAjouter = new JMenuItem(IhmConstantes.SMENU_AJOUTER);
        sMenuModifier = new JMenuItem(IhmConstantes.SMENU_MODIFIER);
        sMenuSupprimer = new JMenuItem(IhmConstantes.SMENU_SUPPRIMER);
        sMenuQuitter = new JMenuItem(IhmConstantes.SMENU_QUITTER);
        sMenuAfficherTous = new JMenuItem(IhmConstantes.SMENU_AFFICHER_TOUS);
        
        menuProgrammeur.add(sMenuAfficher);
        sMenuAfficher.add(sMenuAfficherTous);
        
        menuProgrammeur.add(sMenuModifier);
        menuProgrammeur.add(sMenuSupprimer);
        menuProgrammeur.add(sMenuAjouter);
        
        menuAction.add(sMenuQuitter);
        
        menuBar.add(menuProgrammeur);
        menuBar.add(menuAction);
        
        pane.add(menuBar);
        
        zoneAffichageProgrammeurs = new JTextArea();
        zoneAffichageProgrammeurs = new JTextArea(50, 80);
        scroll = new JScrollPane(zoneAffichageProgrammeurs);
        pane.add(scroll);

       // btnAfficherTous.addActionListener(this);
       // btnRechercher.addActionListener(this);

        /**
         * Par défaut, notre frame n'est pas visible
         * Il faut donc forcer la visibilité à "true"
         */
        this.setVisible(true);
        this.setTitle("TP 3");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Fermeture fenêtre = arrêt de l'application 
        setBounds(10, 10, 1000, 1000);

        this.add(pane); // Ajout du panel à notre frame de base
        
        afficherProg();
    }
    
    private void afficherProg(){
        sMenuAfficherTous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("okkkkkkk");
                dt = new DataTransac();
                contenuTextArea = dt.afficherProgrammeurs();
                //System.out.println(contenuTextArea);
                zoneAffichageProgrammeurs.setText(contenuTextArea);
                dt.fermerRessources();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        
        
        /*if (event.getSource() == sMenuAfficherTous) {
            dt = new DataTransac();
            contenuTextArea = dt.afficherProgrammeurs();
            zoneAffichageProgrammeurs.setText(contenuTextArea);
            dt.fermerRessources();
        } else if (event.getSource() == btnRechercher) {
            dt = new DataTransac();
            progrBean = dt.getProgrammeur(this.champNom.getText());
            if (progrBean == null) {
                JOptionPane.showMessageDialog(this, "Programmeur introuvable", "Echec", JOptionPane.ERROR_MESSAGE);
            } else {
                contenuTextArea = progrBean.toString();
                zoneAffichageProgrammeurs.setText(contenuTextArea);
            }

            dt.fermerRessources();
        }*/
    }
    

}
