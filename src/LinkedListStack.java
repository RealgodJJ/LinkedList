public class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> linkedList;

    public LinkedListStack() {
        linkedList = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(T e) {
        linkedList.addFirst(e);
    }

    @Override
    public T peek() {
        return linkedList.getFirst();
    }

    @Override
    public T pop() {
        return linkedList.removeFirst();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack(Top): ");
        stringBuilder.append(linkedList);
        return stringBuilder.toString();
    }
}
