import java.math.BigInteger;
public class Clark25 {
        public static void main(String[] args) {
            int digits = 1000; // Number of digits to find
            BigInteger first = BigInteger.ONE;
            BigInteger second = BigInteger.ONE;
            int index = 2;

            while (second.toString().length() < digits) {
                BigInteger next = first.add(second);
                first = second;
                second = next;
                index++;
            }

            System.out.println("The index of the first Fibonacci with " + digits + " digits is: " + index);
        }
    }


