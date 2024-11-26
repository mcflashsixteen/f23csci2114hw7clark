public class Clark2 {
    public static void main (String[] args){
        int a = 1;
        int b = 2;
        int sum = 0;
        while (a <= 4000000){
            if (a % 2 ==0){
                sum += a;
            }
            int move = a + b;
            a = b;
            b = move;
        }
        System.out.println("Sum is: " + sum);
    }
}
