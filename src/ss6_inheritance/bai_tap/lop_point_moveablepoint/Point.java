package ss6_inheritance.bai_tap.lop_point_moveablepoint;

public class Point {
    private float x;
    private  float y;
    public  Point(){

    }

    public Point(float x, float y) {
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
        float [] floats =new float[2];
        floats[0] =x;
        floats [1] =y;
        return floats;
    }
    public void setxy(float x,float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point" +
                " x=" + x +
                ", y=" + y +
                ", ";
    }
}
