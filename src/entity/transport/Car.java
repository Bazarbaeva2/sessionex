package entity.transport;

import java.time.LocalDate;

public class Car extends Airplane{
    public Car(String colour, LocalDate yearOfIssue) {
        super(colour, yearOfIssue);
    }

    public Car() {
    }

}
