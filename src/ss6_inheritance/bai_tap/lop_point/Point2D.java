package ss6_inheritance.bai_tap.lop_point;

public class Point2D {
    private float x ;
    private float y ;
    public Point2D(){

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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
    public float[] getxy(){
        float[] floats =new float[2];
        floats[0]=x;
        floats[1]=y;
        return floats;
    }
    public void setxy(){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "x =" +x+
                ","+
                "y ="+y;
    }
}
