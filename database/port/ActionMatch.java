package database.port;

//[using]

@Table(name = "action_match")
class ActionMatch
{

    @Column(name = "id_action_match")
    public int idActionMatch;    

    @Column(name = "valeur")
    public int valeur;    

    @Column(name = "date_action")
    public java.sql.Timestamp dateAction;    

    @Column(name = "id_match")
    public String idMatch;    

    @Column(name = "id_equipe_joueur")
    public String idEquipeJoueur;    

    @Column(name = "id_action")
    public String idAction;    



    public void setIdActionMatch(int value){
        this.idActionMatch = value;
    }
    public int getIdActionMatch(){
        return this.idActionMatch;
    }

    public void setValeur(int value){
        this.valeur = value;
    }
    public int getValeur(){
        return this.valeur;
    }

    public void setDateAction(java.sql.Timestamp value){
        this.dateAction = value;
    }
    public java.sql.Timestamp getDateAction(){
        return this.dateAction;
    }

    public void setIdMatch(String value){
        this.idMatch = value;
    }
    public String getIdMatch(){
        return this.idMatch;
    }

    public void setIdEquipeJoueur(String value){
        this.idEquipeJoueur = value;
    }
    public String getIdEquipeJoueur(){
        return this.idEquipeJoueur;
    }

    public void setIdAction(String value){
        this.idAction = value;
    }
    public String getIdAction(){
        return this.idAction;
    }

   
}
