package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Athlete a1 = new Athlete(12, 10.5f, 24);
        Athlete a2 = new Athlete(65, 76.5f, 30);
        Athlete a3 = new Athlete(99, 45.9f, 24);
        Athlete a4 = new Athlete(110, 17.0f, 44);

        List<Athlete> athletesListe = Arrays.asList(a1, a2, a3, a4);
        //Collections.sort(athletesListe, new AthleteComparator());
        Collections.sort(athletesListe);

        Map<Athlete, Double> athleteMap = new TreeMap<>(new AthleteComparator());
        athleteMap.put(a1, 12.0);
        athleteMap.put(a2, 76.0);
        athleteMap.put(a3, 35.8);
        athleteMap.put(a4, 87.3);

        for (Athlete athlete : athleteMap.keySet()) {
            System.out.println("key : " + athlete + "Val : " + athleteMap.get(athlete));
        }

        System.out.println("*************************");
        // ordonné selon l'ordre d'insertion.
        Map<Athlete, Double> athleteMap2 = new LinkedHashMap<Athlete, Double>();
        athleteMap2.put(a1, 12.0);
        athleteMap2.put(a2, 76.0);
        athleteMap2.put(a3, 35.8);
        athleteMap2.put(a4, 87.3);

        for (Athlete athlete : athleteMap2.keySet()) {
            System.out.println("key : " + athlete + "Val : " + athleteMap2.get(athlete));
        }

        Map<String, Integer> map = new HashMap<>();

        Gain c1 = new Gain("Adrien", 1000);
        Gain c2 = new Gain("Paul", 3478);
        Gain c3 = new Gain("Julien", 9875);
        Gain c4 = new Gain("Adrien", 9874);

        List<Gain> commercantList = Arrays.asList(c1, c2, c3, c4);

        for (Gain c : commercantList) {
            if (map.containsKey(c.getPrenom())) {
                int beneficeExistant = map.get(c.getPrenom());
                map.put(c.getPrenom(), c.getBenefice() + beneficeExistant);
            } else {
                map.put(c.getPrenom(), c.getBenefice());
            }
        }
    }
}
