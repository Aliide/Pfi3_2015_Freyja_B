package com.example.freyjabjornsdottir.assignment4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by freyjabjornsdottir on 23/04/15.
 */
public class MyAdapter extends ArrayAdapter<Planet> {
    ArrayList<Planet> planetList;
    Context c;

    public MyAdapter(Context context, ArrayList<Planet> planetList) {
        super(context, 0, planetList);
        this.planetList = planetList;
        this.c = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("MyListAdapter", "Called for position: " + position);
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listitem,null);
        Planet b = planetList.get(position);
        TextView tv = (TextView) convertView.findViewById(R.id.listName);
        ImageView iv = (ImageView) convertView.findViewById(R.id.listImage);
        tv.setText(b.getName());
        iv.setImageDrawable(b.getImage());




        return convertView;
    }
}