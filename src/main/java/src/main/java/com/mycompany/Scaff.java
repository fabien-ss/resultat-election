/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package src.main.java.com.mycompany;

import java.io.Console;
import java.sql.SQLException;

import src.main.java.com.mycompany.scaff.Java.connexion.Connexion;
import src.main.java.com.mycompany.scaff.Java.relation.Database;

/**
 *
 * @author fabien
 */
public class Scaff {

    public static void main(String[] args) throws Exception, ClassNotFoundException{
    
        Connexion connexion;
        
        try {
          Console console = System.console();
          if (console == null) {
              System.out.println("La console n'est pas disponible. Utilisez System.in");
              System.exit(1);
          }

          char[] passwordArray = console.readPassword("Entrez votre mot de passe : ");

          String password = new String(passwordArray);
          java.util.Arrays.fill(passwordArray, ' ');
          console.flush();

          //  if(!args[0].equals("-d")) throw new Exception("Option -d vide");
           // if(!args[2].equals("-l")) throw new Exception("Option -l vide");
          connexion = new Connexion(/*"chat" */args[0], args[1], password);
          java.sql.Connection c = connexion.enterBdd(); 
          Database database = new Database();
          database.setDatabase(c);
          database.writeClasses(args[3],args[4], args[5]);// "home/fabien/Documents/GitHub/Framework/Test-framework/WEB-INF/classes");
          c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(args.length > 0) System.out.println(args[0]);
    }       
}
