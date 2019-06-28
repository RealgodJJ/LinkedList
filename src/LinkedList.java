public class LinkedList<T> {
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

    private Node dummyHead;
    private int size;

    //构造初始化一个链表
    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addMiddle(int index, T e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("The index is illegal.");

        Node prev = dummyHead;
        for (int i = 0; i < index; i++)
            prev = prev.next;

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
        prev.next = new Node(e, prev.next);
        size++;
    }

    public void addFirst(T e) {
        addMiddle(0, e);
    }

    public void addLast(T e) {
        addMiddle(size, e);
    }
}
