package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    private double ram;
    private double ramClock;
    private double ramClockTemperature;
    private double ramSafeTemperature;

    public Memory(String name, String producent, String serialNumber, double ram, double ramClock, double ramClockTemperature, double ramSafeTemperature) {
        super(name, producent, serialNumber);
        this.ram = ram;
        this.ramClock = ramClock;
        this.ramClockTemperature = ramClockTemperature;
        this.ramSafeTemperature = ramSafeTemperature;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getRamClock() {
        return ramClock;
    }

    public void setRamClock(double ramClock) {
        this.ramClock = ramClock;
    }

    public double getRamClockTemperature() {
        return ramClockTemperature;
    }

    public void setRamClockTemperature(double ramClockTemperature) {
        this.ramClockTemperature = ramClockTemperature;
    }

    public double getRamSafeTemperature() {
        return ramSafeTemperature;
    }

    public void setRamSafeTemperature(double ramSafeTemperature) {
        this.ramSafeTemperature = ramSafeTemperature;
    }

    @Override
    public void overclock() {
        if (ramClockTemperature + 15 > ramSafeTemperature) {
            throw new IllegalStateException("Overclocking failed. Maximum safe ram temperature would be excedeed");
        }
        ramClockTemperature += 15;
        ramClock += 100;
    }
}
