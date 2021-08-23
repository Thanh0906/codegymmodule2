package ss6_inheritance.bai_tap.lop_point_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(6,8,2,5);
        System.out.println(movablePoint.toString());
        movablePoint.movie();
        System.out.println(movablePoint.toString());
    }
}
