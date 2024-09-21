public class testing {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("poem.txt"));

        output.println("she sells sea shells");
        output.println("by the sea shore");
        for (int i = 1; i <= 5; i++) {
            output.print(i);
        }
    }
}