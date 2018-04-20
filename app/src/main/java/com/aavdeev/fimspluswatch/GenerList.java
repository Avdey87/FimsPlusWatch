package com.aavdeev.fimspluswatch;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GenerList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ArrayAdapter<GenerFilm> list = new ArrayAdapter<GenerFilm>(this,
                android.R.layout.simple_list_item_1, GenerFilm.generList);

        ListView listView = getListView();
        listView.setAdapter(list);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(GenerList.this, Description.class);
        intent.putExtra(Description.DESCRIPTION, (int) id);
        startActivity(intent);
    }
}
