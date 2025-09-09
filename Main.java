// Demo
public class Main {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);

        System.out.println("Front : " + q.peek()); // 5
        System.out.println("Dequeued: " + q.dequeue());  // 5
        System.out.println("Front : " + q.peek()); // 15
    }
}
