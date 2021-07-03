public class HashList<T> {
    private final HashListNode<T> head;
    private HashListNode<T> tail;
    private int size;

    HashList() {
        this.head = new HashListNode<>();
        this.tail = head;
        this.size = 0;
    }

    public void pushBack(T elem) {
        tail.setData(elem);
        tail.setNext(new HashListNode<T>());
        tail = tail.getNext();
        size++;
    }

    public int count(T value) {
        HashListNode<T> temp = head;
        int count = 0;

        while (temp.getNext() != null) {
            if (temp.getData().toString().equals(value.toString())) {
                count++;
            }
            temp = temp.getNext();
        }

        return count;
    }

    public HashListNode<T> get(int index) {
        HashListNode<T> temp = head;

        for (int i = 0; i < index && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
