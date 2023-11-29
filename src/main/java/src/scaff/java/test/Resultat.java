package src.scaff.java.test;

import annotation.*;
// ok
@Table(name = "resultat")
public class Resultat
{

    @Column(name = "voixobtenu")
    public Float voixobtenu;    

    @Column(name = "commune")
    public String commune;    

    @Column(name = "district")
    public String district;    

    @Column(name = "bureauvote")
    public String bureauvote;    

    @ForeignKey
    @Column(name = "numerocandidat")
    public String numerocandidat;    

    @Column(name = "region")
    public String region;    


    public void setVoixobtenu(Float value){
        this.voixobtenu = value;
    }
    public Float getVoixobtenu(){
        return this.voixobtenu;
    }

    public void setCommune(String value){
        this.commune = value;
    }
    public String getCommune(){
        return this.commune;
    }

    public void setDistrict(String value){
        this.district = value;
    }
    public String getDistrict(){
        return this.district;
    }

    public void setBureauvote(String value){
        this.bureauvote = value;
    }
    public String getBureauvote(){
        return this.bureauvote;
    }

    public void setNumerocandidat(String value){
        this.numerocandidat = value;
    }
    public String getNumerocandidat(){
        return this.numerocandidat;
    }

    public void setRegion(String value){
        this.region = value;
    }
    public String getRegion(){
        return this.region;
    }

   
}
