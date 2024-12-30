package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneDirectory implements Iterable<Record> {

    private List<Record> phoneDirectory;

    public PhoneDirectory() {
        phoneDirectory = new ArrayList<>();
    }

    public void add(Record record) {
        phoneDirectory.add(record);
    }

    @Override
    public Iterator<Record> iterator() {
        return new IteratorRecords(phoneDirectory);
    }

    public int sizeOfList() {
        return phoneDirectory.size();
    }

    public void deleteRecord(Record record) {
        phoneDirectory.remove(record);
    }

    public void clearDirectory() {
        phoneDirectory.removeAll(phoneDirectory);
    }
}
