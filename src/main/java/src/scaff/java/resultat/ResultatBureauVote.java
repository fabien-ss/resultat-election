package src.scaff.java.resultat;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import annotation.Column;
import annotation.Table;
import dao.BddObject;
import src.scaff.java.entity.Resultat;

@Table(name = "details_bureau")
public class ResultatBureauVote extends BddObject{
    @Column
    String numeroBv;
    @Column
    String commune;
    @Column
    String region;
    @Column
    String district;
    @Column
    double suffrageExprime;
    @Column
    double suffrageBlanc;
    @Column
    double suffrageNul;
    @Column
    double inscrit;

    List<ResultatCandidat> resulatsCandidats = new ArrayList<ResultatCandidat>();

    public void stringToBureauVote(String modele, Connection c, String fileName) throws Exception{
        String[] dd = fileName.split(".pdf");
        this.setNumeroBv(dd[0]);
        String[] resultatCandidat = modele.split("d'ordre Liste des candidats Voix %");
        String[] candidats = resultatCandidat[1].split("%");
        HashMap<String, String> data = extractData(resultatCandidat[0]);
        this.setData(data);

        for (int i = 0; i < 13; i++) {
            ResultatCandidat resultatCandidat2 = new ResultatCandidat();
            resultatCandidat2.setVoie(candidats[i]); 
            this.resulatsCandidats.add(resultatCandidat2);
        }
      /*   for (int i = 0; i < 13; i++) {
             Resultat resultat = new Resultat(
                this.numeroBv,
                this.commune,
                this.region, 
                this.district,
                resulatsCandidats.get(i).getNumeroCandidat(), 
                resulatsCandidats.get(i).getResultat(),
                resulatsCandidats.get(i).getResultat()
            );

         resultat.insert(c);
        }*/
        this.save(c);
    }
    public String splitCandidat(String candidat){
        String[] candidats = candidat.split("%");
        return null;
    }

    public static HashMap<String, String> extractData(String text) {
        String patternInscrits = "Inscrits: (\\d+)";
        String patternCommune = "Commune: (\\w+)";
        String patternRegion = "R�gion: (\\w+)";
        
        String patternFokontany = "Fokontany: (\\w+)";
        String patternSuffragesExprimes = "Suffrages exprim�s: (\\d+)";
        String patternVotant = "Votants: (\\d+)";
        String patternBlanc = "Blancs: (\\d+)";
        String patternNul = "Nuls:(\\d+)";
        String patternDistrict = "District:(\\w+)";
        String patterRegionN = "Région: (\\w+)";
        //  String 
        Pattern pattern = Pattern.compile(patternInscrits + "|"
            + patternCommune + "|" + patternRegion + "|" 
            + patternFokontany + "|" + patternSuffragesExprimes 
            + "|" + patternVotant + "|" + patternBlanc + "|" + patternNul + "|"  + patternDistrict +
            "|" + patterRegionN
        );

        Matcher matcher = pattern.matcher(text);
        HashMap<String, String> map = new HashMap<>();
        while (matcher.find()) {
            map.put(matcher.group().split(":")[0], matcher.group().split(":")[1]);
        }
        return map;
    }

    public void setData(HashMap<String, String> data){
        this.setCommune(data.get("Commune"));
        this.setInscrit(data.get("Inscrits"));
        this.setRegion(data.get("R�gion"));
        if(this.getRegion() == null){
            this.setRegion(data.get("Région"));
        }
     //   System.out.println("Region");
    //    this.setSuffrageExprime(data.get("Suffrages exprim�s"));
        this.setSuffrageBlanc(data.get("Blancs"));
        this.setSuffrageNul(data.get("Nuls"));
        this.setDistrict(data.get("District"));
        this.setSuffrageExprime(Double.parseDouble(data.get("Votants")) - this.getSuffrageBlanc() - this.getSuffrageNul());
    }

    public ResultatBureauVote(){

    }
    public ResultatBureauVote(String numeroBv, String commune, String region, String district) {
        this.numeroBv = numeroBv;
        this.commune = commune;
        this.region = region;
        this.district = district;
    }
    public void setInscrit(String inscrit) {
        this.inscrit = Double.parseDouble(inscrit);
    }
    public double getInscrit() {
        return inscrit;
    }
    public String getNumeroBv() {
        return numeroBv;
    }
    public void setNumeroBv(String numeroBv) {
        this.numeroBv = numeroBv;
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
    public void setSuffrageExprime(double s){
        this.suffrageExprime = s;
    }
    public void setSuffrageBlanc(String suffrageBlanc) {

        this.suffrageBlanc = Double.parseDouble(suffrageBlanc);
    }
    public double getSuffrageBlanc() {
        return suffrageBlanc;
    }
    public void setSuffrageExprime(String suffrageExprime) {

        this.suffrageExprime = Double.parseDouble(suffrageExprime);
    }
    public double getSuffrageExprime() {
        return suffrageExprime;
    }
    public void setSuffrageNul(String suffrageNul) {
        this.suffrageNul = Double.parseDouble(suffrageNul);
    }
    public double getSuffrageNul() {
        return suffrageNul;
    }
    public void setResulatsCandidats(List<ResultatCandidat> resulatsCandidats) {
        this.resulatsCandidats = resulatsCandidats;
    }
    public List<ResultatCandidat> getResulatsCandidats() {
        return resulatsCandidats;
    }
    
}
