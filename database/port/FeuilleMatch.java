package database.port;

//[using]

@Table(name = "feuille_match")
class FeuilleMatch
{

    @Column(name = "id_feuille_match")
    public int idFeuilleMatch;    

    @Column(name = "id_match")
    public String idMatch;    

    @Column(name = "id_equipe_joueur")
    public String idEquipeJoueur;    



    public void setIdFeuilleMatch(int value){
        this.idFeuilleMatch = value;
    }
    public int getIdFeuilleMatch(){
        return this.idFeuilleMatch;
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

   
}
