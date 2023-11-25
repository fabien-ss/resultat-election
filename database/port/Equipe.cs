namespace database.port;

//[using]

[Table(name = "equipe")]
class Equipe
{

    [Column(name = "ville")]
    public String ville { get; set; }    

    [Column(name = "id_equipe")]
    public String idEquipe { get; set; }    

    [Column(name = "nom")]
    public String nom { get; set; }    

    [Column(name = "pays")]
    public String pays { get; set; }    

    [Column(name = "date_creation")]
    public DateTime dateCreation { get; set; }    



    public void SetVille(String value){
        this.ville = value;
    }
    public String GetVille(){
        return this.ville;
    }

    public void SetIdEquipe(String value){
        this.idEquipe = value;
    }
    public String GetIdEquipe(){
        return this.idEquipe;
    }

    public void SetNom(String value){
        this.nom = value;
    }
    public String GetNom(){
        return this.nom;
    }

    public void SetPays(String value){
        this.pays = value;
    }
    public String GetPays(){
        return this.pays;
    }

    public void SetDateCreation(DateTime value){
        this.dateCreation = value;
    }
    public DateTime GetDateCreation(){
        return this.dateCreation;
    }

   
}
