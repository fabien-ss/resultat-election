namespace database.port;

//[using]

[Table(name = "feuille_match")]
class FeuilleMatch
{

    [Column(name = "id_feuille_match")]
    public Int idFeuilleMatch { get; set; }    

    [Column(name = "id_match")]
    public String idMatch { get; set; }    

    [Column(name = "id_equipe_joueur")]
    public String idEquipeJoueur { get; set; }    



    public void SetIdFeuilleMatch(Int value){
        this.idFeuilleMatch = value;
    }
    public Int GetIdFeuilleMatch(){
        return this.idFeuilleMatch;
    }

    public void SetIdMatch(String value){
        this.idMatch = value;
    }
    public String GetIdMatch(){
        return this.idMatch;
    }

    public void SetIdEquipeJoueur(String value){
        this.idEquipeJoueur = value;
    }
    public String GetIdEquipeJoueur(){
        return this.idEquipeJoueur;
    }

   
}
