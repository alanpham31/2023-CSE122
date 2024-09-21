import java.util.*;

public class HarderCodingProblem {
    public static void main(String[] args) {
        List<Integer> originalList = addValues();
        List<Integer> result = fromCounts(originalList);
        System.out.println(result);
    }

    /* TODO */
    // Implement the fromCounts() method below.
    public static List<Integer> fromCounts(Llist<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i = i + 2) { //or i += 2
            int count = list.get(i);
            int val = list.get(i + 1);
            for (int j = 0; j < count; j++)
                result.add(val);
        }
        return result;
    }

    // Returns a populated list of ints.
    private static List<Integer> addValues() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(-5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);
        return list;
    }
}