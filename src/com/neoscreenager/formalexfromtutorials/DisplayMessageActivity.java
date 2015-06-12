package com.neoscreenager.formalexfromtutorials;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by neo on 6/13/15.
 */
public class DisplayMessageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_message);
        Intent inent = getIntent();
        String message = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        //setting the text view as the activity layout
        setContentView(textView);

    }
}