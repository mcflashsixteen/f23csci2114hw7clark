public class Clark3 {
    public static void main (String[] args){
        long n = 600851475143L;
        long big=0;

        while (n%2==0){
            big = 2;
            n/=2;
        }
        for(long i = 3; i <= Math.sqrt(n); i +=2){
            while (n%i == 0){
                big = i;
                n/= i;
            }
        }
        if (n > 2){
            big = n;
        }
        System.out.println("The largest prime factor is: " + big);
    }
}
