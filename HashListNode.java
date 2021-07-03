public class HashListNode<T> {
    private HashListNode<T> next;
    private T data;

    HashListNode() {
        this.data = null;
    }

    public HashListNode<T> getNext() {
        return next;
    }

    public void setNext(HashListNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
