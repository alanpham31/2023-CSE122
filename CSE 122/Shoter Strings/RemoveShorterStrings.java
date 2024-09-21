import java.util.*;

public class RemoveShorterStrings {
    public static void main(String[] args) {
        String[] even = {"four", "score", "and", "seven", "years", "ago"};
        String[] odd = {"hello", "good", "morning"};
        String[] exception = {"Empty string should fail", ""};

        // Create Data Structures
        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // Even test case
        addValues(even, list, stack, queue);
        removeShorterStringsList(list);
        removeShorterStringsStack(stack);
        removeShorterStringsQueue(queue);
        print(list, stack, queue);

        // Odd test case
        addValues(odd, list, stack, queue);
        removeShorterStringsList(list);
        removeShorterStringsStack(stack);
        removeShorterStringsQueue(queue);
        print(list, stack, queue);

        // Exception test case
        addValues(exception, list, stack, queue);
        System.out.println(testForExceptions(list, stack, queue));
    }

    /* TODO */
    // implement each of the following methods according to their specifications

    public static void removeShorterStringsList(List<String> array) {
        /* YOUR CODE HERE */
        // throw exception if string has length < 1
        if (array.size() < 1) {
            // throw new 
        }
        
        // iterate over list
        for (int i = 0; i < (array.size()-1); i++) {
            String word1 = array.get(i);
            String word2 = array.get(i++);
            // check if 
            if (word1.length() < word2.length()) {
                array.remove(i);
            } else if (word1.length() > word2.length()) {
                array.remove(i++);
            } else if (word1.length() == word2.length()) {
                array.remove(i++);
            }
        }
    }

    public static void removeShorterStringsQueue(Queue<String> q) {
        /* YOUR CODE HERE */
    }

    public static void removeShorterStringsStack(Stack<String> s) {
        /* YOUR CODE HERE */
    }
    



    // Move all elements of the given Queue into the given Stack.
    private static void qToS(Queue<String> q, Stack<String> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

    // Move all elements of the given Stack into the given Queue.
    private static void sToQ(Stack<String> s, Queue<String> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    //       PRIVATE HELPERS TO PRINT AND TEST EXCEPTIONS
    ////////////////////////////////////////////////////////////////////////////////////////
    
    // [IGNORE] private helper method for program setup
    private static void addValues(String[] values, List<String> l, Stack<String> s, Queue<String> q) {
        l.clear();
        s.clear();
        q.clear();

        for (int i = 0; i < values.length; i++) {
            String curr = values[i];
            l.add(curr);
            s.push(curr);
            q.add(curr);
        }
    }

    // [IGNORE] private helper method to print contents of each adt
    private static void print(List<String> l, Stack<String> s, Queue<String> q) {
        System.out.println(l);
        System.out.println(s);
        System.out.println(q);
        System.out.println();
    }

    // [IGNORE] private helper method to check methods properly throw IllegalArgumentExceptions
    private static boolean testForExceptions(List<String> l, Stack<String> s, Queue<String> q) {
        boolean listException = false;
        boolean queueException = false;
        boolean stackException = false;

        try {
            removeShorterStringsList(l);
        } catch (IllegalArgumentException e) {
            listException = true;
        } 

        try {
            removeShorterStringsQueue(q);
        } catch (IllegalArgumentException e) {
            queueException = true;
        }

        try {
            removeShorterStringsStack(s);
        } catch (IllegalArgumentException e) {
            stackException = true;
        }

        return listException && queueException && stackException;
    }
}