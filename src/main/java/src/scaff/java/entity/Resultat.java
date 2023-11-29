package src.scaff.java.entity;

import annotation.Column;
import annotation.Table;
import dao.BddObject;
import src.scaff.java.connexion.Connexion;

import java.sql.*;
import java.util.List;

@Table(name = "resultat")
public class Resultat extends BddObject{

    @Column(name = "bureauVote")
    String bueauVote;
    @Column(name = "commune")
    String commune;
    @Column(name = "region")
    String region;
    @Column(name = "district")
    String district;
    @Column(name = "numerocandidat")
    Integer numerocandidat;
    @Column(name = "voixobtenu")
    double voixobtenu;
    @Column(name = "votant")
    double votant;

    public double getParticipant(List<Resultat> resultats){
        double participant = 0;
        for (Resultat resultat : resultats) {
            participant += resultat.getVotant();
        }
        return participant;
    }

    public void insert(Connection c) throws Exception{
        String query = "INSERT INTO resultat VALUES ('"+this.getBueauVote()+"','"+this.getCommune()+"','"+this.getRegion()+"','"+this.getDistrict()+"','"+this.getNumerocandidat()+"','"+this.getVoixobtenu()+"','"+this.getVotant()+"')"; //
        this.executeUpdate(c, query);
    }

    public List<Resultat> getResultatByRegion(String region, Connection c) throws Exception{
        String query = "select 'ALL' bureauvote, 'ALL' commune, r.region,  'ALL' district, r.numerocandidat, sum(r.voixobtenu * 100) / (select sum(voixobtenu) from resultat where region=' "+region+"') voixobtenu, sum(r.voixobtenu) votant  from resultat r" +
        " join candidat c on c.numerocandidat = r.numerocandidat where r.region=' "+region+"' group by r.numerocandidat, r.region order by  r.numerocandidat";
        return this.executeQuery(c, query, new Resultat());
    }

    public List<Resultat> getResultatByDistrict(String district, Connection c) throws Exception{
        //Resultat resultat = new Resultat();
        //resultat.setDistrict(district);
        //return resultat.findWhere(c);
        String query = "select 'ALL' bureauvote, 'ALL' commune,  'ALL' region,  r.district, r.numerocandidat, sum(r.voixobtenu * 100) / (select sum(voixobtenu) from resultat where district='"+district+"') voixobtenu, sum(r.voixobtenu) votant  from resultat r" +
        " join candidat c on c.numerocandidat = r.numerocandidat where r.district='"+district+"' group by r.district, r.numerocandidat order by  r.numerocandidat";
        return this.executeQuery(c, query, new Resultat());
    }

    public List<Resultat> getResultatByCommune(String commune, Connection c) throws Exception{
        String query = "select 'ALL' bureauvote, r.commune, 'ALL' region, 'ALL' district, r.numerocandidat, sum(r.voixobtenu * 100) / (select sum(voixobtenu) from resultat where commune=' "+commune+"') voixobtenu, sum(r.voixobtenu) votant  from resultat r" +
        " join candidat c on c.numerocandidat = r.numerocandidat where r.commune=' "+commune+"' group by r.commune, r.numerocandidat order by  r.numerocandidat";
        System.out.println(query);
        return this.executeQuery(c, query, new Resultat());
    }

    public List<Resultat> getResultatBybureauvote(String bureauvote, Connection c) throws Exception{
        String query = "select r.bureauvote, 'ALL' commune, 'ALL' region, 'ALL' district, r.numerocandidat, sum(r.voixobtenu * 100) / (select sum(voixobtenu) from resultat where bureauvote='"+bureauvote+"') voixobtenu, sum(r.voixobtenu) votant  from resultat r" +
        " join candidat c on c.numerocandidat = r.numerocandidat where r.bureauvote='"+bureauvote+"' group by r.bureauvote, r.numerocandidat order by  r.numerocandidat";
        System.out.println(query);
        return this.executeQuery(c, query, new Resultat());
    }
    
    public List<Resultat> getAll(Connection c) throws Exception{
        String query = "select 'ALL' bureauvote, 'ALL' commune, 'ALL' region, 'ALL' district, r.numerocandidat, sum(r.voixobtenu * 100) / (select sum(voixobtenu) from resultat ) voixobtenu, sum(r.voixobtenu) votant from resultat r" +
        " join candidat c on c.numerocandidat = r.numerocandidat group by  r.numerocandidat order by  r.numerocandidat";
        System.out.println(query);
        return this.executeQuery(c, query, new Resultat());
    }
    public static void main(String[] args) {
        try {
            Connexion connexion = new Connexion("fifidianana", "your_username", "your_password");
            Connection c = connexion.enterBdd();
            List<Resultat> results = new Resultat().getResultatByDistrict("AMBOHIDRATRIMO",c);
            for (Resultat result : results) {
                System.out.println(result.getBueauVote() + " " + result.getCommune() + " " + result.getRegion() + " " + result.getDistrict() + " " + result.getNumerocandidat() + " " + result.getVoixobtenu());
            }
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Resultat(){

    }
    
    public Resultat(String bueauVote, String commune, String region, String district, String numerocandidat,
            double voixobtenu, double votant) {
        this.setBueauVote(bueauVote);
        this.setCommune(commune);
        this.setRegion(region);
        this.setDistrict(district);
        this.setNumerocandidat(numerocandidat);
        this.setVoixobtenu(voixobtenu);
        this.setVotant(votant);
    }

    public void setVotant(double votant) {
        this.votant = votant;
    }
    public double getVotant() {
    return votant;
}
    public String getBueauVote() {
        return bueauVote;
    }
    public void setBueauVote(String bueauVote) {
        this.bueauVote = bueauVote;
    }
    public String getCommune() {
        return commune;
    }
    public void setCommune(String commune) {
        this.commune = commune;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public Integer getNumerocandidat() {
        return numerocandidat;
    }
    public void setNumerocandidat(String numerocandidat) {
        this.numerocandidat = Integer.parseInt(numerocandidat);// numerocandidat;
    }
    public void setNumerocandidat(Integer numerocandidat) {
        this.numerocandidat = numerocandidat;//Integer.parseInt(numerocandidat);// numerocandidat;
    }
    public double getVoixobtenu() {
        return voixobtenu;
    }
    public void setVoixobtenu(double voixobtenu) {
        this.voixobtenu = voixobtenu;
    }

    
    
}