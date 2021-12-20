package ohtu.kivipaperisakset;


public class KPSTekoaly extends KiviPaperiSakset {

   private Tekoaly tekoaly;

   public KPSTekoaly() {
    this.tekoaly = new Tekoaly();
}

    @Override
    protected String toisenSiirto() {
        String toisenSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + toisenSiirto);
        return toisenSiirto; 
    }



}