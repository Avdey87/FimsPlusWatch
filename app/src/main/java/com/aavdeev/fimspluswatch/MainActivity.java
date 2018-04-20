package com.aavdeev.fimspluswatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, GenerList.class);
                    startActivity(intent);
                }
            }
        };

        ListView list = findViewById(R.id.option);
        list.setOnItemClickListener(itemClickListener);
    }

    public void onCkickTimer(View view) {
        Intent intent = new Intent(MainActivity.this, TimerActivity.class);
        startActivity(intent);
    }
}
