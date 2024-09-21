import java.util.*;
import java.io.*;

public class ClassDebugging {
    public static void main(String[] args) {
        int[] input1 = {0, 1, 2, 3, 4, 5};      //Expected Output: {-1, -3, -5}
        int[] input2 = {2, -4, 6, -8, 10, -12}; //Expected Output: {4, 8, 12}

        List<Integer> output1 = removeAndNegate(input1);
        List<Integer> output2 = removeAndNegate(input2);

        System.out.println(output1);
        System.out.println(output2);
        
    }

    public static List<Integer> removeAndNegate(int[] array) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < array.size(); i++) {
            list.add(array[i]);
        }

        for(int i = 0; i < list.length(); i++) {
            list.remove(i);
            int negatedNumber = list.get(i) * -1;
            list.set(i + 1, negatedNumber);
        }
        return list;
    }
}