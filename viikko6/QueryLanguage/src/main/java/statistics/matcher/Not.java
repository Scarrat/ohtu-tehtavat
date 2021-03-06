package statistics.matcher;

import statistics.Player;

public class Not implements Matcher {
    private Matcher matcher;

    public Not(Matcher m) {
        matcher = m;
    }

    public boolean matches(Player p) {
        if (matcher.matches(p) == true) {
            return false;
        }
        return true;
    }
}
