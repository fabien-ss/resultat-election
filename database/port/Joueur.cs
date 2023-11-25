namespace database.port;

//[using]

[Table(name = "joueur")]
class Joueur
{

    [Column(name = "id_joueur")]
    public String idJoueur { get; set; }    

    [Column(name = "nom")]
    public String nom { get; set; }    

    [Column(name = "prenom")]
    public String prenom { get; set; }    

    [Column(name = "date_naissance")]
    public DateTime dateNaissance { get; set; }    



    public void SetIdJoueur(String value){
        this.idJoueur = value;
    }
    public String GetIdJoueur(){
        return this.idJoueur;
    }

    public void SetNom(String value){
        this.nom = value;
    }
    public String GetNom(){
        return this.nom;
    }

    public void SetPrenom(String value){
        this.prenom = value;
    }
    public String GetPrenom(){
        return this.prenom;
    }

    public void SetDateNaissance(DateTime value){
        this.dateNaissance = value;
    }
    public DateTime GetDateNaissance(){
        return this.dateNaissance;
    }

   
}
