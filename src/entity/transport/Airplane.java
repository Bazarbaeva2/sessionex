package entity.transport;

import java.time.LocalDate;

public  class Airplane {
    private String colour;
    private LocalDate yearOfIssue;

    public Airplane(String colour, LocalDate yearOfIssue) {
        this.colour = colour;
        this.yearOfIssue = yearOfIssue;
    }

    public Airplane() {
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "colour='" + colour + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
