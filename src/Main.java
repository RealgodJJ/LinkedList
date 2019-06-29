import java.util.Random;

public class Main {
    // 测试使用stack运行opCount个push和pop操作所需要的时间，单位：秒
    private static double testStack(Stack<Integer> stack, int opCount){

        long startTime = System.nanoTime();

        Random random = new Random();
        for(int i = 0 ; i < opCount ; i ++)
            stack.push(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0 ; i < opCount ; i ++)
            stack.pop();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

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

        System.out.println("===== LinkedListStack =====");
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }

        System.out.println(linkedListStack.peek());
        linkedListStack.pop();
        System.out.println(linkedListStack);

        System.out.println("===== 性能测试 =====");
        int opCount = 100000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");

        LinkedListStack<Integer> linkedListStack_1 = new LinkedListStack<>();
        double time2 = testStack(linkedListStack_1, opCount);
        System.out.println("LinkedListStack, time: " + time2 + " s");

    }
}
