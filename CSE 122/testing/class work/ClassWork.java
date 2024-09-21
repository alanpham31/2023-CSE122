import java.util.*;

public class ClassWork{
    public static void main(String[] args) {
            List<Integer> arr = addValues();
            System.out.println(learnIndexOf(arr, 8));
            System.out.println(learnIndexOf(arr, 2));

        /* TODO */
        // Implement the learnIndexOf() method below
        // Returns the earliest index of a given index if it appears in the
        // given list and returns -1 if the target value is not in the list
        // Parameters:
        //  - List<Integer> list: the list to search
        //  - int target: the target value
        public static int learnIndexOf(List<Integer list, int target) {
            for (int i = 0; i < list.size(); i++) {
                int value = list.get(i);
                if (value == target) {
                    return i;
                }
            }
            return -1;
        }

        

        // Returns a populated list of ints.
        private static List<Integer> addValues() {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(42);
            list.add(7);
            list.add(-9);
            list.add(14);
            list.add(8);
            list.add(39);
            list.add(42);
            list.add(8);
            list.add(19);
            list.add(0);
            return list;
        }
    }
}