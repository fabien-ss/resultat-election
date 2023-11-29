package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "prestation")
public class Prestation
{

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "idprestation")
    public String idprestation;    

    @Column(name = "nom")
    public String nom;    


    public void setIdprestation(String value){
        this.idprestation = value;
    }
    public String getIdprestation(){
        return this.idprestation;
    }

    public void setNom(String value){
        this.nom = value;
    }
    public String getNom(){
        return this.nom;
    }

   
}
