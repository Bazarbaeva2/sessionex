package entity.devices;

import entity.Announcement.Announcement;

public class Laptop extends Announcement {
    private String  operatingSystem;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Laptop(String name, String image, double price, String description, String operatingSystem) {
        super(name, image, price, description);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}

