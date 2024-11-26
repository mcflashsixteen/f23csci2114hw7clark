import java.util.stream.IntStream;

public class Clark5 {
    public static void main(String[] args) {
        long result = IntStream.rangeClosed(1, 20)
                .mapToLong(i -> i)
                .reduce(1, Clark5::lcm);

        System.out.println("Smallest number divisible by all numbers from 1 to 20: " + result);
    }
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
