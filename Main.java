import Model.DirectoryFunctional;
import Model.Record;

import java.io.File;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        DirectoryFunctional func = new DirectoryFunctional();
        Record record1 = new Record(
                "Aleksey",
                "Solodovnik",
                "19.04.1998",
                "8929401",
                "m");
        Record record2 = new Record(
                "Sergey",
                "Solodovnik",
                "19.04.1998",
                "8929401",
                "m");
        Record record3 = new Record(
                "Aleksey",
                "Solod",
                "19.04.1998",
                "8929401",
                "m");

        func.recordingInFile(record1);
        func.recordingInFile(record2);
        func.recordingInFile(record3);
    }
}
