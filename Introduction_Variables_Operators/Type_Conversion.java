public class Type_Conversion {
    public static void main(String[] args) {
        int x = 100;
        long l = x;  //implicit-widening
        float f = l;
        System.out.println(x);
        System.out.println(l);
        System.out.println(f);

        double d = 65.4;
        int i = (int)d; // explicit-narrowing
        char c = (char)i;

        System.out.println(d);
        System.out.println(i);
        System.out.println(c);


    }
    
}
