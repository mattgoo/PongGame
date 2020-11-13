package com.mattgoodwin.ponggame;

        import androidx.appcompat.app.AppCompatActivity;
        import android.graphics.Point;
        import android.os.Bundle;
        import android.view.GestureDetector;
        import android.view.MotionEvent;
        import java.util.Timer;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);

        GameView view = new GameView(this, size.x, size.y);
        setContentView(view);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Tell the pongView resume method to execute
        //GameView.resume();
    }

    // This method executes when the player quits the game
    @Override
    protected void onPause() {
        super.onPause();
        //GameView.pause();
    }



    /*
    private Game game;
    public int height;
    public int width;
    private GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point size = new Point( );
        getWindowManager( ).getDefaultDisplay( ).getSize( size );

        GameView view = new GameView( this , size.x, size.y);
        setContentView( view );

        //TouchHandler th = new TouchHandler();
        //detector = new GestureDetector( this, th );
        //detector.setOnDoubleTapListener( th );


        Timer gameTimer = new Timer();
        GameTimer task = new GameTimer( view );
        gameTimer.schedule(task, 0L, 1L);

        game = view.getGame();
    }

    /*

    public boolean onTouchEvent( MotionEvent event ) {
        detector.onTouchEvent( event );
        return true;
    }

    public class TouchHandler extends GestureDetector.SimpleOnGestureListener {
        public boolean onDoubleTapEvent( MotionEvent event ) {
            return true;
        }

        public boolean onSingleTapConfirmed( MotionEvent event ) {
            // update the cannon positio
            return true;
        }

        public boolean onScroll( MotionEvent event1, MotionEvent event2, float d1, float d2 ) {
            // update the cannon position
            updateCannon( event2 );
            return true;
        }

        public void updateCannon( MotionEvent event ) {
            float x = event.getX( ) - game.getCannonCenter().x;
            float y = game.getCannonCenter().y - event.getY();
            float angle = ( float ) Math.atan2( y, x );
            game.setCannonAngle( angle );

        }
        */


}