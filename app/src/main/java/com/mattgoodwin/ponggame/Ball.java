package com.mattgoodwin.ponggame;

import android.graphics.Point;

public class Ball {
    private float ballSpeedX;
    private float ballSpeedY;
    private Point ballCenter;
    private int deltaTime;
    private boolean down = true;
    private boolean right = true;

    public Ball(float newBallSpeed, int width, int height){
        setBallSpeed(newBallSpeed);
    }

    public void setBallSpeed( float newBulletSpeed ) {
        ballSpeedX = newBulletSpeed;
        ballSpeedY = newBulletSpeed;
    }

    private void setDeltaTime(int newDeltaTime){
        if(newDeltaTime > 0)
            deltaTime = newDeltaTime;
    }

    public void moveBall( boolean down, boolean right) {
        ballCenter.x += ballSpeedX * deltaTime;
        ballCenter.y += ballSpeedY * deltaTime;
    }

    public void changeDirectionX(){
        ballSpeedX = -ballSpeedX;
    }

    public void changeDirectionY(){
        ballSpeedY = -ballSpeedY;
    }

    public void reset(int width, int height){
        ballCenter.x = width / 2;
        ballCenter.y = 20 ;
    }

    public void setBallPos(Point newBallPos){
        ballCenter = new Point(newBallPos.x, newBallPos.y);
    }


}
