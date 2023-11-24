package database.port;

//[using]

@Table(name = "match")
class Match
{

    @Column(name = "id_match")
    public String idMatch;    

    @Column(name = "id_equipe2")
    public String idEquipe2;    

    @Column(name = "point_equipe2")
    public int pointEquipe2;    

    @Column(name = "id_equipe1")
    public String idEquipe1;    

    @Column(name = "point_equipe1")
    public int pointEquipe1;    



    public void setIdMatch(String value){
        this.idMatch = value;
    }
    public String getIdMatch(){
        return this.idMatch;
    }

    public void setIdEquipe2(String value){
        this.idEquipe2 = value;
    }
    public String getIdEquipe2(){
        return this.idEquipe2;
    }

    public void setPointEquipe2(int value){
        this.pointEquipe2 = value;
    }
    public int getPointEquipe2(){
        return this.pointEquipe2;
    }

    public void setIdEquipe1(String value){
        this.idEquipe1 = value;
    }
    public String getIdEquipe1(){
        return this.idEquipe1;
    }

    public void setPointEquipe1(int value){
        this.pointEquipe1 = value;
    }
    public int getPointEquipe1(){
        return this.pointEquipe1;
    }

   
}
