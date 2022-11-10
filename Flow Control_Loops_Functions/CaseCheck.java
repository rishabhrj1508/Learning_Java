import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c>=65 && c<=90) {
            System.out.println("Upper Case");
        }
        else if (c>=97 && c<=122) {
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Not a Alphabet");
        }
    }
    
}
