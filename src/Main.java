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
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.contains(1231));
        System.out.println(linkedList.contains(1218));

        linkedList.set(1314, 1);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}
