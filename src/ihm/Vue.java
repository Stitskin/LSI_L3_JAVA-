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
        menuProgrammeur = new JMenu(IhmConstantes.)
        
        btnProgrammeur = new JButton(IhmConstantes.BTN_PROGRAMMEUR);
        btnAction = new JButton("Rechercher");
        labelNom = new JLabel("Nom");
        champNom = new JTextField();
        champNom.setColumns(10);
        zoneAffichageProgrammeurs = new JTextArea();

        /** Tous les widgets sont placés sur le panel
         * Et après le panel est "posé" sur notre frame de base
         */        
        pane.add(btnAfficherTous);
        pane.add(labelNom);
        pane.add(champNom);
        pane.add(btnRechercher);

        zoneAffichageProgrammeurs = new JTextArea(10, 50);
        scroll = new JScrollPane(zoneAffichageProgrammeurs);
        pane.add(scroll);

        btnAfficherTous.addActionListener(this);
        btnRechercher.addActionListener(this);

        /**
         * Par défaut, notre frame n'est pas visible
         * Il faut donc forcer la visibilité à "true"
         */
        this.setVisible(true);
        this.setTitle("TP 3");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Fermeture fenêtre = arrêt de l'application 
        setBounds(10, 10, 600, 300);

        this.add(pane); // Ajout du panel à notre frame de base
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnAfficherTous) {
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
        }
    }

}