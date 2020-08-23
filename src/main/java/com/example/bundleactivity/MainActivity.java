package com.example.bundleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//import android.util.Log;

public class MainActivity extends AppCompatActivity{
    EditText urname,urphone;
    Button clk;
    //String msg1="Android:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //Call to hide the title bar
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
       // Log.d(String.valueOf(msg1),"The onCreate() event");
        urname=(EditText) findViewById(R.id.name);
        urphone=(EditText) findViewById(R.id.phoneno);
        clk=(Button) findViewById(R.id.login);

    }
    public void movepage(View v)
    {
        String stname=urname.getText().toString();
        String stphone=urphone.getText().toString();
        if(stname.equals("Manav") && stphone.equals("7906813498"))
        {
            Intent in = new Intent(MainActivity.this,ActivityB.class);
            startActivity(in);
        }
        else if(stname.equals("")||stphone.equals(""))
        {
            Toast.makeText(getBaseContext(),"Enter the Name and phone no.",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(getBaseContext(),"Wrong Name and Mobile no. Please try Again",Toast.LENGTH_SHORT).show();
        }

    }
    /*protected void onStart()
    {
        super.onStart();
        Log.d(String.valueOf(msg1),"The onStart() event");


    }*/
}
