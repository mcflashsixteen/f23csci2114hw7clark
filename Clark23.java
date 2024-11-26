import java.util.ArrayList;
import java.util.HashSet;
public class Clark23 {

    public static void main(String[] args) {
            int limit = 28123;
            ArrayList<Integer> numbers = findNumbers(limit);
            HashSet<Integer> sums = new HashSet<>();
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = i; j < numbers.size(); j++) {
                    int sum = numbers.get(i) + numbers.get(j);
                    if (sum <= limit) {
                        sums.add(sum);
                    }
                }
            }
            long totalSum = 0;
            for (int i = 1; i <= limit; i++) {
                if (!sums.contains(i)) {
                    totalSum += i;
                }
            }
            System.out.println("The sum of all positive integers which can't be written as the sum of two abundant numbers is: " + totalSum);
        }
        public static int divSums(int n) {
            int sum = 1;
            int sqrtN = (int) Math.sqrt(n);

            for (int i = 2; i <= sqrtN; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (i != n / i) {
                        sum += n / i;
                    }
                }
            }
            return sum;
        }
        public static ArrayList<Integer> findNumbers(int limit) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= limit; i++) {
                if (divSums(i) > i) {
                    numbers.add(i);
                }
            }
            return numbers;
        }
    }


