class Point{
    int x;
    int y;
}

public class Non_Primitive {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        System.out.println(p.x);
        System.out.println(p.y);
    }
}
