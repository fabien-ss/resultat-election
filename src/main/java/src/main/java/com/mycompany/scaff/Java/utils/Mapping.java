package src.main.java.com.mycompany.scaff.Java.utils;

import java.util.HashMap;
public class Mapping {
    HashMap<String, String> mappings = new HashMap<String, String>();
    public Mapping(){
    
        mappings.put("VARCHAR", "String");
        mappings.put("CHAR", "String");
        mappings.put("TEXT", "String");
        
        mappings.put("TINYINT", "byte");
        mappings.put("SMALLINT", "short");
        mappings.put("INT4", "int");
        mappings.put("INT8", "int");
        mappings.put("INT2", "int");
        mappings.put("BIGINT", "long");
        
        mappings.put("FLOAT", "float");
        mappings.put("FLOAT8", "float");
        mappings.put("DOUBLE", "double");
        
        mappings.put("DATE", "java.sql.Date");
        mappings.put("TIME", "java.sql.Time");
        mappings.put("TIMESTAMP", "java.sql.Timestamp");
        mappings.put("TIMESTAMPTZ", "java.sql.Timestamp");
        mappings.put("SERIAL", "int");
        mappings.put("BOOL", "boolean");
    }
    public String getMapping(String columnName) {
        return mappings.get(columnName);
    }
}
