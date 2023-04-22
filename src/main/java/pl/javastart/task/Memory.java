package pl.javastart.task;

public class Memory extends OverclockableComponent {
    private double ram;

    public Memory(String name, String producent, String serialNumber, double clock, double clockTemperature, double safeTemperature, double ram) {
        super(name, producent, serialNumber, clock, clockTemperature, safeTemperature);
        this.ram = ram;
    }

    @Override
    public double getTemperatureStep() {
        return 15;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }
}

