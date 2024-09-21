// Author: Alan Pham
// TA: Kevin Nguyen
// Date: Oct 12 2023
// This is a program that creates, marks, loads, and saves TODO lists

import java.util.*;
import java.io.*;

public class TodoListManager {
    public static final boolean EXTENSION_FLAG = true;
    public static void main(String[] args) throws FileNotFoundException {
        // TODO: Your Code Here
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to your TODO List Manager!");
        List<String> listTodo = new ArrayList<>();
        String choice = "";
        while (!choice.equalsIgnoreCase("q")) {
            System.out.println("What would you like to do?");
            System.out.print("(A)dd TODO, (M)ark TODO as done, (L)oad TODOs, (S)ave TODOs, (Q)uit? ");
            choice = console.nextLine();
            if (choice.equalsIgnoreCase("a")) {
                addItem(console, listTodo);
                System.out.println("Today's TODOs:");
                printTodos(listTodo);
            } else if (choice.equalsIgnoreCase("m")) {
                markItemAsDone(console, listTodo);
                System.out.println("Today's TODOs:");
                printTodos(listTodo);
            } else if (choice.equalsIgnoreCase("l")) {
                loadItems(console, listTodo);
                System.out.println("Today's TODOs:");
                printTodos(listTodo);
            } else if (choice.equalsIgnoreCase("s")) {
                saveItems(console, listTodo);
                System.out.println("Today's TODOs:");
                printTodos(listTodo);
            } else if (choice.equalsIgnoreCase("p")) {
                printTodos(listTodo);
                System.out.println("Today's TODOs:");
                printTodos(listTodo);
            } else if (!choice.equalsIgnoreCase("q")) {
                System.out.println("Unknown input: " + choice);
                System.out.println("Today's TODOs:");
                printTodos(listTodo);
            } 

        }
        if (EXTENSION_FLAG == true) {
            deleteFile(console, listTodo);
        }

    }

    // This method prints out the current TODO list
    public static void printTodos(List<String> listTodo) {
        // TODO: Your Code Here
        if (listTodo.isEmpty()) {
            System.out.println("  You have nothing to do yet today! Relax!");
        } else {
            for (int i = 0; i < listTodo.size(); i++) {
                System.out.println("  " + (i+1) + ": " + listTodo.get(i));
            }
        }
    }

    // This method adds items to the TODO list
    public static void addItem(Scanner console, List<String> listTodo) {
        // TODO: Your Code Here
        System.out.print("What would you like to add? ");
        String newTodo = console.nextLine();
        if (listTodo.isEmpty()){
            listTodo.add(newTodo);
        } else {
            System.out.print("Where in the list should it be (1-" + (listTodo.size() + 1) + ")? (Enter for end): ");
            String placement = console.nextLine();
            if (placement.isEmpty()) {
                listTodo.add(newTodo);
            } else {
                int input = Integer.parseInt(placement); 
                listTodo.add(input - 1, newTodo);
            }
        }
    }

    // This method marks items as done
    public static void markItemAsDone(Scanner console, List<String> listTodo) {
        // TODO: Your Code Here
        if (listTodo.isEmpty()) {
            System.out.println("All done! Nothing left to mark as done!");
        } else {
            System.out.print("Which item did you complete (1-" + listTodo.size() + ")? ");
            String placement = console.nextLine();
            int input = Integer.parseInt(placement);
            // String markedDone = listTodo.get(input-1);
            listTodo.remove(input-1);
            // System.out.println("Here are the items marked done: [" + markedDone + "]");

        }
    }

    // This method loads items from a specified file
    public static void loadItems(Scanner console, List<String> listTodo)
                                throws FileNotFoundException {
        // TODO: Your Code Here
        System.out.print("File name? ");
        String fileName = console.nextLine();
        Scanner listTodoScan = new Scanner(new File(fileName));
        listTodo.clear();
        while (listTodoScan.hasNextLine()) {
            String nextTodo = listTodoScan.nextLine();
            listTodo.add(nextTodo);
        }
    }

    // This method saves items to a specified file
    public static void saveItems(Scanner console, List<String> listTodo)
                                throws FileNotFoundException {
        // TODO: Your Code Here
        System.out.print("File name? ");
        String namedFile = console.nextLine();
        PrintStream output = new PrintStream(new File(namedFile));
        output.println(listTodo);
    }

    // This is a method that deletes files from the folder
    public static void deleteFile(Scanner console, List<String> listTodo) {
        System.out.println("Which TODO list do you want to delete? ");
        String fileDelete = console.nextLine();
        File file = new File(fileDelete);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete file.");
        }
    }

}