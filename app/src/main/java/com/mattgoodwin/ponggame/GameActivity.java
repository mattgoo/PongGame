package com.mattgoodwin.ponggame;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.DisplayMetrics;
        import java.util.Timer;

public class GameActivity extends AppCompatActivity {

    public int height;
    public int width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Ball view = new Ball( this );
        setContentView( view );

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;

        Timer gameTimer = new Timer();
        GameTimer task = new GameTimer( view );
        gameTimer.schedule(task, 0L, 100L);
    }
}