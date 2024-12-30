package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryFunctional {

    PhoneDirectory phoneDirectory;

    public DirectoryFunctional() {
        this.phoneDirectory = new PhoneDirectory();
    }

    public void addRecords(Record record) {
        phoneDirectory.add(record);
    }

    public String showRecords() {
        StringBuilder records = new StringBuilder();
        for (Record record : phoneDirectory) {
            records.append(record);
        }
        return records.toString();
    }

    public void recordingInFile(Record record) {
        File file = new File(record.getSurname());
        try (FileWriter writer = new FileWriter(file, true)) {
            if (file.length() != 0) writer.append("\n");
            writer.write(record.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public PhoneDirectory getDirectory() {
        return this.phoneDirectory;
    }

    public int sizeOfDirecory() {
        return phoneDirectory.sizeOfList();
    }

    public void deleteRecord() {
        StringBuilder records = new StringBuilder();
        int count = 1;
        for (Record record : phoneDirectory) {
            records.append(Integer.toString(count) + ". " + record);
            if (phoneDirectory.sizeOfList() != count) records.append("\n");
            count++;
        }
        System.out.println(records.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер удаляемой записи");
        int i = scanner.nextInt();
        if (i < 0 && i > sizeOfDirecory()) System.out.println(" Запись под таким номером не существует!");
        else {
            int cnt = 0;
            i = i - 1;
            for (Record record : phoneDirectory) {
                if (cnt == i) phoneDirectory.deleteRecord(record);
                cnt++;
            }
            System.out.println("Запись удалена");
        }
    }

    public void clearDirectory() {
        phoneDirectory.clearDirectory();
    }


}
