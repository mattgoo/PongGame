package com.mattgoodwin.ponggame;

import java.util.TimerTask;

public class GameTimer extends TimerTask {

    private GameView gameView;
    private Game game;

    public GameTimer( GameView view ) {
        gameView = view;
        game = gameView.getGame();
    }

    public void run(){
        game.moveBall(true,true);
        gameView.postInvalidate();
    }
}