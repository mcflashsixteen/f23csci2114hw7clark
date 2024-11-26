
import java.math.BigInteger;
public class Clark20 {
    public static void main (String args[]){
        BigInteger num = BigInteger.ONE;
        for ( int i = 1; i <= 100; i++)
            num = num.multiply(BigInteger.valueOf(i));
        String str = num.toString();
        int sum = 0;
        for(char digit : str.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        System.out.println("The sum of the numbers from !100 is: " + sum);

    }

}