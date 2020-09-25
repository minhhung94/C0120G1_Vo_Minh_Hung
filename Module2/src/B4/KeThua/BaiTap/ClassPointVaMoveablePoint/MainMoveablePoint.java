package B4.KeThua.BaiTap.ClassPointVaMoveablePoint;

public class MainMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint= new MoveablePoint();
        System.out.println(moveablePoint);
        MoveablePoint moveablePoint2 = new MoveablePoint(3, 3, 3, 3);

        moveablePoint = new MoveablePoint(4,5,6,7);
        System.out.println(moveablePoint);

        System.out.println( moveablePoint.move(moveablePoint2));
    }
}
