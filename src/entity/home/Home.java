package entity.home;

import entity.Announcement.Announcement;

public class Home extends Announcement {
    private String homeType;
    private int maxGuest;

    public Home(String name, String image, double price, String description) {
        super(name, image, price, description);
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeType='" + homeType + '\'' +
                ", maxGuest=" + maxGuest +
                '}';
    }
}
