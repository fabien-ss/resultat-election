namespace database.port;

//[using]

[Table(name = "action_match")]
class ActionMatch
{

    [Column(name = "id_action_match")]
    public Int idActionMatch { get; set; }    

    [Column(name = "valeur")]
    public Int valeur { get; set; }    

    [Column(name = "date_action")]
    public DateTime dateAction { get; set; }    

    [Column(name = "id_match")]
    public String idMatch { get; set; }    

    [Column(name = "id_equipe_joueur")]
    public String idEquipeJoueur { get; set; }    

    [Column(name = "id_action")]
    public String idAction { get; set; }    



    public void SetIdActionMatch(Int value){
        this.idActionMatch = value;
    }
    public Int GetIdActionMatch(){
        return this.idActionMatch;
    }

    public void SetValeur(Int value){
        this.valeur = value;
    }
    public Int GetValeur(){
        return this.valeur;
    }

    public void SetDateAction(DateTime value){
        this.dateAction = value;
    }
    public DateTime GetDateAction(){
        return this.dateAction;
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

    public void SetIdAction(String value){
        this.idAction = value;
    }
    public String GetIdAction(){
        return this.idAction;
    }

   
}
