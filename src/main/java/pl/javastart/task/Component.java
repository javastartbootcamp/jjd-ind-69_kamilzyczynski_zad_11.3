package pl.javastart.task;

public abstract class Component {
    private String name;
    private String producent;
    private String serialNumber;

    public Component(String name, String producent, String serialNumber) {
        this.name = name;
        this.producent = producent;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
