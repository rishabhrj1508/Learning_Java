import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = 1;
        int x= Math.min(m, n);
        for (int i = 1; i <= x; i++) {
            if (m%i==0 && n%i==0) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
