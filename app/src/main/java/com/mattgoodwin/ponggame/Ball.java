package com.mattgoodwin.ponggame;

import android.graphics.Point;
import android.graphics.RectF;

public class Ball {
    private float ballRadius;
    private float ballSpeedX;
    private float ballSpeedY;
    private RectF ball;
    private int deltaTime;

    public Ball(int width, int height){
        ballRadius = width/20;
        ball = new RectF();
        ballSpeedY = height/5;
        ballSpeedX = width/2;
        deltaTime = 10;
    }

    public RectF getBall(){
        return ball;
    }

    public void moveBall() {
        ball.left += ballSpeedX;
        ball.right = ball.left + ballRadius;
        ball.top += ballSpeedY;
        ball.bottom = ball.top - ballRadius;
    }

    public void changeDirectionX(){
        ballSpeedX = -ballSpeedX;
    }

    public void changeDirectionY(){
        ballSpeedY = -ballSpeedY;
    }

    public void reset(int disWidth, int disHeight){
        ball.left = disWidth / 2;
        ball.top = 20;
        ball.right = disWidth / 2 + ballRadius;
        ball.bottom = 20 + ballRadius;
    }



    /*

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

    public void moveBall() {
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

    public Rect getRect(){
        return
    }


     */

}
