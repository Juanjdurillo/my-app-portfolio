package com.example.juanjo.example;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PortfolioApp extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void showToast(View view) {
        int id = view.getId();
        String text = "This button will launch ";
        switch (id)
        {
            case R.id.spotifyLauncher:
                text+="my Spotify streamer app";
                break;
            case R.id.ScoresLauncher:
                text+="my Scores app";
                break;
            case R.id.libraryLauncher:
                text+="my Library app";
                break;
            case R.id.buildItLauncher:
                text+="my Build It Bigger app";
                break;
            case R.id.xyzLauncher:
                text+="my XYZ Reader app";
                break;
            case R.id.myownLauncher:
                text+="my Own app";
                break;
        }

        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }
}
