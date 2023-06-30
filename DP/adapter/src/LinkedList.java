import java.util.ArrayList;

class LinkedList {
    private ArrayList<Object> list;

    public LinkedList() {
        list = new ArrayList<>();
    }

    public void insertHead(Object o) throws MemoryOverflowException {
        if (list.size() < Integer.MAX_VALUE) {
            list.add(0, o);
        } else {
            throw new MemoryOverflowException("Memory Overflow");
        }
    }

    public void removeHead() {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }

    public Object getHead() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
}