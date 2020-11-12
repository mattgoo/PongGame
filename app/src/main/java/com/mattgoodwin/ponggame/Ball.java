package com.mattgoodwin.ponggame;

import android.Manifest;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class Ball extends View{

    private int xValue = 100;
    private int yValue = 700;

    private RectF ball = new RectF();

    public Ball(Context context) {
        super(context);
    }

    public void move(){

    }

        public void onDraw( Canvas canvas ) {
        super.onDraw( canvas );

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10.0f);
        paint.setColor(Color.BLACK);

        ball = new RectF(xValue, yValue, xValue + 200, yValue + 200);
        canvas.drawCircle(MainActivity.width, );
    }
}


