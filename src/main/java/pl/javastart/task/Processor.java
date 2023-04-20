package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    private double gpuClock;
    private double gpuClockTemperature;
    private double gpuSafeTemperature;

    public Processor(String name, String producent, String serialNumber, double gpuClock, double gpuClockTemperature, double gpuSafeTemperature) {
        super(name, producent, serialNumber);
        this.gpuClock = gpuClock;
        this.gpuClockTemperature = gpuClockTemperature;
        this.gpuSafeTemperature = gpuSafeTemperature;
    }

    @Override
    public void overclock() {
        if (gpuClockTemperature + 10 > gpuSafeTemperature) {
            throw new IllegalStateException("Overclocking failed. Maximum safe processor temperature would be excedeed");
        }
        gpuClockTemperature += 10;
        gpuClock += 100;
    }

    public double getGpuClock() {
        return gpuClock;
    }

    public void setGpuClock(double gpuClock) {
        this.gpuClock = gpuClock;
    }

    public double getGpuClockTemperature() {
        return gpuClockTemperature;
    }

    public void setGpuClockTemperature(double gpuClockTemperature) {
        this.gpuClockTemperature = gpuClockTemperature;
    }

    public double getGpuSafeTemperature() {
        return gpuSafeTemperature;
    }

    public void setGpuSafeTemperature(double gpuSafeTemperature) {
        this.gpuSafeTemperature = gpuSafeTemperature;
    }
}
