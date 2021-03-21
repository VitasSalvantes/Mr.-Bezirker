package com.vitassalvantes.mrbezirker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Activity that displays sections of the description of the previously selected district
 *
 * @author VitasSalvantes
 * @version 1.0
 */
public class DistrictDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_description);

        final AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DistrictDescription.this, SectionOfDescription.class);
                intent.putExtra(SectionOfDescription.EXTRA_SECTION, position);
                intent.putExtra(SectionOfDescription.EXTRA_DISTRICT, getIntent().getIntExtra(SectionOfDescription.EXTRA_DISTRICT, 0));
                startActivity(intent);
            }
        };

        final ListView lv = (ListView) findViewById(R.id.sections);
        lv.setOnItemClickListener(itemClickListener);
    }
}