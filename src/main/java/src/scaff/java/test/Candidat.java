package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "candidat")
public class Candidat
{

    @Column(name = "partie")
    public String partie;    

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "numerocandidat")
    public String numerocandidat;    

    @Column(name = "nom")
    public String nom;    


    public void setPartie(String value){
        this.partie = value;
    }
    public String getPartie(){
        return this.partie;
    }

    public void setNumerocandidat(String value){
        this.numerocandidat = value;
    }
    public String getNumerocandidat(){
        return this.numerocandidat;
    }

    public void setNom(String value){
        this.nom = value;
    }
    public String getNom(){
        return this.nom;
    }

   
}
