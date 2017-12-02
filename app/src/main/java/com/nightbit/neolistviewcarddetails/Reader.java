package com.nightbit.neolistviewcarddetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Reader extends AppCompatActivity {

    TextView fname, lname, subject, song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        subject = findViewById(R.id.subject);
        song = findViewById(R.id.song);

        Intent receiver = getIntent();
        String sfname = receiver.getStringExtra("fname");
        String slname = receiver.getStringExtra("lname");
        String ssubject = receiver.getStringExtra("subject");
        String ssong = receiver.getStringExtra("song");

        fname.setText(sfname);
        lname.setText(slname);
        subject.setText(ssubject);
        song.setText(ssong);


    }
}
