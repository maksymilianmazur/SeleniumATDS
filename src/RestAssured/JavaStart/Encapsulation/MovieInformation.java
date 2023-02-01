package JavaStart.Encapsulation;

public class MovieInformation {
    private String movieTitle;
    private String movieType;
    private int movieTime;
    private int ageRequired;


    public String getMovieTitle() {
        return movieTitle;
    }


    public int getAgeRequired() {
        return ageRequired;
    }

    public MovieInformation(String movieTitle, String movieType, int movieTime, int ageRequired) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
    }
}
