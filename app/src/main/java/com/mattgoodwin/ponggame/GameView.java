package com.mattgoodwin.ponggame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


import android.graphics.RectF;
import android.view.SurfaceHolder;

import android.view.View;


public class GameView extends View implements Runnable{

    private Thread thread = null;
    private Canvas canvas;
    private Paint paint;
    private int deltaTime;
    private int width;
    private int height;
    private Ball ball;
    private Paddle paddle;
    private int score;
    private SurfaceHolder holder;

    public GameView(Context context, int disHeight, int disWidth){
        super(context);
        height = disHeight;
        width = disWidth;

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10.0f);
        paint.setColor(Color.BLACK);

        ball = new Ball(width, height);
        paddle = new Paddle(width, height);

        reset();
    }


    @Override
    public void run() {
        go();
    }



    public void reset(){
        ball.reset(width, height);
        score = 0;
    }

    public void go(){
        ball.moveBall();
        paddle.movePaddle(); //no touch control


        if (RectF.intersects(ball.getBall(), paddle.getPaddle())){
            ball.changeDirectionY();
            score += 1;
        }


        if (ball.getBall().top <= 0)
            ball.changeDirectionY();

        if (ball.getBall().right >= width)
            ball.changeDirectionX();

        if (ball.getBall().left <= 0)
            ball.changeDirectionX();


        if(ball.getBall().bottom >= height){
            reset();
        }
    }

    public void resume() {
        thread = new Thread(this);
        thread.start();
    }




    public void onDraw( Canvas canvas ){
        super.onDraw(canvas);
        canvas.drawRect(ball.getBall(), paint);
        canvas.drawRect(paddle.getPaddle(), paint);
    }




    public void draw() {
            canvas = holder.lockCanvas();
            canvas.drawColor(Color.WHITE);
            paint.setColor(Color.BLACK);

            // Draw the mBat
            canvas.drawRect(paddle.getPaddle(), paint);

            // Draw the mBall
            canvas.drawRect(ball.getBall(), paint);

            // Draw the mScore
            paint.setTextSize(40);
            canvas.drawText("Score: " + score, 10, 50, paint);

            // Draw everything to the screen
            holder.unlockCanvasAndPost(canvas);
        }











    /*
    private int width;
    private int height;
    public static int deltaTime = 100;
    private Paint paint;
    private Game game;

    public GameView(Context context, int width, int height) {
        super(context);
        this.width = width;
        this.height = height;

    }

    public void onDraw( Canvas canvas ) {
        super.onDraw( canvas );

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10.0f);
        paint.setColor(Color.BLACK);

        canvas.drawCircle(width/2, 20, 20, paint);

        paint.setStrokeWidth(30f);

        //float startHeight = (float)(height * .85);

        //canvas.drawLine((width/2)-100, startHeight, (width/2)+100, startHeight, paint);
        //canvas.drawLine(20, 20, 40, 40, paint);
    }





    /*
    public void moveBall(){
        if(posativeX == true && goingDown == true) {
            xPos += 1;
            yPos += 1;
            if (xPos == (width - 20))
                posativeX = false;
            if (yPos == (height - 20))
                //change direction
        }
        else if(posativeX == false && goingDown == true) {
            xPos -= 1;
            yPos += 1;
            if (xPos == 20)
                posativeX = true;
            if (yPos == (height - 20))
                //change direction
        }
        else if(posativeX == true && goingDown == false) {
            xPos += 1;
            yPos -= 1;
            if (xPos == (width - 20))
                posativeX = false;
            if (yPos == 20)
                goingDown = true;

        }
        else if(posativeX == false && goingDown == false) {
            xPos -= 1;
            yPos -= 1;
            if (xPos == 20)
                posativeX = true;
            if (yPos == 20)
                goingDown = true;
        }
    }
     */


}


