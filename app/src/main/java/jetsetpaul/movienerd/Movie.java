package jetsetpaul.movienerd;

/**
 * Created by pauljoiner on 8/10/16.
 */
public class Movie {
    private String mTitle;
    private String mReleaseYear;
    private String mScore;
    private String mPopularity;
    private String mImage;

    public Movie(String mTitle, String mReleaseYear, String mScore, String mPopularity, String mImage){
        this.mTitle = mTitle;
        this.mReleaseYear = mReleaseYear;
        this.mScore = mScore;
        this.mPopularity = mPopularity;
        this.mImage = mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmReleaseYear() {
        return mReleaseYear;
    }

    public String getmScore() {
        return mScore;
    }

    public String getmPopularity() {
        return mPopularity;
    }

    public String getmImage() {
        return mImage;
    }

}
