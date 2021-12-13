package statistics.matcher;

import statistics.Player;

public class HasFewerThan implements Matcher {

    private Matcher not;

    public HasFewerThan(int value, String category) {
        this.not = new Not(new HasAtLeast(value, category));
    }

    public boolean matches(Player p) {
        if (this.not.matches(p) == true) {
            return true;
        }
        return false;
    }
}