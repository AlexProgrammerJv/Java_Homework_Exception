package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneDirectory implements Iterable<Record>{

    private List<Record> phoneDirectory;

    public PhoneDirectory() {
        phoneDirectory = new ArrayList<>();
    }

    public void add(Record record){
        phoneDirectory.add(record);
    }

    @Override
    public Iterator<Record> iterator() {
        return new IteratorRecords(phoneDirectory);
    }
}
