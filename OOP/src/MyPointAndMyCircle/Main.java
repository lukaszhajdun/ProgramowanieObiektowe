package MyPointAndMyCircle;

public class Main {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(1,2);
        MyPoint B = new MyPoint(3,4);

        System.out.println(A);
        System.out.println(B);

        A.distance(B);
        System.out.println(A.distance(B));
    }
}
