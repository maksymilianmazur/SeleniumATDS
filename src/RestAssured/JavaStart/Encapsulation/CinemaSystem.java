package JavaStart.Encapsulation;

class CinemaSystem {
    public static void main(String[] args) {
        MovieInformation movieInformation = new MovieInformation("Omen","horror",128,16);
        CinemaCapacity cinemaCapacity = new CinemaCapacity(72,72);
        CinemaClient cinemaClient = new CinemaClient("Jan","Kowalski",17);
        CinemaClient cinemaClient2 = new CinemaClient("Anna","Zalewska",19);
        TicketBuyService purchase = new TicketBuyService(cinemaClient,cinemaCapacity,movieInformation);
        purchase.purchaseInformation();
        TicketBuyService purchase2 = new TicketBuyService(cinemaClient2,cinemaCapacity,movieInformation);
        purchase2.purchaseInformation();
}
}