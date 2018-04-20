package com.aavdeev.fimspluswatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TimerActivity extends Activity {

    private static int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        runTimer();
    }

    private void runTimer() {
        final TextView timer = findViewById(R.id.timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds / 3600) / 60;
                int sec = seconds % 60;

                String time = String.format("%2d:%02d:%02d", hours, minutes, sec);
                timer.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) {
            wasRunning = running;
            running = true;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onCkickStop(View view) {
        running = false;
    }

    public void onCkickReset(View view) {
        running = false;
        seconds = 0;
    }

    public void onClickIntentToActivity(View view) {

        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, GetActivity.class);
        intent.putExtra(GetActivity.MESSAGGE, message);
       startActivity(intent);
    }

    public void onClickToSendMessage(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        Intent chg = Intent.createChooser(intent, "Способ отправки");
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(chg);
    }
}
