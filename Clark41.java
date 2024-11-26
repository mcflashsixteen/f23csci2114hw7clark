import java.util.ArrayList;
import java.util.Collections;
public class Clark41 {
        public static void main(String[] args) {
            ArrayList<Integer> panNums = genPanNums(7);
            Collections.sort(panNums, Collections.reverseOrder());
            for (int number : panNums) {
                if (isPrime(number)) {
                    System.out.println("The largest 7-digit pandigital prime is: " + number);
                    return;
                }
            }
        }
        public static ArrayList<Integer> genPanNums(int n) {
            ArrayList<Integer> pandigitalNumbers = new ArrayList<>();
            permute("", "1234567", pandigitalNumbers);
            return pandigitalNumbers;
        }
        public static void permute(String prefix, String remaining, ArrayList<Integer> results) {
            if (remaining.length() == 0) {
                results.add(Integer.parseInt(prefix));
            } else {
                for (int i = 0; i < remaining.length(); i++) {
                    permute(
                            prefix + remaining.charAt(i),
                            remaining.substring(0, i) + remaining.substring(i + 1),
                            results
                    );
                }
            }
        }
        public static boolean isPrime(int number) {
            if (number < 2) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        }
}
