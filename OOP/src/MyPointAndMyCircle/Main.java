package MyPointAndMyCircle;

public class Main {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(1,2);
        MyPoint B = new MyPoint(3,4);

        System.out.println(A);
        System.out.println(B);

        A.distance(B);
        System.out.println(A.distance(B));

        MyPoint center = new MyPoint(1,1);
//        MyCircle circle = new MyCircle(center,1); TU SIE SYPIE

        System.out.println(center);
//        System.out.println(circle);
    }
}
