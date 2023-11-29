package src.scaff.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import src.scaff.java.connexion.Connexion;
import src.scaff.java.resultat.ResultatBureauVote;

public class Main {
   public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
        Connexion connexion = new Connexion("fifidianana", "your_username", "your_password");
        Connection c = connexion.enterBdd();

        String directoryPath = "/home/fabien/Documents/bv2a";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                StringBuilder contenu = new StringBuilder();
                ResultatBureauVote resultatBureauVote = new ResultatBureauVote();
                try (BufferedReader reader = new BufferedReader(new FileReader(file.getPath()))) {
                    String ligne;
                    while ((ligne = reader.readLine()) != null) {
                        contenu.append(ligne).append("\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                resultatBureauVote.stringToBureauVote(contenu.toString(), c, file.getName());
            }
        }
   }
}
