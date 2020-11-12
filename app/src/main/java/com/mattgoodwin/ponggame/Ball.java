package com.mattgoodwin.ponggame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

import android.view.View;

public class Ball extends View{

    private int width;

    public Ball(Context context, int xValue) {
        super(context);
        width = xValue;
    }

    public void move(){

    }

    public void onDraw( Canvas canvas ) {
        super.onDraw( canvas );


        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10.0f);
        paint.setColor(Color.BLACK);

        canvas.drawCircle(width/2, 100, 200, paint);
    }
}


