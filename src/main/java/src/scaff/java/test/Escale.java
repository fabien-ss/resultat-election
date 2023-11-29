package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "escale")
public class Escale
{

    @ForeignKey
    @Column(name = "id_quaie")
    public String idQuaie;    

    @PrimaryKey(prefix = "", sequence = "", length = 0)
    @Column(name = "id_escale")
    public String idEscale;    

    @ForeignKey
    @Column(name = "id_prevision")
    public String idPrevision;    


    public void setIdQuaie(String value){
        this.idQuaie = value;
    }
    public String getIdQuaie(){
        return this.idQuaie;
    }

    public void setIdEscale(String value){
        this.idEscale = value;
    }
    public String getIdEscale(){
        return this.idEscale;
    }

    public void setIdPrevision(String value){
        this.idPrevision = value;
    }
    public String getIdPrevision(){
        return this.idPrevision;
    }

   
}
