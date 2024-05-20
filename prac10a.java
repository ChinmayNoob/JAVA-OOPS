import java.util.PriorityQueue;

class MyPriorityQueue<T> extends PriorityQueue<T> implements Cloneable {
    @Override
    public MyPriorityQueue<T> clone() {
        MyPriorityQueue<T> clonedQueue = new MyPriorityQueue<>();
        clonedQueue.addAll(this);
        return clonedQueue;
    }
}

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue<Integer> originalQueue = new MyPriorityQueue<>();
        originalQueue.add(3);
        originalQueue.add(1);
        originalQueue.add(2);

        MyPriorityQueue<Integer> clonedQueue = originalQueue.clone();

        System.out.println("Original Queue: " + originalQueue);
        System.out.println("Cloned Queue: " + clonedQueue);
    }
}