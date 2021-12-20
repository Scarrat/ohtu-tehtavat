package ohtu.kivipaperisakset;

public class Tehdas {
    
    public void luoPeli(String vastaus) {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        if (vastaus.endsWith("a")) {
            KPSPelaajaVsPelaaja kaksinpeli = new KPSPelaajaVsPelaaja();
            kaksinpeli.pelaa();
        } else if (vastaus.endsWith("b")) {
            KPSTekoaly yksinpeli = new KPSTekoaly();
            yksinpeli.pelaa();
        } else if (vastaus.endsWith("c")) {
            KPSParempiTekoaly pahaYksinpeli = new KPSParempiTekoaly();
            pahaYksinpeli.pelaa();    
        }
    }
}