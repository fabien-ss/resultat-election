package src.main.java.com.mycompany.scaff.Java.relation;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {
    
    String databaseName;
    List<Table> tables;

    public void writeClasses(String language, String path){
        for (Table table : this.tables) {
            table.write(language, path);
        }
    }

    public void getDatabase(Connection connexion) throws ClassNotFoundException, SQLException{
        List<Table> tables = new ArrayList<>();
        
        DatabaseMetaData metaData = connexion.getMetaData();
        String nomBaseDeDonnees = connexion.getCatalog();
        this.databaseName = nomBaseDeDonnees;
        ResultSet resultSetTables = metaData.getTables(nomBaseDeDonnees, null, "%", new String[]{"TABLE"});
        while (resultSetTables.next()) {
            String nomTable = resultSetTables.getString("TABLE_NAME");
            ResultSet resultSetColonnes = metaData.getColumns(nomBaseDeDonnees, null, nomTable, "%");
            Table table = new Table();
            table.setName(nomTable);
            table.setDataBase(nomBaseDeDonnees);
            while (resultSetColonnes.next()) {
                String nomColonne = resultSetColonnes.getString("COLUMN_NAME");
                String typeColonne = resultSetColonnes.getString("TYPE_NAME");
                table.addColumn(nomColonne, typeColonne);
            }
            tables.add(table);
        }
        this.tables = tables;
    }
   
    public String getDatabaseName() {
        return databaseName;
    }
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    public List<Table> getTables() {
        return tables;
    }public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
