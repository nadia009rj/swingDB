/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingdb;

import fr.nadia.swingBd.entity.User;

/**
 *pour utiliser Singleton
 * la classe se sert a stocker
 * @author Administrateur
 */
public class AppContext {
    private static User currentUser;

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        AppContext.currentUser = currentUser;
    }
    
    
}
