public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.addMiddle(4, 1231);
        System.out.println(linkedList);

        linkedList.addLast(313);
        System.out.println(linkedList);
    }
}
