package com.aavdeev.fimspluswatch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends Activity {

    public static final String DESCRIPTION = "desID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        int desID = (Integer) getIntent().getExtras().get(DESCRIPTION);
        GenerFilm list = GenerFilm.generList[desID];

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(list.getId());
        photo.setContentDescription(list.getName());

        TextView name = findViewById(R.id.name);
        name.setText(list.getName());

        TextView description = findViewById(R.id.description);
        description.setText(list.getDescription());
    }
}
