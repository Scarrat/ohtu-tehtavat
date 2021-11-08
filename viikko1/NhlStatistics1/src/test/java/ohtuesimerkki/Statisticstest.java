/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kostajoo
 */
public class Statisticstest {
    
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;
    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
        
    }  
    @Test
    public void searchworks() {
      Player x = stats.search("Gabbo");
      assertEquals(x, null);
    }
    @Test
    public void searchworks2() {
      Player x = stats.search("Lemieux");
      assertEquals(x.getName(),"Brendan Lemieux");
    }
    @Test
    public void teamSearchworks() {
      List x = stats.team("PIT");
      
      assertEquals("Lemieux",readerStub.getPlayers().get(1).getName());
    }
    @Test
    public void teamSearchworks2() {
      List x = stats.team("BOB");
      
      assertEquals(x.size(),0);
    }
    @Test
    public void topScorersworks() {
      List x = stats.topScorers(0);
      
      assertEquals(x.size(),1);
    }
}
