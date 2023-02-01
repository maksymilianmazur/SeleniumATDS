package JavaStart.Encapsulation;


public class TicketBuyService {
    CinemaClient cinemaClient;
    CinemaCapacity cinemaCapacity;
    MovieInformation movieInformation;
    //private int ticketID = 0;

    public TicketBuyService(CinemaClient cinemaClient, CinemaCapacity cinemaCapacity, MovieInformation movieInformation) {
        this.cinemaClient = cinemaClient;
        this.cinemaCapacity = cinemaCapacity;
        this.movieInformation = movieInformation;
    }


    void purchaseInformation() {
        if (cinemaCapacity.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
        } else if (cinemaClient.getAge() < movieInformation.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieInformation.getAgeRequired() + " lat");
        } else {
            String ticketPersonData = cinemaClient.getFirstName() + " " + cinemaClient.getLastName();
            String ticketMovieTitle = movieInformation.getMovieTitle();
            int afterDecrementation = cinemaCapacity.decrementationFreeSeats();
            int ticketID = cinemaCapacity.maxSeats - afterDecrementation;
            System.out.println("Kupujący: " + ticketPersonData);
            System.out.println("Film: " + ticketMovieTitle);
            System.out.println("Pozostałe miejsca: " + afterDecrementation);
            System.out.println("Liczba sprzedanych biletów: "+ ticketID);
        }
        //return cinemaCapacity.freeSeats;
    }


}
