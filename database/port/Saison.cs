namespace database.port;

//[using]

[Table(name = "saison")]
class Saison
{

    [Column(name = "debut")]
    public DateTime debut { get; set; }    

    [Column(name = "id_saison")]
    public String idSaison { get; set; }    

    [Column(name = "details")]
    public String details { get; set; }    

    [Column(name = "fin")]
    public DateTime fin { get; set; }    



    public void SetDebut(DateTime value){
        this.debut = value;
    }
    public DateTime GetDebut(){
        return this.debut;
    }

    public void SetIdSaison(String value){
        this.idSaison = value;
    }
    public String GetIdSaison(){
        return this.idSaison;
    }

    public void SetDetails(String value){
        this.details = value;
    }
    public String GetDetails(){
        return this.details;
    }

    public void SetFin(DateTime value){
        this.fin = value;
    }
    public DateTime GetFin(){
        return this.fin;
    }

   
}
