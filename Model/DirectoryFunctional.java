package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        try (FileWriter writer = new FileWriter(file,true)) {
            if (file.length() != 0) writer.append("\n");
            writer.write(record.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
