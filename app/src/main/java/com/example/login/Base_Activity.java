package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Base_Activity extends AppCompatActivity {

    SharedPref sharedpref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedpref = new SharedPref(this);
        if(sharedpref.loadNightModeState()==true) {
            setTheme(R.style.darktheme);
        }
        else  setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.note_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.note_note)
        {
            Toast.makeText(this, "Share menu is Clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Activity_Note.class));

        }
        else if(id==R.id.note_user)
        {
            Toast.makeText(this, "Attach menu is Clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Activity_users.class));


        }
        else if(id==R.id.note_progr)
        {
            Toast.makeText(this, "Attach menu is Clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Activity_progress.class));


        }
        return super.onOptionsItemSelected(item);
    }
}