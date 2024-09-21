import java.util.*;

public class AddAll {
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        list1.add('m');
        list1.add('a');
        list1.add('d');
        list1.add('a');

        List<Character> list2 = new ArrayList<>();
        list2.add('t');
        list2.add('i');
        list2.add('l');

        addAll(list1, list2, 2);
        System.out.println(list1);
    }
    public static void addAll(List<Character> list1, List<Character> list2, int location) {
        for (int i = list2.size() - 1; i >= 0; i--) [
            list1.add(location, list2.get(i));
            
       ]

    }
}