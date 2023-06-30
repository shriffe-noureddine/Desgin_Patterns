class LinkedListAdapter implements Stack {
    private LinkedList list;

    public LinkedListAdapter(LinkedList list) {
        this.list = list;
    }

    public boolean push(Object o) {
        try {
            list.insertHead(o);
            return true;
        } catch (MemoryOverflowException e) {
            return false;
        }
    }

    public Object pop() {
        Object obj = list.getHead();
        if (obj != null) {
            list.removeHead();
        }
        return obj;
    }

    public Object top() {
        return list.getHead();
    }
}
