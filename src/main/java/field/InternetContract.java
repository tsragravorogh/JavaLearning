package field;

import java.util.Date;

public class InternetContract extends Contract {
    private double speed;

    public InternetContract(double speed) {
        this.speed = speed;
    }

    public InternetContract(Long id, Date start, Date finish, Long number, Person owner, double speed) {
        super(id, start, finish, number, owner);
        this.speed = speed;
    }

    public InternetContract() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "field.InternetContract{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
