import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        int x = Integer.parseInt(br.readLine());
        System.out.println(x);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        int y = sc.nextInt();
        System.out.println(y);
        float f = sc.nextFloat();
        System.out.println(f);
    }
    
}
