package database.port;

//[using]

@Table(name = "equipe")
class Equipe
{

    @Column(name = "ville")
    public String ville;    

    @Column(name = "id_equipe")
    public String idEquipe;    

    @Column(name = "nom")
    public String nom;    

    @Column(name = "pays")
    public String pays;    

    @Column(name = "date_creation")
    public java.sql.Timestamp dateCreation;    



    public void setVille(String value){
        this.ville = value;
    }
    public String getVille(){
        return this.ville;
    }

    public void setIdEquipe(String value){
        this.idEquipe = value;
    }
    public String getIdEquipe(){
        return this.idEquipe;
    }

    public void setNom(String value){
        this.nom = value;
    }
    public String getNom(){
        return this.nom;
    }

    public void setPays(String value){
        this.pays = value;
    }
    public String getPays(){
        return this.pays;
    }

    public void setDateCreation(java.sql.Timestamp value){
        this.dateCreation = value;
    }
    public java.sql.Timestamp getDateCreation(){
        return this.dateCreation;
    }

   
}
