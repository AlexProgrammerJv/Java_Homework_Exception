package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {

    private String name;
    private String surname;
    private String phone;
    private String sex;
//    private String localDate;
    private Date date;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public Record(String name,String surname, String localDate, String phone, String sex) throws ParseException {
        this.name = name;
        this.date = this.dateFormat.parse(localDate);
        this.sex = sex;
        this.phone = phone;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public Date getDate() {
        return date;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "<" + name + ">" +
                "<" + surname + ">" +
                "<" + phone + ">" +
                "<" + sex + ">" +
                "<" + dateFormat.format(date) + ">";
    }
}