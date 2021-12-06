package ohtu;

public class TennisGame {
    
    private int player1score = 0;
    private int player2score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            player1score += 1;
        else
            player2score += 1;
    }

    public String getScore() {
        String score = "";
        if (player1score==player2score)
        {
            if(playerScore(player2Name).equals("Deuce")) {
                return "Deuce";
            }
            else{
                score+=playerScore(player1Name);
                score+="-All";
                return score;
            }
        }
        if (player1score>=4 || player2score>=4)
        {   int diff = player1score - player2score;
            if (diff==1) score ="Advantage player1";
            else if (diff ==-1) score ="Advantage player2";
            else if (diff>=2) score = "Win for player1";
            else score ="Win for player2";
            return score;
        }
        score+=playerScore(player1Name) + "-" + playerScore(player2Name);
        
        return score;
    }
    public String playerScore(String name) {
        int score;
        if(name.equals(player1Name)) {
            score = player1score;
        }
        else {
            score = player2score;
        }
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "Deuce";
        }
    }
    public static void main(String[] args) {
        TennisGame game = new TennisGame("player1", "player2");
    
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    
        game.wonPoint("player2");
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    }
}
