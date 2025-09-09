
class QueueLL {
    private Node front, rear;
    private int size;

    public QueueLL() {
        front = rear = null;
        size = 0;
    }

    // Enqueue
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

      public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
        public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared!");
    }

}

