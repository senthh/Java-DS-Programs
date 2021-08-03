public class Stack {
    int maxSize;
    int arr[];
    int currentSize;
    int top;
    public Stack(int size) {
        this.maxSize = size;
        this.arr = new int[maxSize];
        this.currentSize = 0;
        this.top = -1;
    }

    void push(int element) {
        arr[++top] = element;
        currentSize++;
    }
    int pop() {
        currentSize--;
        return arr[top--];
    }
    int peek() {
        return arr[top];
    }
    boolean isEmpty() {
        return (currentSize == 0);
    }
    boolean isFull() {
        return (currentSize == maxSize);
    }

    public static void main(String arg[]) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
