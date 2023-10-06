package Pr_7._1_;

import Pr_7._1_.MovablePoint;

public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (SpeedTest(topLeft, bottomRight))
        {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }
        else{
            System.out.println("Скорости точек должны быть равны!");
            System. exit(0);
        }
    }
    public boolean SpeedTest(MovablePoint point1,MovablePoint point2){
        if (!((point1.xSpeed == point2.xSpeed) && (point1.ySpeed == point2.ySpeed)))
        {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x1=" + topLeft.x +
                ", y1=" + topLeft.y +
                ", x2=" + bottomRight.x +
                ", y2=" + bottomRight.y +
                '}';
    }

    public void moveUp(){
        topLeft.setY(topLeft.y+ topLeft.ySpeed);
        bottomRight.setY(bottomRight.y+topLeft.ySpeed);
    }
    public void moveDown(){
        topLeft.setY(topLeft.y - topLeft.ySpeed);
        bottomRight.setY(bottomRight.y - topLeft.ySpeed);
    }
    public void moveLeft(){
        topLeft.setX(topLeft.x-topLeft.xSpeed);
        bottomRight.setX(bottomRight.x-topLeft.xSpeed);
    }
    public void moveRight(){
        topLeft.setX(topLeft.x+topLeft.xSpeed);
        bottomRight.setX(bottomRight.x+topLeft.xSpeed);
    }
}
