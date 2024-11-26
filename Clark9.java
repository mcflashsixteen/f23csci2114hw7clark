public class Clark9 {

        public static void main(String[] args) {
            int sum = 1000;
            int product = 0;
            for (int a = 1; a < sum / 3; a++) { // a < 333
                for (int b = a + 1; b < sum / 2; b++) { // b < 500
                    int c = sum - a - b;
                    if (a * a + b * b == c * c) {
                        product = a * b * c;
                        System.out.printf("Found triplet: a = %d, b = %d, c = %d%n", a, b, c);
                        System.out.printf("Product: %d%n", product);
                        return;
                    }
                }
            }
        }
    }


