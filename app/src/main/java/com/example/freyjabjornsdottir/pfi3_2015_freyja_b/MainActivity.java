package com.example.freyjabjornsdottir.pfi3_2015_freyja_b;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onStart() {
        super.onStart(); // k
        Log.i("Start","The app starts");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop","The app stops");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy","Destroyed");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("Resume","The app is resumed");
    }

    Random rand = new Random();
    int i =0;

    public void onClick(View v){

        Log.i("MyApp", "Button pressed");
        TextView t1 = (TextView) findViewById(R.id.textView2);

        t1.setText(null);


        String[] Q = getResources().getStringArray(R.array.quotes);

        i=rand.nextInt(Q.length);

        t1.setText(Q[i]);



    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] quotes = getResources().getStringArray(R.array.quotes);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
