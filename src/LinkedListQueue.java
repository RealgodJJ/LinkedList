public class LinkedListQueue<T> implements Queue<T> {
    private class Node {
        T e;
        Node next;

        public Node(T e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(T e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(T e) {
        //队列为空时，tail == null, head == null
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException("Dequeue failed.");

        Node deleteNode = head;
        head = head.next;
        deleteNode.next = null;

        //删除元素之后，队列为空，head == null, tail也应该更新为null
        if (head == null)
            tail = null;
        size--;

        return deleteNode.e;
    }

    @Override
    public T getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("The queue is null.");

        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue(front): ");

        Node current = head;
        while (current != null) {
            stringBuilder.append(current + "->");
            if (current.next == null)
                stringBuilder.append("NULL");
            current = current.next;
        }

        stringBuilder.append(" Queue (tail)");
        return stringBuilder.toString();
    }
}
