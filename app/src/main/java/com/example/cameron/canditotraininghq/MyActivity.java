package com.example.cameron.canditotraininghq;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.net.Uri;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void progression(View v){
       Intent i = new Intent(this,Progress.class);
            startActivity(i);
    }

    public void myProgram(View v){
        Intent i = new Intent(this,Program.class);
            startActivity(i);
    }

    public void createProgram(View v){
        Intent i = new Intent(this,CreateProgram.class);
        startActivity(i);
    }

    public void youtube(View v){
        String url = "https://www.youtube.com/user/CanditoTrainingHQ";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

    public void FAQ (View v){
        Intent i = new Intent(this,FAQ.class);
        startActivity(i);
    }
}
