import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println(
                "Select an Operation:\n 1. Addition \n 2.Subtraction \n 3.Multiplication\n Select an opration from 1,2 or 3:");
        int op = sc.nextInt();
      

        switch (op) {
            case 1:
                System.out.println("Result is " + (n1 + n2));
                break;
            case 2:
                System.out.println("Result is " + (n1 - n2));
                break;
            case 3:
                System.out.println("Result is " + (n1 * n2));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}
