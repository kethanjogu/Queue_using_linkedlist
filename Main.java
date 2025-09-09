// Demo
public class Main {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);

    
        q.display(); 

        System.out.println("Dequeued: " + q.dequeue()); // 10
        q.display(); 
    }
}
