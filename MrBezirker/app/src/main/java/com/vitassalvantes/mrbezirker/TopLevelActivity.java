package com.vitassalvantes.mrbezirker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Activity that displays all the districts of Hamburg
 *
 * @author VitasSalvantes
 * @version 1.0
 */
public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_level_activity);

        final AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                Intent intent = new Intent(TopLevelActivity.this, DistrictDescription.class);
                intent.putExtra(SectionOfDescription.EXTRA_DISTRICT, position);
                startActivity(intent);
            }
        };
        final ListView lv = (ListView) findViewById(R.id.list_of_districts);
        lv.setOnItemClickListener(itemClickListener);
    }
}