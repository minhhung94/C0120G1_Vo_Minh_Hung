package B4.KeThua.BaiTap.ClassPointVaMoveablePoint;

public class MoveablePoint extends Point{
    float xSpeed;
    float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = getxSpeed();
        arr[1] = getySpeed();
        return arr;
    }
    public MoveablePoint move(MoveablePoint moveablePoint){
        moveablePoint.setX(super.getX()+this.getxSpeed());
        moveablePoint.setY(super.getY()+this.getySpeed());
        return moveablePoint;
    }
    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
