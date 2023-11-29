package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "quaie")
public class Quaie
{

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "id_quaie")
    public String idQuaie;    

    @Column(name = "longueur")
    public Float longueur;    

    @Column(name = "largeur")
    public Float largeur;    

    @Column(name = "profondeur")
    public Float profondeur;    

    @Column(name = "prix_depart")
    public Float prixDepart;    


    public void setIdQuaie(String value){
        this.idQuaie = value;
    }
    public String getIdQuaie(){
        return this.idQuaie;
    }

    public void setLongueur(Float value){
        this.longueur = value;
    }
    public Float getLongueur(){
        return this.longueur;
    }

    public void setLargeur(Float value){
        this.largeur = value;
    }
    public Float getLargeur(){
        return this.largeur;
    }

    public void setProfondeur(Float value){
        this.profondeur = value;
    }
    public Float getProfondeur(){
        return this.profondeur;
    }

    public void setPrixDepart(Float value){
        this.prixDepart = value;
    }
    public Float getPrixDepart(){
        return this.prixDepart;
    }

   
}
