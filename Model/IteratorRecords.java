package Model;

import java.util.List;

public class IteratorRecords implements java.util.Iterator<Record> {

    List<Record> phoneDirectory;
    int count;

    public IteratorRecords(List<Record> phoneDirectory) {
        this.phoneDirectory = phoneDirectory;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < phoneDirectory.size();
    }

    @Override
    public Record next() {
        return phoneDirectory.get(count++);
    }
}
