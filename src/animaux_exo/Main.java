package animaux_exo;

public class Main {

    public static void main(String[] args) {
        Homme per = new Homme("Dupont", "alex");
        Cheval cheval = new Cheval();
        Perroquet perroquet = new Perroquet();
        Perruche perruche = new Perruche();

       // System.out.println("je suis un perroquet et " + perroquet);
        perroquet.voler();
        perruche.voler();

        cheval.courir();
        cheval.marcher();
        System.out.println(per);//avec toString

        per.courir();
    }
}
