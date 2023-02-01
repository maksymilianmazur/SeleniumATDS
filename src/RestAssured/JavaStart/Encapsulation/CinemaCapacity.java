package JavaStart.Encapsulation;

public class CinemaCapacity {
    int maxSeats;
    int freeSeats;

    public CinemaCapacity(int maxSeats, int freeSeats) {
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public int decrementationFreeSeats() {
        freeSeats--;
        return freeSeats;
    }

}
