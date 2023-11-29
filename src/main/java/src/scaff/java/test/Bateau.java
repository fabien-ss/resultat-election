package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "bateau")
public class Bateau
{

    @Column(name = "longueur")
    public Float longueur;    

    @Column(name = "largeur")
    public Float largeur;    

    @Column(name = "profondeur")
    public Float profondeur;    

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "id_bateau")
    public String idBateau;    

    @Column(name = "poids")
    public Float poids;    

    @Column(name = "temps_remorquage")
    public Float tempsRemorquage;    

    @ForeignKey
    @Column(name = "id_national")
    public String idNational;    

    @ForeignKey
    @Column(name = "id_type_bateau")
    public String idTypeBateau;    

    @Column(name = "nom")
    public String nom;    


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

    public void setIdBateau(String value){
        this.idBateau = value;
    }
    public String getIdBateau(){
        return this.idBateau;
    }

    public void setPoids(Float value){
        this.poids = value;
    }
    public Float getPoids(){
        return this.poids;
    }

    public void setTempsRemorquage(Float value){
        this.tempsRemorquage = value;
    }
    public Float getTempsRemorquage(){
        return this.tempsRemorquage;
    }

    public void setIdNational(String value){
        this.idNational = value;
    }
    public String getIdNational(){
        return this.idNational;
    }

    public void setIdTypeBateau(String value){
        this.idTypeBateau = value;
    }
    public String getIdTypeBateau(){
        return this.idTypeBateau;
    }

    public void setNom(String value){
        this.nom = value;
    }
    public String getNom(){
        return this.nom;
    }

   
}
