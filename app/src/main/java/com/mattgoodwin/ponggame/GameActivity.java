package com.mattgoodwin.ponggame;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.AlertDialog;
        import android.content.DialogInterface;
        import android.graphics.Point;
        import android.os.Bundle;
        import android.view.View;

        import java.util.Timer;

public class GameActivity extends AppCompatActivity {

    public int height;
    public int width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point size = new Point( );
        getWindowManager( ).getDefaultDisplay( ).getSize( size );

        Ball view = new Ball( this , size.x, size.y);
        setContentView( view );

        Timer gameTimer = new Timer();
        GameTimer task = new GameTimer( view );
        gameTimer.schedule(task, 0L, 1L);
    }

    public void alertDialog(){
        finish();
    }

    /*
    On Touch

    Timer gameTimer = new Timer();
    GameTimer task = new GameTimer( view );
    gameTimer.schedule(task, 0L, 100L);
     */


}