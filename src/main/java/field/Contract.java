package field;

import java.util.Date;

public class Contract {
    private Long id;
    private Date start;
    private Date finish;
    private Long number;
    private Person owner;

    public Contract() {
    }

    public Contract(Long id, Date start, Date finish, Long number, Person owner) {
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.number = number;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "field.Contract{" +
                "id=" + id +
                ", start=" + start +
                ", finish=" + finish +
                ", number=" + number +
                ", owner=" + owner +
                '}';
    }
}
