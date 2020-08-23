package com.example.bundleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.ScrollView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ActivityE extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //Call to hide the title bar
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_e);
        Intent Cob=getIntent();
        String CName=Cob.getStringExtra("CName");
        Integer Age=Cob.getIntExtra("Age",0);
        Float Weight=Cob.getFloatExtra("Weight",0);
        Float Height=Cob.getFloatExtra("Height",0);
        Float BMI=Cob.getFloatExtra("BMI",0);
        Float BMR=Cob.getFloatExtra("BMR",0);
        Float BFP=Cob.getFloatExtra("BFP",0);
        Float LM=Cob.getFloatExtra("LM",0);
        Float FFW=Cob.getFloatExtra("FFW",0);
        String Gender=Cob.getStringExtra("Gender");
        Float Water=Cob.getFloatExtra("Water",0);
        Float Mage=Cob.getFloatExtra("Metabolic Age",0);

        TextView textView1=(TextView)findViewById(R.id.textView1);
        TextView textView2=(TextView)findViewById(R.id.textView2);
        TextView textView3=(TextView)findViewById(R.id.textView3);
        TextView textView4=(TextView)findViewById(R.id.textView4);
        TextView textView5=(TextView)findViewById(R.id.textView5);
        TextView textView6=(TextView)findViewById(R.id.textView6);
        TextView textView7=(TextView)findViewById(R.id.textView7);
        TextView textView8=(TextView)findViewById(R.id.textView8);
        TextView textView9=(TextView)findViewById(R.id.textView9);
        TextView textView10=(TextView)findViewById(R.id.textView10);
        TextView textView11=(TextView)findViewById(R.id.textView11);
        TextView textView12=(TextView)findViewById(R.id.textView12);
       /* TextView textView13=(TextView)findViewById(R.id.textView13);
        TextView textView14=(TextView)findViewById(R.id.textView14);
        TextView textView15=(TextView)findViewById(R.id.textView15);
        TextView textView16=(TextView)findViewById(R.id.textView16);*/
        TextView textView17=(TextView)findViewById(R.id.textView17);

        textView1.setText("Name :-" +"  "+CName);
        textView2.setText("Age :-" +"   "+Age);
        textView3.setText("Gender :-"+"   "+Gender);
        textView4.setText("Weight :-"+"   "+Weight);
        textView5.setText("Height :-"+"   "+Height);
        textView6.setText("BMI :-"+"    "+BMI);

        textView7.setText("Body Fat :-"+"   "+BFP);
        textView8.setText("Lean Mass :-"+"   "+LM);
        textView9.setText("F.F Weight :-"+"   "+FFW);
        textView10.setText("Water :-"+"   "+Water);
        textView11.setText("Metabolic Age :-"+"   "+Mage);
        textView12.setText("BMR :-"+"   "+BMR);

    }
}
