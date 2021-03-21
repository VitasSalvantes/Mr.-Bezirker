package com.vitassalvantes.mrbezirker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Activity that displays detailed information about a previously selected district on a previously selected topic (section)
 *
 * @author VitasSalvantes
 * @version 1.0
 */
public class SectionOfDescription extends AppCompatActivity {
    /**
     * String for transferring the numbers of the selected section (from 0 to 3) through the intent
     */
    public static final String EXTRA_SECTION = "Number of section";

    /**
     * String for transferring the numbers of the selected district (from 0 to 6) through the intent
     */
    public static final String EXTRA_DISTRICT = "Number of district";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_of_description);

        ImageView image = (ImageView) findViewById(R.id.photo);
        TextView text = (TextView) findViewById(R.id.mainContent);

        Intent intent = getIntent();
        int section = intent.getIntExtra(EXTRA_SECTION, 0);
        int district = intent.getIntExtra(EXTRA_DISTRICT, 0);

        text.setText(getString(Bezirk.bezirke[district].getContent(section)));
        image.setImageResource(Bezirk.bezirke[district].getImageResourceId());
        image.setContentDescription(getString(Bezirk.bezirke[district].getName()));
    }
}