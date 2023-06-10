package Static.ThirdExecise;

public class Car {
    private int fuelLevel;
    private boolean isEngineEfficient;
    private boolean isFuelFillerClosed;
    private boolean isDoorsClosed;
    private boolean isEngineStarted;

    public static final int OK = 100;
    public static final int ERROR_CHECK_ENGINE = 200;
    public static final int ERROR_NO_FUEL = 300;
    public static final int WARNING_FUEL_FLAP_OPEN = 400;
    public static final int WARNING_DOORS_OPEN = 500;

    public Car(int fuelLevel, boolean isEngineEfficient, boolean isFuelFillerClosed, boolean isDoorsClosed, boolean isEngineStarted) {
        this.fuelLevel = fuelLevel;
        this.isEngineEfficient = isEngineEfficient;
        this.isFuelFillerClosed = isFuelFillerClosed;
        this.isDoorsClosed = isDoorsClosed;
        this.isEngineStarted = isEngineStarted;
    }



}
