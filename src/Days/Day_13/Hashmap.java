package Days.Day_13;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {


        // HashMap with real objects example : yes you can have Objects as HashMap values.
        // ( Feel free to try this code in code playground...)
        // import java.util.HashMap;
        // public class MyClass { public static void main(String[ ] args) {
        HashMap<String, gameStats> points = new HashMap<String, gameStats>();

        gameStats Amy = new gameStats(154,3);
        points.put("Amy", Amy);
        points.put("Dave", new gameStats(174,7) );
        points.put("Rob", new gameStats(674,39) );
        gameStats Abiel = new gameStats(184,3);
        points.put("Abiel",Abiel);
        points.put("Rahwit", new gameStats(184,3));
       // System.out.println(points.get("Amy").score);
        System.out.println(points.get("Abiel").score);
        System.out.println(points.get("Rahwit").gamesPlayed);
        System.out.println(points.keySet().toString());
        
    }
}
class gameStats{
    public int score = 0;
    public int gamesPlayed = 0;
    //Constructor here
    gameStats (int score, int games){
        this.score = score;
        this.gamesPlayed = games;

    }
}