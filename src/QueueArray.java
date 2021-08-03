public class QueueArray {
    int arr[];
    int front;
    int rear;
    int maxSize;
    int currentSize;

    public QueueArray(int size) {
        this.maxSize = size;
        this.arr = new int[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    void enQueue(int element) {
        arr[++rear] = element;
        currentSize++;
    }
    int deQueue() {
        currentSize--;
        return arr[front++];
    }
    boolean isEmpty() {
        return (currentSize == 0);
    }
    boolean isFull() {
        return (currentSize == maxSize);
    }
    public static void main(String arg[]) {
        QueueArray queueArray = new QueueArray(5);
        queueArray.enQueue(10);
        queueArray.enQueue(20);
        queueArray.enQueue(30);
        queueArray.enQueue(40);
        queueArray.enQueue(50);
        while(!queueArray.isEmpty()) {
            System.out.println(queueArray.deQueue());
        }
    }
}
