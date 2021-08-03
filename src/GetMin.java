public class GetMin {
    int maxSize;
    int arr[];
    int currentSize;
    int top;
    int min_arr[];
    public GetMin(int size) {
        this.maxSize = size;
        this.arr = new int[maxSize];
        this.min_arr = new int[maxSize];
        this.currentSize = 0;
        this.top = -1;
    }
    void push(int element) {
        if(top != -1) {
            arr[++top] = element;
            min_arr[top] = element;
            currentSize++;
        }
    }
    int pop() {
        currentSize--;
        return arr[top--];
    }
}
