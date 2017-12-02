package com.nightbit.neolistviewcarddetails;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PeopleAdapter extends ArrayAdapter<People>{

    public PeopleAdapter(Activity context, ArrayList<People> people) {
        super(context, 0, people);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card, parent, false);
        }

        People currentPeople = getItem(position);

        TextView fname = (TextView) listItemView.findViewById(R.id.fname);
        fname.setText(currentPeople.getmFirstname());

        TextView lname = (TextView) listItemView.findViewById(R.id.lname);
        lname.setText(currentPeople.getmLastname());


        TextView txtsubject = (TextView) listItemView.findViewById(R.id.txtsubject);
        txtsubject.setText(currentPeople.getmSubject());



        return listItemView;
    }

}
