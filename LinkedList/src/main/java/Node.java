public class Node<T> {

    private T data;

    private Node next;

    public T getData() {
        return data;
    }

    public Node setData(T data) {
        this.data = data;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        if (this == null) {
            return "EOL";
        } else if ( this.next == null ) {
            return "'" + data + "' --> EOL";
        }
        return "'" + data + "' --> ";
    }
}
