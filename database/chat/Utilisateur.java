package database.chat;

import dao.annotation.Table;
import dao.annotation.Column;

@Table(name = "utilisateur")
public class Utilisateur
{

    @Column(name = "photo")
    public String photo;    

    @Column(name = "id")
    public Integer id;    

    @Column(name = "mot_de_passe")
    public String motDePasse;    

    @Column(name = "email")
    public String email;    



    public void setPhoto(String value){
        this.photo = value;
    }
    public String getPhoto(){
        return this.photo;
    }

    public void setId(Integer value){
        this.id = value;
    }
    public Integer getId(){
        return this.id;
    }

    public void setMotDePasse(String value){
        this.motDePasse = value;
    }
    public String getMotDePasse(){
        return this.motDePasse;
    }

    public void setEmail(String value){
        this.email = value;
    }
    public String getEmail(){
        return this.email;
    }

   
}
