public class Clark7 {
    public static void main(String[] args) {
        int n = 10001;
        int count = 0;
        int candidate = 2;
        int nthPrime = 0;

        while (count < n) {
            if (prime(candidate)) {
                count++;
                nthPrime = candidate;
            }
            candidate++;
        }
        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }
    public static boolean prime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
