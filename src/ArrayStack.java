public class ArrayStack<T> implements Stack<T> {
    private Array<T> array;

    public ArrayStack() {
        array = new Array<>();
    }

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(T e) {
        array.addLast(e);
    }

    @Override
    public T peek() {
        return array.getLast();
    }

    @Override
    public T pop() {
        return array.removeLast();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Stack: size: %d, capacity: %d\n", getSize(), getCapacity()));
        result.append("[");
        for (int i = 0; i < getSize(); i++) {
            result.append(array.getElement(i));
            if (i != getSize() - 1)
                result.append(", ");
        }
        result.append("] top");
        return result.toString();
    }
}
