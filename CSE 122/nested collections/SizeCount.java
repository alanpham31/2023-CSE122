import java.util.*;

public class SizeCount {
    public static void main(String[] args) {
        Set<Set<String>> input = addValues();
        System.out.println(input);
        // System.out.println(sizeCount(input));
    }

    /* TODO */
    // implement the sizeCount() method below.

    public static void sizeCount(Set<Set<String>> input) {
        Map<Integer, Integer> result = new TreeMap<>();
    //     for (Set<String> inner : input) {
    //         for (int i = 0; i < input.size(); i++) {
    //             int test = inner.size();
    //             Set<Integer> count = ;
    //         }
    //     }

        for (Set<String> words : input) {
            int size = words.size();
            if (!result.containsKey(size)) {
                result.put(size, 0);
            }
            result.put(size, result.get(size + 1));
        }

    }





    // [ignore] private method to set up program
    private static Set<Set<String>> addValues() {
        Set<Set<String>> result = new HashSet<>();

        Set<String> words = new HashSet<>();
        words.add("to");
        words.add("be");
        words.add("or");
        result.add(words);

        words = new HashSet<>();
        words.add("not");
        result.add(words);

        words = new HashSet<>();
        words.add("to");
        result.add(words);

        words = new HashSet<>();
        words.add("be");
        result.add(words);

        words = new HashSet<>();
        words.add("that");
        words.add("is");
        result.add(words);

        words = new HashSet<>();
        words.add("the");
        words.add("question");
        result.add(words);
        
        return result;
    }
}