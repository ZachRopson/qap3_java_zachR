public class DemoTask3 {
    public static void main(String[] args) {
        Point p1 = new Point(2.3f, 4.5f);
        System.out.println(p1);

        MovablePoint mp1 = new MovablePoint(2.3f, 4.5f, 1.0f, 1.0f);
        System.out.println(mp1);
        mp1.move();
        System.out.println(mp1);
    }
}

