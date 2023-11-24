package database.port;

//[using]

@Table(name = "equipe_joueur")
class EquipeJoueur
{

    @Column(name = "id_equipe")
    public String idEquipe;    

    @Column(name = "id_saison")
    public String idSaison;    

    @Column(name = "id_equipe_joueur")
    public String idEquipeJoueur;    

    @Column(name = "dossart")
    public String dossart;    

    @Column(name = "id_joueur")
    public String idJoueur;    



    public void setIdEquipe(String value){
        this.idEquipe = value;
    }
    public String getIdEquipe(){
        return this.idEquipe;
    }

    public void setIdSaison(String value){
        this.idSaison = value;
    }
    public String getIdSaison(){
        return this.idSaison;
    }

    public void setIdEquipeJoueur(String value){
        this.idEquipeJoueur = value;
    }
    public String getIdEquipeJoueur(){
        return this.idEquipeJoueur;
    }

    public void setDossart(String value){
        this.dossart = value;
    }
    public String getDossart(){
        return this.dossart;
    }

    public void setIdJoueur(String value){
        this.idJoueur = value;
    }
    public String getIdJoueur(){
        return this.idJoueur;
    }

   
}
