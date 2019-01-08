package com.wtf.autoupload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    Timer timerFuck;
    MyFuckingTimerTask fuckingTimerTask;
    Integer fuck=1;
    private Long delayFuck=60000L;
    private Long periodFuck=60000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerFuck=new Timer();
        fuckingTimerTask=new MyFuckingTimerTask();
        timerFuck.schedule(fuckingTimerTask,delayFuck,periodFuck);

    }

    private class MyFuckingTimerTask extends TimerTask
    {
        @Override
        public void run()
        {
            Log.d("wtf","wtf bitch "+String.valueOf(fuck));
            fuck++;
        }
    }
}
