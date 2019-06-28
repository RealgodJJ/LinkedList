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

    private Node head;
    private int size;

    //构造初始化一个链表
    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        head = new Node(e, head);

        size++;
    }

    public void addMiddle(int index, T e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("The index is illegal.");

        //链表在头部添加元素和中间添加元素的步骤是不同的，所以需要分情况考虑
        if (index == 0)
            addFirst(e);
        else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++)
                prev = prev.next;

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
            prev.next = new Node(e, prev.next);

            size++;
        }
    }

    public void addLast(T e) {
        addMiddle(size, e);
    }
}
