package B4.KeThua.BaiTap.ClassPoint2DVaClassPoint3D;

public class Point3D extends Point2D {
    float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public  void  setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float arr[] = new float[3];
        arr[0] = this.getX();
        arr[1] = this.getY();
        arr[2] = this.getZ();
        return arr;
    }
    public String   toString(){
        String result ="";
        for (Object data:getXYZ()){
            result+= data + "\t";
        }
        return "Point3D x: "+getX()+" y: "+getY()+" z: "+ getZ()+" array:" + result + ", Point2D "+ super.toString();
    }
}
