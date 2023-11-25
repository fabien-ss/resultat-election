namespace database.port;

//[using]

[Table(name = "equipe_joueur")]
class EquipeJoueur
{

    [Column(name = "id_equipe")]
    public String idEquipe { get; set; }    

    [Column(name = "id_saison")]
    public String idSaison { get; set; }    

    [Column(name = "id_equipe_joueur")]
    public String idEquipeJoueur { get; set; }    

    [Column(name = "dossart")]
    public String dossart { get; set; }    

    [Column(name = "id_joueur")]
    public String idJoueur { get; set; }    



    public void SetIdEquipe(String value){
        this.idEquipe = value;
    }
    public String GetIdEquipe(){
        return this.idEquipe;
    }

    public void SetIdSaison(String value){
        this.idSaison = value;
    }
    public String GetIdSaison(){
        return this.idSaison;
    }

    public void SetIdEquipeJoueur(String value){
        this.idEquipeJoueur = value;
    }
    public String GetIdEquipeJoueur(){
        return this.idEquipeJoueur;
    }

    public void SetDossart(String value){
        this.dossart = value;
    }
    public String GetDossart(){
        return this.dossart;
    }

    public void SetIdJoueur(String value){
        this.idJoueur = value;
    }
    public String GetIdJoueur(){
        return this.idJoueur;
    }

   
}
