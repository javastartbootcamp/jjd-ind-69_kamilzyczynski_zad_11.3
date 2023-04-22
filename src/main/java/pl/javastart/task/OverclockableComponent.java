package pl.javastart.task;

public abstract class OverclockableComponent extends Component implements Overclockable {
    public static final double clockStep = 100;
    private double clock;
    private double safeTemperature;
    private double clockTemperature;

    public OverclockableComponent(String name, String producent, String serialNumber, double clock, double clockTemperature, double safeTemperature) {
        super(name, producent, serialNumber);
        this.clock = clock;
        this.clockTemperature = clockTemperature;
        this.safeTemperature = safeTemperature;
    }

    public double getClock() {
        return clock;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public double getSafeTemperature() {
        return safeTemperature;
    }

    public void setSafeTemperature(double safeTemperature) {
        this.safeTemperature = safeTemperature;
    }

    public double getClockTemperature() {
        return clockTemperature;
    }

    public void setClockTemperature(double clockTemperature) {
        this.clockTemperature = clockTemperature;
    }

    @Override
    public void overclock() {
        if (clockTemperature + getTemperatureStep() > safeTemperature) {
            throw new IllegalStateException("Overclocking failed. Maximum safe processor temperature would be excedeed");
        }
        clockTemperature += getTemperatureStep();
        clock += clockStep;
    }

    public abstract double getTemperatureStep();
}
