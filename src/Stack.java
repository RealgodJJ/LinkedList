public interface Stack<T> {
    public int getSize();

    public boolean isEmpty();

    public void push(T e);

    public T peek();

    public T pop();
}
