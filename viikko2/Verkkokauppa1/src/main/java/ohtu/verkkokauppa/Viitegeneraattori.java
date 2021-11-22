package ohtu.verkkokauppa;
import org.springframework.stereotype.Component;

@Component
public class Viitegeneraattori implements ViitegeneraattoriIF {



    
    private int seuraava;
    
    private Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
