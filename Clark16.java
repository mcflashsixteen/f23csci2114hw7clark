
import java.math.BigInteger;
public class Clark16 {
    public static void main (String args[]){
        BigInteger num = BigInteger.valueOf(2).pow(1000);
        String str = num.toString();
        int sum =0;
        for(char digit : str.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        System.out.println("The sum of the digits of the number 2^1000 is: " + sum);

    }

}
