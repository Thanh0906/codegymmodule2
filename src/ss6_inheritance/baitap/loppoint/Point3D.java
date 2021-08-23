package ss6_inheritance.baitap.loppoint;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){

    }
    public Point3D (float x,float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getxyz(){
        float[] floats = new float[3];
        floats[0]= getX();
        floats[1]=getY();
        floats[2]=z;
        return floats;
    }
    public void setxyz(){
        super.setxy();
        this.z=z;

    }

    @Override
    public String toString() {
        return "Point3D{"+ super.toString() +","+
                "z=" + z
                +"}"
                ;
    }
}
