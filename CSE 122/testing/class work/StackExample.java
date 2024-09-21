import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        // System.out.println("S before = " + s);
        System.out.println("Sum of s = " + sum(s));
        // System.out.println("S after = " + s);
    }

    public static int sum(Stack<Integer> numbers) {
        
        Queue<Integer> q = new LinkedList<Integer>();

        int total = 0;
        // int size = numbers.size();
        //while (!numbers.isEmpty()) {
        for (int j = 0; j < 2; j++) {
            for(int i = numbers.size(); i > 0; i--) {
                int number = numbers.pop();
                if (i == 0) {
                    total += number;
                }
                q.add(number);

            }
            
            while(!q.isEmpty()) {
                int numToAdd = q.remove();
                numbers.push(numToAdd);
            }
        }

        

        System.out.println("Queue: " + q);
        System.out.println("Stack: " + numbers);
        return total;
    } 

}