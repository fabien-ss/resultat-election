package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "national")
public class National
{

    @Column(name = "nationalite")
    public String nationalite;    

    @Column(name = "prix")
    public Float prix;    

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "id_national")
    public String idNational;    


    public void setNationalite(String value){
        this.nationalite = value;
    }
    public String getNationalite(){
        return this.nationalite;
    }

    public void setPrix(Float value){
        this.prix = value;
    }
    public Float getPrix(){
        return this.prix;
    }

    public void setIdNational(String value){
        this.idNational = value;
    }
    public String getIdNational(){
        return this.idNational;
    }

   
}
