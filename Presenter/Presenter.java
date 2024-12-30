package Presenter;

import Model.DirectoryFunctional;
import Model.Record;

import java.text.ParseException;

public class Presenter {
    DirectoryFunctional functional;
    Record record;

    public Presenter() {
        this.functional = new DirectoryFunctional();
    }

    public void addRecord(String name, String surname, String localDate,
                          String phone, String sex) {
        try {
            record = new Record(name, surname, localDate, phone, sex);
        } catch (ParseException e) {
            throw new RuntimeException("Ввод некорректного формата даты");
        }
        functional.addRecords(record);
        functional.recordingInFile(record);
        System.out.println("Запись добавлена!");
    }

    public void showDiretory() {
        if (functional.sizeOfDirecory() == 0) System.out.println("Список чист, добавьте запись");
        System.out.println(functional.showRecords());
    }

    public void deleteRecord() {
        functional.deleteRecord();
        showDiretory();
    }

    public void clearDirectory() {
        functional.clearDirectory();
        System.out.println("Справичник чист!");
        showDiretory();
    }
}
