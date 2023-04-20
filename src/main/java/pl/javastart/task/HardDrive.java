package pl.javastart.task;

public class HardDrive extends Component {
    double capacity;

    public HardDrive(String name, String producent, String serialNumber, double capacity) {
        super(name, producent, serialNumber);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
