public class Clark6 {

        public static void main(String[] args) {
            int n = 100;
            long sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6;
            long squareOfSum = (long) Math.pow((n * (n + 1)) / 2, 2);
            long diff = squareOfSum - sumOfSquares;
            System.out.println("The difference is: " + diff);
        }
}
