package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "proposition")
public class Proposition
{

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "id_proposition")
    public String idProposition;    

    @Column(name = "attentes")
    public Float attentes;    

    @Column(name = "prix_estimation")
    public Float prixEstimation;    

    @ForeignKey
    @Column(name = "id_escale")
    public String idEscale;    


    public void setIdProposition(String value){
        this.idProposition = value;
    }
    public String getIdProposition(){
        return this.idProposition;
    }

    public void setAttentes(Float value){
        this.attentes = value;
    }
    public Float getAttentes(){
        return this.attentes;
    }

    public void setPrixEstimation(Float value){
        this.prixEstimation = value;
    }
    public Float getPrixEstimation(){
        return this.prixEstimation;
    }

    public void setIdEscale(String value){
        this.idEscale = value;
    }
    public String getIdEscale(){
        return this.idEscale;
    }

   
}
