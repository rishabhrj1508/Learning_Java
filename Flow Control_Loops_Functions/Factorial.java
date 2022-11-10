import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1 || n==0) {
            System.out.println(1);
        }
        else{
            int i = 1;
            while(n>0){
                i = i*n;
                n--;
            }
            System.out.println(i);
        }
    }
    
}
