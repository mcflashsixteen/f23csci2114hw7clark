public class Clark4 {
    public static void main(String[] args) {
    int lp = 0;
    for (int a = 999; a >= 100; a--) {
        for (int b = 999; b >= 100; b--) {
            int product = a * b;
            if (isPal(product) && product > lp) {
                lp = product;
            }
        }
    }
    System.out.println("Largest Palindrome: " + lp);
}
    public static boolean isPal(int number) {
        String str = Integer.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
