import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = buildQueue(5);
        
        System.out.println("Queue: " + q);
        System.out.println("Sum of q = " + sum(q));
        System.out.println("Queue after: " + q);
    }

    public static Queue<Integer> buildQueue(int n) {
        Queue<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static int sum(Queue<Integer> numbers) {
        int total = 0;
        int size = numbers.size();
        //while (!numbers.isEmpty()) {
        for(int i = 0; i < size; i++) {
            int number = numbers.remove();
            total += number;
            numbers.add(number);
        }
        return total;
    }   
}