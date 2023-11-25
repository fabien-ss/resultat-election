namespace database.port;

//[using]

[Table(name = "match")]
class Match
{

    [Column(name = "id_match")]
    public String idMatch { get; set; }    

    [Column(name = "id_equipe2")]
    public String idEquipe2 { get; set; }    

    [Column(name = "point_equipe2")]
    public Int pointEquipe2 { get; set; }    

    [Column(name = "id_equipe1")]
    public String idEquipe1 { get; set; }    

    [Column(name = "point_equipe1")]
    public Int pointEquipe1 { get; set; }    



    public void SetIdMatch(String value){
        this.idMatch = value;
    }
    public String GetIdMatch(){
        return this.idMatch;
    }

    public void SetIdEquipe2(String value){
        this.idEquipe2 = value;
    }
    public String GetIdEquipe2(){
        return this.idEquipe2;
    }

    public void SetPointEquipe2(Int value){
        this.pointEquipe2 = value;
    }
    public Int GetPointEquipe2(){
        return this.pointEquipe2;
    }

    public void SetIdEquipe1(String value){
        this.idEquipe1 = value;
    }
    public String GetIdEquipe1(){
        return this.idEquipe1;
    }

    public void SetPointEquipe1(Int value){
        this.pointEquipe1 = value;
    }
    public Int GetPointEquipe1(){
        return this.pointEquipe1;
    }

   
}
