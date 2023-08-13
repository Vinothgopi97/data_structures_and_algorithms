public class ListImpl<T> implements List<T> {

    Node<T> head;
    Integer size;

    public ListImpl() {
        head = null;
        size = 0;
    }

    @Override
    public void add(T element) {
        Node<T> node = new Node<>(element);

        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        size++;

    }

    @Override
    public void remove(T element) {
        if (head != null) {
            if (head.getData() == element) {
                head = head.getNext();
                size--;
                return;
            } else {
                Node<T> temp = head;
                while (temp.getNext() != null) {
                    if (temp.getNext().getData() == element) {
                        temp.setNext(temp.getNext().getNext());
                        size--;
                        break;
                    }
                    temp = temp.getNext();
                }
            }
        }
        return;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "List is empty";
        } else {
            Node<T> temp = head;
            StringBuilder stringBuilder = new StringBuilder();
            while (temp != null) {
                stringBuilder.append(temp);
                temp = temp.getNext();
            }
            return stringBuilder.toString();
        }
    }
}
