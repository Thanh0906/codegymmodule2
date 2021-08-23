package ss6_inheritance.bai_tap.lop_point_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x ,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
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
    public float[] getSpeed(){
        float[] floats =new float[2];
        floats[0]=xSpeed;
        floats[1]=ySpeed;
        return floats;
    }
    public void setSpeed(){
        this.xSpeed=xSpeed;
        this.ySpeed =ySpeed;
    }

    @Override
    public String toString() {
        return  "MovablePoint{" + super.toString() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void movie(){
        super.setxy(super.getX()+ xSpeed, super.getY() + ySpeed);


    }
}
