package src.main.java.com.mycompany.scaff.Java.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    String url = "jdbc:postgresql://localhost:5432/";
    String database = "port";
    String utilisateur = "fabien";
    String motDePasse = "123Fabien$";
    String driver = "org.postgresql.Driver";

    public Connection enterBdd() throws SQLException, ClassNotFoundException{
        Class.forName(driver);
        return DriverManager.getConnection(url + database, utilisateur, motDePasse);    
    }

    public Connexion(){

    }
    
    public Connexion(String database, String utilisateur, String motDePasse) {
        this.database = database;
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
       
}
