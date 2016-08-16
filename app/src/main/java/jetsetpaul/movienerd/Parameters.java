package jetsetpaul.movienerd;

import java.io.Serializable;

/**
 * Created by pauljoiner on 8/9/16.
 */
public class Parameters implements Serializable {
    public String genre;
    public String decade;
    public String popularity;
    public String score;

    public Parameters(String genre, String decade, String popularity, String score){
        this.genre = genre;
        this.decade = decade;
        this.popularity = popularity;
        this.score = score;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDecade(String decade) {
        this.decade = decade;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getGenre() {
        return genre;
    }

    public String getDecade() {
        return decade;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getScore() {
        return score;
    }
}
