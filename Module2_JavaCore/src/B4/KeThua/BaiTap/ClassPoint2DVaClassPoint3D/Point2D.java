package B4.KeThua.BaiTap.ClassPoint2DVaClassPoint3D;

public class Point2D {

    float x=0.0f;
    float y=0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0]=getX();
        array[1]=getY();
        return array;
    }
    public String toString(){
        return "x :"+getX()+" y :"+getY();
    }
}
