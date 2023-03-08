package Kiemtrabai1;
/* Bài 1 */

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(-2);
        System.out.println("Chu Vi: " + c1.Circumfernce());
        System.out.println("Diện Tích: "+ c1.getArena());

        Circle c2 = new Circle(2.5);
        System.out.println(" Chu Vi: " + c2.Circumfernce());
        System.out.println("Diện Tích: "+ c2.getArena());

    }
}

