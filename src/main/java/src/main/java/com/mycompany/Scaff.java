/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package src.main.java.com.mycompany;

import java.sql.Connection;
import java.sql.SQLException;

import src.main.java.com.mycompany.scaff.Java.connexion.Connexion;
import src.main.java.com.mycompany.scaff.Java.relation.Database;

/**
 *
 * @author fabien
 */
public class Scaff {

    public static void main(String[] args) throws Exception, ClassNotFoundException{
    
        if(args.length < 4) throw new Exception("Arguments vide");
        Connexion connexion;
        try {
            if(!args[0].equals("-d")) throw new Exception("Option -d vide");
            if(!args[2].equals("-l")) throw new Exception("Option -l vide");
           connexion = new Connexion(args[1], "fabien", "123Fabien$");
           java.sql.Connection c = connexion.enterBdd(); 
           Database database = new Database();
           database.getDatabase(c);
           database.writeClasses(args[3], "database/"+args[1]);
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }       
}
