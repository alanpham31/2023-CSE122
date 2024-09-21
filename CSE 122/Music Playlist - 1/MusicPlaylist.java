// Author: Alan Pham
// TA: Kevin Nguyen
// Date: Oct 19 2023
// This is a program that plays music, adds music to a queue, keeps a history,
// and allows you to modify history of the songs that have been played.
import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        //throws FileNotFoundException
        Stack<String> history = new Stack<>();
        Stack<String> allHistory = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the CSE 122 Music Playlist!");
        String choice = "";

        while (!choice.equalsIgnoreCase("q")) {
            System.out.println("(A) Add song");
            System.out.println("(P) Play song");
            System.out.println("(Pr) Print history");
            System.out.println("(C) Clear history");
            System.out.println("(D) Delete from history");
            System.out.println("(Q) Quit");
            System.out.println("");
            System.out.print("Enter your choice: ");
            choice = console.nextLine();
            if (choice.equalsIgnoreCase("a")) {
                addSong(console, queue);
            } else if (choice.equalsIgnoreCase("p")) {
                playSong(console, queue, history);
            } else if (choice.equalsIgnoreCase("pr")) {
                printHistory(console, queue, history);
            } else if (choice.equalsIgnoreCase("c")) {
                clearHistory(history, allHistory);
            } else if (choice.equalsIgnoreCase("d")) {
                deleteFromHistory(console, history, queue);
            } //else if (choice.equalsIgnoreCase("s")) {
            //     saveAllHistory(console, history, allHistory);
            // }
            System.out.println("");
            System.out.println("");
        }
    }

    // this method adds songs to the queue to be played
    public static void addSong(Scanner console, Queue<String> queue) {
        System.out.print("Enter song name: ");
        String songName = console.nextLine();
        queue.add(songName);
        System.out.println("Successfully added " + songName);
    }

    // this method plays songs that are in the queue
    public static void playSong(Scanner console, Queue<String> queue, Stack<String> history) { 
        if (queue.isEmpty()) {
            throw new IllegalStateException();
        }
        System.out.println("Playing song: " + queue.peek());
        history.add(queue.poll());        
    }

    // this method prints the history of songs that have been played
    public static void printHistory(Scanner console, Queue<String> queue, Stack<String> history) {
        if (history.isEmpty()) {
            throw new IllegalStateException();
        }
        Queue<String> q = new LinkedList<>();
        int size = history.size();
        for (int i = 0; i < size; i++) {
            System.out.println("    " + history.peek());
            q.add(history.pop());
        }
        queueToStack(q, history);
        stackToQueue(q, history);
        queueToStack(q, history);

    }

    // this method clears temporary history
    public static void clearHistory(Stack<String> history, Stack<String> allHistory) {
        //for loop that takes out one history stack at a time until there are no more left
        Queue<String> q = new LinkedList<>();
        int size = history.size();
        for (int i = 0; i < size; i++) {
            q.add(history.pop());
        }
        queueToStack(q, allHistory);
        stackToQueue(q, allHistory);
        queueToStack(q, allHistory);
    }

    // this method allows the user to choose which songs to delete from history
    public static void deleteFromHistory(Scanner console, Stack<String> history, Queue<String> queue) {
        System.out.println("A positive number will delete from recent history.");
        System.out.println("A negative number will delete from the beginning of history.");
        System.out.print("Enter number of songs to delete: ");
        String placement = console.nextLine();
        int delete = Integer.parseInt(placement);
        if (delete > 0) {
            if (delete > history.size()) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i != delete; i++) {
                history.pop();
            }

        } else if (delete < 0) {
            if (-delete > history.size()) {
                throw new IllegalArgumentException();
            }
            Queue<String> q = new LinkedList<>();
            stackToQueue(q, history);
            queueToStack(q, history);
            for (int i = 0; i != -delete; i++) {
                history.pop();
            }
            stackToQueue(q, history);
            queueToStack(q, history);
        }
    }

    // this method was going to save allHistory to a file but then I got lazy
    // public static void saveAllHistory(Scanner console, Stack<String> history, Stack<String> allHistory) 
    //                         throws FileNotFoundException {
    //     if (allHistory.isEmpty() || history.isEmpty()) {
    //         throw new IllegalStateException();
    //     }
    //     System.out.print("File name: ");
    //     String fileName = console.nextLine();
    //     PrintStream output = new PrintStream (new File(fileName));
    //     Queue<String> q = new LinkedList<>();
    //     if (history != allHistory) {
    //         stackToQueue(q, allHistory);
    //         queueToStack(q, allHistory);
    //         int size = history.size();
    //         for (int i = 0; i < size; i++) {
    //             allHistory.add(history.pop());
    //         }
    //         while (!allHistory.isEmpty()) {
    //             output.println(allHistory);
    //         }
    //     }
    // }

    // helper methods
    // these are used to move from queue to stack and vise versa
    // they allow there to be preservation of order when referencing stack or queue 
    public static void queueToStack (Queue<String> q, Stack<String> history) {
        while (!q.isEmpty()) {
            String s = q.remove();
            history.add(s);
        }
    }

    public static void stackToQueue (Queue<String> q, Stack<String> history) {
        while (!history.isEmpty()) {
            String s = history.pop();
            q.add(s);
        }
    }

}