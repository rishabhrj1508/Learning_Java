public class Output {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.print(b);
        System.out.println();

        double y = Math.PI;

        System.out.format("Value of a is %d\n",a);
        System.out.format("Value of b is %d\n",b);

        System.out.format("The value of Pi is %f\n" , y);
        System.out.format("The value of Pi is %.2f\n" , y);
        System.out.format("The value of Pi is %7.2f\n" , y);
        System.out.format("The value of Pi is %07.2f\n" , y);
    }
    
}
