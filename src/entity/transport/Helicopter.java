package entity.transport;

import java.time.LocalDate;

public class Helicopter extends Airplane{
    public Helicopter(String colour, LocalDate yearOfIssue) {
        super(colour, yearOfIssue);
    }

    public Helicopter() {
    }
}
