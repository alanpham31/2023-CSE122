import java.util.List;

public class notes {
    public static void main(String[] args) {
       method();
        public static void method(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, list.get(i));
            }
            else {
                list.add(i+1, list.get(i));
                i++;
        } 

    }
}
