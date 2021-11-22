package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
     //   System.out.println("json-muotoinen data:");
     //   System.out.println( bodyText );

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);

        ArrayList <Player> fin = new ArrayList<>();
        for (Player player: players) {
            if (player.getNationality().equals("FIN")) {
                fin.add(player);
            }
        }
        
        System.out.println("Players from FIN:");
        fin.sort(Comparator.comparing(Player::getPoints).reversed());
        for (Player player : fin) {
            System.out.println(player.getName() + "     " + player.getGoals() +" + "  + player.getAssists() + " = " +  player.getPoints() );
        }   
    }
  
}