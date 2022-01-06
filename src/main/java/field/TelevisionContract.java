package field;

import java.util.Date;

public class TelevisionContract extends Contract {
    private String pack;

    public TelevisionContract(String pack) {
        this.pack = pack;
    }

    public TelevisionContract(Long id, Date start, Date finish, Long number, Person owner, String pack) {
        super(id, start, finish, number, owner);
        this.pack = pack;
    }

    public TelevisionContract() {
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "field.TelevisionContract{" +
                "pack='" + pack + '\'' +
                "} " + super.toString();
    }
}
