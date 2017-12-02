package com.nightbit.neolistviewcarddetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mListView;
    ArrayList<People> mArrayList;
    PeopleAdapter mPeopleAdapter;
    People mPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listview);

        mArrayList =  new ArrayList<People>();
        mArrayList.add(new People("Joe", "Bob","Subject 1", "This is my Story"));
        mArrayList.add(new People("Riddle", "Cage","Subject 2", "I am for you Alone"));
        mArrayList.add(new People("Yard", "Junk","Subject 3", "Go where you want to go pleae"));
        mArrayList.add(new People("Grid", "Labe;","Subject 4", "Just Sleep at your own time"));
        mArrayList.add(new People("Crap", "Cannon","Subject 5", "We are where we are because you are not good"));
        mArrayList.add(new People("Foam", "Grean","Subject 6", "Leave them where they are for now"));
        mArrayList.add(new People("Jade", "Day","Subject 7", "Today is another day, Just Enjoy"));
        mArrayList.add(new People("Bow", "Angle","Subject 8", "Leave your life the way you want it"));
        mArrayList.add(new People("Gray", "Stone","Subject 9", "You are the Son of your father"));
        mArrayList.add(new People("Brown", "Gold","Subject 10", "Guess who you are> Goat"));
        mArrayList.add(new People("Mark", "David","Subject 11", "Keep Junping am with you guys"));


        mPeopleAdapter = new PeopleAdapter(this, mArrayList);
        mListView.setAdapter(mPeopleAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
//                Intent b = new Intent(MainActivity.this, Reader.class);
//                    b.putExtra("fname", mPeople.getmFirstname());
//                    b.putExtra("lname", mPeople.getmLastname());
//                    b.putExtra("subject", mPeople.getmSubject());
//                    b.putExtra("song", mPeople.getmSong());
//                startActivity(b);
            }
        });
    }
}
