package statistics.matcher;

public class QueryBuilder {
    private Matcher matcher;

    public QueryBuilder() {
        this.matcher = new All();
    }

    public QueryBuilder(Matcher m) {
        this.matcher = m;
    }

    public QueryBuilder playsIn(String team) {
        return new QueryBuilder(new And(this.matcher, new PlaysIn(team)));
    }

    public QueryBuilder hasAtLeast(int value, String category) {
        return new QueryBuilder(new And(this.matcher, new HasAtLeast(value, category)));
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        return new QueryBuilder(new And(this.matcher, new HasFewerThan(value, category)));
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        this.matcher = new Or(matchers);
        return this;
    }

    public Matcher build() {
        return this.matcher;
    }
}
