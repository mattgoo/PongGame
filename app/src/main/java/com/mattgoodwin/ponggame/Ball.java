package com.mattgoodwin.ponggame;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


import android.view.View;

public class Ball extends View{

    private int width;
    private int height;
    private int xPos;
    private int yPos = 10;
    private boolean posativeX = true;
    private boolean goingDown = true;
    private GameActivity ga = new GameActivity();

    public Ball(Context context, int xValue, int yValue) {
        super(context);
        width = xValue;
        height = yValue;
        xPos = xValue/2;
    }

    public void onDraw( Canvas canvas ) {
        super.onDraw( canvas );

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10.0f);
        paint.setColor(Color.BLACK);

        canvas.drawCircle(xPos, yPos, 20, paint);
    }

    public void moveBall(){
        if(posativeX == true && goingDown == true) {
            xPos += 1;
            yPos += 1;
            if (xPos == (width - 20))
                posativeX = false;
            if (yPos == (height - 20))
                ga.alertDialog();
        }
        else if(posativeX == false && goingDown == true) {
            xPos -= 1;
            yPos += 1;
            if (xPos == 20)
                posativeX = true;
            if (yPos == (height - 20))
                ga.alertDialog();
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


}


