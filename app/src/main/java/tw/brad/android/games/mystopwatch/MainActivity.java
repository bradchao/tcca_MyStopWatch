package tw.brad.android.games.mystopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private boolean isRunning;
    private Button leftBtn, rightBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftBtn = (Button)findViewById(R.id.leftBtn);
        rightBtn = (Button)findViewById(R.id.rightBtn);
    }

    public void doLeft(View v){
        if (isRunning){
            // Lap
            doLap();
        }else{
            // Reset
            doReset();
        }
    }

    public void doRight(View v){
        isRunning = !isRunning;
        if (isRunning){
            rightBtn.setText("Stop");
            leftBtn.setText("Lap");
            doStart();
        }else{
            rightBtn.setText("Start");
            leftBtn.setText("Reset");
            doStop();
        }
    }

    private void doStart(){

    }
    private void doStop(){

    }
    private void doLap(){

    }
    private void doReset(){

    }



}
