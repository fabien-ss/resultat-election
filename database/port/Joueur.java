package database.port;

//[using]

@Table(name = "joueur")
class Joueur
{

    @Column(name = "id_joueur")
    public String idJoueur;    

    @Column(name = "nom")
    public String nom;    

    @Column(name = "prenom")
    public String prenom;    

    @Column(name = "date_naissance")
    public java.sql.Timestamp dateNaissance;    



    public void setIdJoueur(String value){
        this.idJoueur = value;
    }
    public String getIdJoueur(){
        return this.idJoueur;
    }

    public void setNom(String value){
        this.nom = value;
    }
    public String getNom(){
        return this.nom;
    }

    public void setPrenom(String value){
        this.prenom = value;
    }
    public String getPrenom(){
        return this.prenom;
    }

    public void setDateNaissance(java.sql.Timestamp value){
        this.dateNaissance = value;
    }
    public java.sql.Timestamp getDateNaissance(){
        return this.dateNaissance;
    }

   
}
