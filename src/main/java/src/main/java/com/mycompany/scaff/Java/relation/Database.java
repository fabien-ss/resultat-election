package src.main.java.com.mycompany.scaff.Java.relation;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import src.main.java.com.mycompany.scaff.Java.utils.Mapping;

public class Database {
    
    String databaseName;
    List<Table> tables;

    public void writeClasses(String language, String path, String k) throws Exception{
        Mapping mapping = new Mapping();
        mapping.setMappingFromList(language);
        for (Table table : this.tables) {
            table.write(language, path, mapping, k);
        }
    }

    public void setDatabase(Connection connexion) throws ClassNotFoundException, SQLException{
        this.tables = new ArrayList<>();
        
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
            this.tables.add(table);
        }
//        this.tables = tables;
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
