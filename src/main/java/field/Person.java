package field;

import java.util.Date;

public class Person {
    private Long id;
    private String fullName;
    private Date birthday;
    private String sex;
    private String dataPassport;
    private int year;

    public Person() {
    }

    public Person(Long id, String fullName, Date birthday, String sex, String dataPassport) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.dataPassport = dataPassport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDataPassport() {
        return dataPassport;
    }

    public void setDataPassport(String dataPassport) {
        this.dataPassport = dataPassport;
    }

    @Override
    public String toString() {
        return "field.Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", dataPassport='" + dataPassport + '\'' +
                ", year=" + year +
                '}';
    }
}
