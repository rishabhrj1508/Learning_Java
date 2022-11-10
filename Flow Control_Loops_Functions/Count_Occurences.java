import java.util.Scanner;

public class Count_Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int digit = sc.nextInt();

        // we have to count the no if digits in n.
        // 1232123 - number of 2's in this is 3

        int count = 0;
        while (n>0) {
            if (n%10 == digit) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
    
}
