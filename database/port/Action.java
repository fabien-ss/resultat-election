package database.port;

//[using]

@Table(name = "action")
class Action
{

    @Column(name = "valeur")
    public int valeur;    

    @Column(name = "id_action")
    public String idAction;    

    @Column(name = "nom")
    public String nom;    



    public void setValeur(int value){
        this.valeur = value;
    }
    public int getValeur(){
        return this.valeur;
    }

    public void setIdAction(String value){
        this.idAction = value;
    }
    public String getIdAction(){
        return this.idAction;
    }

    public void setNom(String value){
        this.nom = value;
    }
    public String getNom(){
        return this.nom;
    }

   
}
