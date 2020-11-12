package com.mattgoodwin.ponggame;

import java.util.TimerTask;

public class GameTimer extends TimerTask {

    private GameView cView;

    public GameTimer(GameView view){
        cView = view;
    }

    public void run(){
        //if(paused != true){
            //cView.moveBall();
            cView.postInvalidate();
           // )
    }
}