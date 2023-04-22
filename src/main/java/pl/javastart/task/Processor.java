package pl.javastart.task;

public class Processor extends OverclockableComponent {

    public Processor(String name, String producent, String serialNumber, double clock, double clockTemperature, double safeTemperature) {
        super(name, producent, serialNumber, clock, clockTemperature, safeTemperature);
    }

    @Override
    public double getTemperatureStep() {
        return 10;
    }
}
