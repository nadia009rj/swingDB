/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingdb;

import fr.nadia.database.utils.DatabaseTools;
import fr.nadia.swingBd.frame.LoginFrame;

/**
 *
 * @author Administrateur
 */
public class SwingDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creation d une instance de la fenetre de login
        LoginFrame app = new LoginFrame();
        //AFFICHAGE DE LA FENETRE
        app.setVisible(true);
        //pour centrer la fenetre a l ecran
        app.setLocationRelativeTo(null);
    }
    
}
