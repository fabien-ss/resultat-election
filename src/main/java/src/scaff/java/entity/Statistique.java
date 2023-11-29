package src.scaff.java.entity;

import java.sql.Connection;
import java.util.List;

import annotation.Column;
import annotation.Table;
import dao.BddObject;
import src.scaff.java.connexion.Connexion;

@Table(name = "details_bureau")
public class Statistique extends BddObject{
    @Column
    double inscrit;
    @Column
    double suffrage_exprime;
    @Column
    double blanc;
    @Column
    double vote_null;

    public List<Statistique> getAll(Connection c) throws Exception{
        String sql = "select sum(inscrit) inscrit, sum(suffrageexprime)"+
        " suffrage_exprime, sum(suffrageblanc) blanc, sum(suffragenul) vote_null from details_bureau";
        System.out.println(sql);
        return this.executeQuery(c, sql, new Statistique());
    }
    
    public List<Statistique> getStatistiqueByBv(String bv, Connection c) throws Exception{
        String sql = "select sum(inscrit) inscrit, sum(suffrageexprime)"+
        " suffrage_exprime, sum(suffrageblanc) blanc, sum(suffragenul) vote_null from details_bureau where NumeroBv='"+bv+"'";
        System.out.println(sql);
        return this.executeQuery(c, sql, new Statistique());
    }

    public List<Statistique> getStatistiqueBycommune(String commune, Connection c) throws Exception{
        String sql = "select sum(inscrit) inscrit, sum(suffrageexprime)"+
        " suffrage_exprime, sum(suffrageblanc) blanc, sum(suffragenul) vote_null from details_bureau where commune=' "+commune+"'";
        System.out.println(sql);
        return this.executeQuery(c, sql, new Statistique());
    }

    public List<Statistique> getStatistiqueByregion(String region, Connection c) throws Exception{
        String sql = "select sum(inscrit) inscrit, sum(suffrageexprime)"+
        " suffrage_exprime, sum(suffrageblanc) blanc, sum(suffragenul) vote_null from details_bureau where region=' "+region+"'";
        System.out.println(sql);
        return this.executeQuery(c, sql, new Statistique());
    }

    public List<Statistique> getStatistiqueBydistrict(String district, Connection c) throws Exception{
        String sql = "select sum(inscrit) inscrit, sum(suffrageexprime)"+
        " suffrage_exprime, sum(suffrageblanc) blanc, sum(suffragenul) vote_null from details_bureau where district='"+district+"'";
        System.out.println(sql);
        return this.executeQuery(c, sql, new Statistique());
    }

    public static void main(String[] args) {
        try {
            Connexion connexion = new Connexion("fifidianana", "your_username", "your_password");
            Connection c = connexion.enterBdd();
            List<Statistique> results = new Statistique().getAll(c);
            for (Statistique result : results) {
                System.out.println(result.getBlanc() + " " + result.getInscrit() + " " + result.getSuffrage_exprime() + " " + result.getVote_null() );
            }
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Statistique(){

    }

    public double getInscrit() {
        return inscrit;
    }

    public void setInscrit(double inscrit) {
        this.inscrit = inscrit;
    }

    public double getSuffrage_exprime() {
        return suffrage_exprime;
    }

    public void setSuffrage_exprime(double suffrage_exprime) {
        this.suffrage_exprime = suffrage_exprime;
    }

    public double getBlanc() {
        return blanc;
    }

    public void setBlanc(double blanc) {
        this.blanc = blanc;
    }

    public double getVote_null() {
        return vote_null;
    }

    public void setVote_null(double vote_null) {
        this.vote_null = vote_null;
    }

    
}
