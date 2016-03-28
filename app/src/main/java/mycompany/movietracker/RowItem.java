package mycompany.movietracker;

public class RowItem {
    private int imageId;
    private String movieName;
    private String movieWhen;
    private String movieWhere;

    public RowItem(int imageId, String movieName, String movieWhen, String movieWhere) {
        this.imageId = imageId;
        this.movieName = movieName;
        this.movieWhen = movieWhen;
        this.movieWhere = movieWhere;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieWhen() {
        return movieWhen;
    }

    public void setMovieWhen(String movieWhen) {
        this.movieWhen = movieWhen;
    }


    public String getMovieWhere() {
        return movieWhere;
    }

    public void setMovieWhere(String movieWhere) {
        this.movieWhere = movieWhere;
    }

    @Override
    public String toString() {
        return movieName + "\n" + movieWhen + "\n" + movieWhere;
    }
}
