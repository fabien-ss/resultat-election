package src.main.java.com.mycompany.scaff.java.relation;

import java.util.HashMap;
import java.util.Map;

import src.main.java.com.mycompany.scaff.java.utils.Mapping;
import src.main.java.com.mycompany.scaff.java.utils.TableUtility;

public class Table {
    
    String name;
    HashMap<String, String> columns = new HashMap<String, String>();
    String dataBase;

    public void write(String launguage, String pathOut,String k, Mapping mapping) throws Exception{
        String out = pathOut + "/"+
        TableUtility.firtLetterToUpper(TableUtility.ToJavaFormat(this.name)) + "." + launguage;
        
        String path =System.getProperty("user.dir") + "/modele/"+launguage+"/Classe";
        String attributeModelPath =System.getProperty("user.dir") +  "/modele/"+launguage+"/Attribut";
        String encapsulationModelPath =System.getProperty("user.dir") + "/modele/"+launguage+"/Encapsulation";
        
        
        String modele = TableUtility.chargerModele(path);
        String attributModel = TableUtility.chargerModele(attributeModelPath);
        String encapsulationModel = TableUtility.chargerModele(encapsulationModelPath);
       
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("[tableName]", this.name);
        
        data.put("[className]", TableUtility.firtLetterToUpper(TableUtility.ToJavaFormat(this.name)));
        modele = remplacerVariables(modele, attributModel, encapsulationModel, pathOut, mapping, k);
        TableUtility.ecrireLettre(modele, out);
    }
    public String remplacerVariables(String modele, String attributModel, String encapsulationModel, String pathOut, Mapping mapping, String k) {
        pathOut = pathOut.replace("/", ".");
        modele = modele.replace("[package]", k);
        modele = modele.replace("[tableName]", this.name);
        modele = modele.replace("[className]", TableUtility.firtLetterToUpper(TableUtility.ToJavaFormat(this.name)));
        String finalAttribute = "";
        String finalEncapsulation = "";

        for (Map.Entry<String, String> entry : this.columns.entrySet()) {
            String camelCase = TableUtility.ToJavaFormat(entry.getKey());
            String type = mapping.getMapping(entry.getValue()+"");
            String attribut =  attributModel.replace("[fieldType]",type)
            .replace("[fieldName]",TableUtility.ToJavaFormat(entry.getKey()))
            .replace("[columnName]", entry.getKey())
            .concat("\n");
            
            finalAttribute = finalAttribute + attribut;
            
            finalEncapsulation = finalEncapsulation + encapsulationModel.
            replace("[fieldNameFunc]",TableUtility.firtLetterToUpper(TableUtility.ToJavaFormat(entry.getKey()))).
            replace("[fieldType]", type)
            .replace("[fieldName]", TableUtility.ToJavaFormat(entry.getKey()))
            .concat("\n");
        }
        modele = modele.replace("[fields]", finalAttribute);
        modele = modele.replace("[encapsulation]", finalEncapsulation);
       
        return modele;
    }
    public Table(){}
    public void setName(String name) {
        this.name = name;
    }
    public HashMap<String, String> getColumns() {
        return columns;
    }
    public String getName() {
        return name;
    }
    public void addColumn(String column, String type){
        this.columns.put(column, type);
    }
    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }
    public String getDataBase() {
        return dataBase;
    }
}
