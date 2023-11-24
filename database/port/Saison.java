package database.port;

//[using]

@Table(name = "saison")
class Saison
{

    @Column(name = "debut")
    public java.sql.Timestamp debut;    

    @Column(name = "id_saison")
    public String idSaison;    

    @Column(name = "details")
    public String details;    

    @Column(name = "fin")
    public java.sql.Timestamp fin;    



    public void setDebut(java.sql.Timestamp value){
        this.debut = value;
    }
    public java.sql.Timestamp getDebut(){
        return this.debut;
    }

    public void setIdSaison(String value){
        this.idSaison = value;
    }
    public String getIdSaison(){
        return this.idSaison;
    }

    public void setDetails(String value){
        this.details = value;
    }
    public String getDetails(){
        return this.details;
    }

    public void setFin(java.sql.Timestamp value){
        this.fin = value;
    }
    public java.sql.Timestamp getFin(){
        return this.fin;
    }

   
}
