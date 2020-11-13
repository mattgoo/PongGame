package com.mattgoodwin.ponggame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


import android.view.View;

public class GameView extends View{

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


