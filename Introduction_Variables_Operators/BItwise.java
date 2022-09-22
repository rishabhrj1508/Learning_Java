public class BItwise {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int z = x&y;
        int o = x|y;

        System.out.println(z);
        System.out.println(o);

        System.out.println(x^y); //
        
        System.out.println(~x); //compliment

        System.out.println(x<<1); //Left Shift
        System.out.println(x<<2); // x*2^y

        System.out.println(x>>1);
    }
    
}
