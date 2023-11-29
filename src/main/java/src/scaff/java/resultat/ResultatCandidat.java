package src.scaff.java.resultat;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ResultatCandidat {

    double resultat;
    String numeroCandidat;
    String nomCandidat;
    String antoko;

    public void setVoie(String candidatString){
        String singleLineText = candidatString.replaceAll("\\r?\\n", " ");
        String[] data = singleLineText.split(" ");
        String antoko = data[data.length - 2];
        double voieObtenu = Double.parseDouble(extractNumber(antoko)) ;
        String numero = data[1];
        String candidatName = "";
        for (int i = 1; i < data.length - 2; i++) {
            if(data[i].equals("Antoko") | data[i].equals("Fitambolagnela/IAD")){
                break;
            }
            candidatName += data[i] + " ";
        }
        this.setNomCandidat(candidatName);
        this.setResultat(voieObtenu);
        this.setNomCandidat(numero);
        this.setNumeroCandidat(numero);
    }
    public static String extractNumber(String testString){
        String pattern = "(\\d+)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        String number = "";
        while(m.find()) {
            number = m.group();
        }
        return number;
    }
    public static void main(String[] args) {
        String number = "FMI-Ma0";
        double value = Double.parseDouble(ResultatCandidat.extractNumber(number));
        System.out.println(value);
    }
    public void stringToCandidat(String candidatArrayString){
        HashMap<String, String> quandidat = candidatPartie();
        for(Map.Entry<String, String> entry : quandidat.entrySet()){
            ResultatCandidat resultatCandidat = new ResultatCandidat();
            String patternPourcentage =entry.getKey() +"\n"+ entry.getValue() + "(\\d+)";
            Pattern pattern = Pattern.compile(patternPourcentage);
            Matcher matcher = pattern.matcher(candidatArrayString);
            while (matcher.find()) {
                System.out.println(matcher.group());
             }
            String[] data = candidatArrayString.split(entry.getValue());
        }
    }
    public static HashMap<String, String> candidatPartie(){
        HashMap<String, String> map = new HashMap<>();
        map.put("RAZAFINJOELINA Tahina", "FTT");
        map.put("ANDRIANAINARIVELO Hajo Herivelona", "MMM1");
        map.put("RAJOELINA Andry Nirina", "TGV");
        map.put("RATSIRAKA Iarovana Roland", "MTS");
        map.put("RAVALOMANANA Marc", "TIM");
        map.put("PARAINA Auguste Richard", "TT");
        map.put("RAZAFINTSIANDRAOFA Jean Brunelle", "APM");
        map.put("RATSIRAHONANA Lalaina Harilanto", "Antoko Fihavanantsika An'i Kristy");
        map.put("RAJAONARIMAMPIANINA RAKOTOARIMANANA Hery\n" + "Martial", "HVM");
        map.put("RADERANIRINA Sendrison Daniela", "Fy-M");
        map.put("RATSIETISON Jean-Jacques Jedidia","FMI-Ma1");
        map.put("RANDRIANASOLONIAIKO Siteny Thierry", "Fitambolagnela/IAD , PSD , RPSD Vaovao , ABA, &parrainage de\n"+ "150 elus");
        return map;
    }
    public void setResultat(double resultat) {
        this.resultat = (resultat);
    }
    public double getResultat() {
        return resultat;
    }
    public void setNumeroCandidat(String numeroCandidat) {
        this.numeroCandidat = numeroCandidat;
    }
    public String getNumeroCandidat() {
        return numeroCandidat;
    }
    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }
    public String getNomCandidat() {
        return nomCandidat;
    }
}