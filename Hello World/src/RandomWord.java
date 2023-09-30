import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] words = StdIn.readAllStrings();
        int m = words.length;
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * m);
            System.out.println(words[r]);
        }
    }

}
