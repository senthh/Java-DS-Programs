package HeapOrPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    Queue<Integer> smallHeap;
    Queue<Integer> largeHeap;

    MedianFinder() {
        //smallHeap = new PriorityQueue<>((a - b) --> (b - a));
        //largeHeap = new PriorityQueue<>((a - b) --> (a - b));
        smallHeap = new PriorityQueue<>((a, b) -> b - a);
        largeHeap = new PriorityQueue<>((a, b) -> a - b);
    }
    void addNumber(int num) {
        smallHeap.add(num);

        if ( ((smallHeap.size() - largeHeap.size()) > 1) || (!largeHeap.isEmpty() && smallHeap.peek() > largeHeap.peek())) {
            largeHeap.add(smallHeap.poll());
        }
        if ((largeHeap.size() - smallHeap.size()) > 1) {
            smallHeap.add(largeHeap.poll());
        }
    }
    double findMedian() {
        if (smallHeap.size() == largeHeap.size()) {
            return (double)((smallHeap.peek()+largeHeap.peek())/2);
        }
        else if (smallHeap.size() > largeHeap.size()) {
            return (double)(smallHeap.peek());
        }
        else {
            return (double)(largeHeap.peek());
        }
    }
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNumber(4);
        medianFinder.addNumber(6);
        medianFinder.addNumber(10);
        medianFinder.addNumber(2);
        System.out.println(medianFinder.findMedian());

    }
}
