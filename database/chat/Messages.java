package database.chat;

import dao.annotation.Table;
import dao.annotation.Column;

@Table(name = "messages")
public class Messages
{

    @Column(name = "identification")
    public Integer identification;    

    @Column(name = "receiver")
    public Integer receiver;    

    @Column(name = "sender")
    public Integer sender;    

    @Column(name = "date_lecture")
    public java.sql.Timestamp dateLecture;    

    @Column(name = "id")
    public Integer id;    

    @Column(name = "date_envoi")
    public java.sql.Timestamp dateEnvoi;    

    @Column(name = "content")
    public String content;    



    public void setIdentification(Integer value){
        this.identification = value;
    }
    public Integer getIdentification(){
        return this.identification;
    }

    public void setReceiver(Integer value){
        this.receiver = value;
    }
    public Integer getReceiver(){
        return this.receiver;
    }

    public void setSender(Integer value){
        this.sender = value;
    }
    public Integer getSender(){
        return this.sender;
    }

    public void setDateLecture(java.sql.Timestamp value){
        this.dateLecture = value;
    }
    public java.sql.Timestamp getDateLecture(){
        return this.dateLecture;
    }

    public void setId(Integer value){
        this.id = value;
    }
    public Integer getId(){
        return this.id;
    }

    public void setDateEnvoi(java.sql.Timestamp value){
        this.dateEnvoi = value;
    }
    public java.sql.Timestamp getDateEnvoi(){
        return this.dateEnvoi;
    }

    public void setContent(String value){
        this.content = value;
    }
    public String getContent(){
        return this.content;
    }

   
}
