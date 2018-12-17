/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author fpa
 */
public interface ActionsBD {
    
    ResultSet getResultSet(String req);
    
    ArrayList getProgrammeurs();
    
    ProgrammeurBean getProgrammeur(String nom);
    
    String afficherProgrammeurs();
    
    void fermerRessources();
    
}
