package com.mattgoodwin.ponggame;

import java.util.TimerTask;

public class GameTimer extends TimerTask {

    private Ball cView;

    public GameTimer(Ball view){
        cView = view;
    }

    public void run(){
        cView.move();
        cView.postInvalidate();
    }
}