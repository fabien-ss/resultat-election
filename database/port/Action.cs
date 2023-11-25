namespace database.port;

//[using]

[Table(name = "action")]
class Action
{

    [Column(name = "valeur")]
    public Int valeur { get; set; }    

    [Column(name = "id_action")]
    public String idAction { get; set; }    

    [Column(name = "nom")]
    public String nom { get; set; }    



    public void SetValeur(Int value){
        this.valeur = value;
    }
    public Int GetValeur(){
        return this.valeur;
    }

    public void SetIdAction(String value){
        this.idAction = value;
    }
    public String GetIdAction(){
        return this.idAction;
    }

    public void SetNom(String value){
        this.nom = value;
    }
    public String GetNom(){
        return this.nom;
    }

   
}
