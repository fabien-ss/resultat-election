package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "prevision")
public class Prevision
{

    @ForeignKey
    @Column(name = "id_bateau")
    public String idBateau;    

    @Column(name = "date_debut")
    public java.sql.Timestamp dateDebut;    

    @Column(name = "date_fin")
    public java.sql.Timestamp dateFin;    

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "id_prevision")
    public String idPrevision;    


    public void setIdBateau(String value){
        this.idBateau = value;
    }
    public String getIdBateau(){
        return this.idBateau;
    }

    public void setDateDebut(java.sql.Timestamp value){
        this.dateDebut = value;
    }
    public java.sql.Timestamp getDateDebut(){
        return this.dateDebut;
    }

    public void setDateFin(java.sql.Timestamp value){
        this.dateFin = value;
    }
    public java.sql.Timestamp getDateFin(){
        return this.dateFin;
    }

    public void setIdPrevision(String value){
        this.idPrevision = value;
    }
    public String getIdPrevision(){
        return this.idPrevision;
    }

   
}
