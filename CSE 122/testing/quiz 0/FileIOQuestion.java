import java.util.*;
import java.io.*;

public class FileIOQuestion {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));

        int difference = modularDifference(input);
        System.out.println("Difference = " + difference);
    }

    public static void modularDifference(Scanner console, List<String> input) {
        for (int i = 0; i < input.size(); i++) {
            if (list.get(i) % 2 == 0) {
                String[] even = list.get(i).length();
                System.out.println(even);
            }
            else {
                String[] odd = list.get(i).length();
                System.out.println(odd);
            }
        }
    }
}