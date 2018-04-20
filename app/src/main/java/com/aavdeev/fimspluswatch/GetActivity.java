package com.aavdeev.fimspluswatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class GetActivity extends Activity {

    private CarBrand brandList = new CarBrand();
    public static String MESSAGGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        TextView textView = findViewById(R.id.text_view);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGGE);
        textView.setText(message);
    }

    public void oonClickCars(View view) {
        TextView textView = findViewById(R.id.cars);
        Spinner coutry = findViewById(R.id.spinner);
        String carsType = String.valueOf(coutry.getSelectedItem());

        List<String> cars = brandList.getCarBrand(carsType);
        StringBuilder stringBuilder = new StringBuilder();

        for (String carList : cars) {
            stringBuilder.append(carList).append("\n");
        }
        textView.setText(stringBuilder);
    }
}
