import java.util.Scanner;

public class Sum_of_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=0) {
            System.out.println("Invalid Input");
            return;
        } else{
            System.out.println(n*(n+1)/2);
        }

    }
    
}
