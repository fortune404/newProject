package tutoring_jdbc;

public class MovieList
{
    private int id;
    private String title;
    private int releaseYear;
    private String genre;
    private String mpaaRatings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMpaaRatings() {
        return mpaaRatings;
    }

    public void setMpaaRatings(String mpaaRatings) {
        this.mpaaRatings = mpaaRatings;
    }

    public MovieList(int id, String title, int releaseYear, String genre, String mpaaRatings) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.mpaaRatings = mpaaRatings;



    }
}
