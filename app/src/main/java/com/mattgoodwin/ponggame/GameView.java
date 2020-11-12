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

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10.0f);
        paint.setColor(Color.BLACK);
    }

    public void onDraw( Canvas canvas ) {
        super.onDraw( canvas );

        canvas.drawCircle(500, 10, 20, paint);

    }

    public Game getGame(){
        return game;
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


