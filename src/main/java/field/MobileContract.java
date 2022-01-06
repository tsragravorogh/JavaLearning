package field;

import java.util.Date;

public class MobileContract extends Contract {
    private int min;
    private int sms;
    private int gb;

    public MobileContract() {
    }

    public MobileContract(int min, int sms, int gb) {
        this.min = min;
        this.sms = sms;
        this.gb = gb;
    }

    public MobileContract(Long id, Date start, Date finish, Long number, Person owner, int min, int sms, int gb) {
        super(id, start, finish, number, owner);
        this.min = min;
        this.sms = sms;
        this.gb = gb;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    @Override
    public String toString() {
        return "field.MobileContract{" +
                "min=" + min +
                ", sms=" + sms +
                ", gb=" + gb +
                '}' + super.toString();
    }
}
