package edu.umkc.ic;

/**
 * Created by Mayanka on 21-Jul-15.
 * Reference : https://github.com/shekhargulati/day20-stanford-sentiment-analysis-demo
 */
public class TweetWithSentiment {

    private String line;
    private String cssClass;
    private double rating;

    public TweetWithSentiment() {
    }

    public TweetWithSentiment(String line, String cssClass, double rating) {
        super();
        this.line = line;
        this.cssClass = cssClass;
        this.rating = rating;
    }

    public String getLine() {
        return line;
    }

    public String getCssClass() {
        return cssClass;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "TweetWithSentiment [line=" + line + ", cssClass=" + cssClass + ", rating=" + rating + "]";
    }

}
