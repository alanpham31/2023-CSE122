import java.util.*;

public class RemoveFirsts {
    public static void main(String[] args) {
        List<List<String>> input = addValues();
        System.out.println(input);
        
        removeFirsts(input);
        System.out.println(input);
    }

    /* TODO */
    // implement the removeFirsts() method below.
    public static void removeFirsts(List<List<String>> outer) {
        for (List<String> inner : outer) {
            inner.remove(0);
        }

        // remove the first element in the inner list
    }


    

    // [ignore] private method to set up program
    // Returns a List of String Lists.
    private static List<List<String>> addValues() {
        List<List<String>> result = new ArrayList<>();

        List<String> words = new ArrayList<>();
        words.add("hi");
        result.add(words);

        words = new ArrayList<>();
        words.add("How");
        words.add("are");
        words.add("you");
        words.add("?");
        result.add(words);

        words = new ArrayList<>();
        words.add("I");
        words.add("am");
        words.add("fantabulous");
        result.add(words);

        return result;
    }
}