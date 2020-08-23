package com.example.bundleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.jar.Attributes;

public class ActivityC extends AppCompatActivity {
    EditText cName, cAge, cWeight, cHeight;
   RadioButton genderButton;
    String CName,CuAge,CuWeight, CuHeight;
    Integer Age;
    Float Weight, Height;
    Button submit;
    Float BMI;
    Float inch;
    Float BMR;
    Float BFP;
    Float LM;
    Float FFW,SFat,Water,VFat,SMuscle,BMass,Protein,Mage;
    RadioGroup rd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //Call to hide the title bar
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_c);
        cName = (EditText) findViewById(R.id.cName);
        cAge = (EditText) findViewById(R.id.cAge);
        cWeight = (EditText) findViewById(R.id.cWeight);
        cHeight = (EditText) findViewById(R.id.cHeight);
        rd1=(RadioGroup)findViewById(R.id.radioGroup);
      //  radioMale=(RadioButton) findViewById(R.id.radioMale);
        //radioFemale=(RadioButton) findViewById(R.id.radioFemale);
        submit = (Button) findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view1) {
                int SelectId= rd1.getCheckedRadioButtonId();
                genderButton=(RadioButton) findViewById(SelectId);
                final String value =
                        genderButton
                                .getText().toString();
                CName = cName.getText().toString();

                CuAge = cAge.getText().toString();
                Age = Integer.parseInt(CuAge);
                CuWeight = cWeight.getText().toString();
                Weight = Float.parseFloat(CuWeight);
                CuHeight = cHeight.getText().toString();
                Height = Float.parseFloat(CuHeight);
               if(value.equals("Male")&&  CName != null && Age != null && Height != null && Weight !=null) {
                   inch = 10000.0f / (2.54f * 2.54f);
                   BMI = (Weight * inch) / (Height * Height);
                   BFP = (1.51f * BMI) - (0.70f * Age) - (3.6f * 1f) + 1.4f;
                   LM = (0.40f * Weight) + (0.267f * (Height * 2.54f)) - 19.2f;
                   FFW = Weight * (1 - (BFP / 100));
                   SFat =
                    Water = 2.447f - (0.09156f * Age) + (0.1074f * (Height * 2.54f)) + (0.3362f * Weight);
                   BMR = (10f * Weight) + (6.25f * 2.54f * Height) - (5f * Age) - 161;
                    Mage= 66.5f+(13.5f * Weight) + (5.003f * Height * 2.54f) - (6.775f * Age);
                   Intent Cob = new Intent(ActivityC.this, ActivityE.class);
                   Toast.makeText(getApplicationContext(),"Male occur",Toast.LENGTH_LONG).show();
                   Cob.putExtra("CName", CName);
                   Cob.putExtra("Age", Age);
                   Cob.putExtra("Gender",value);
                   Cob.putExtra("Weight", Weight);
                   Cob.putExtra("Height", Height);
                   Cob.putExtra("BMI", BMI);
                   Cob.putExtra("Water", Water);
                   Cob.putExtra("BMR",BMR);
                   Cob.putExtra("BFP",BFP);
                   Cob.putExtra("LM",LM);
                   Cob.putExtra("FFW",FFW);
                   Cob.putExtra("Metabolic Age",Mage);
                   startActivity(Cob);
               }
               else if(value.equals("Female")&&  CName != null && Age != null && Height != null && Weight !=null)
               {
                   inch = 10000.0f / (2.54f * 2.54f);
                   BMI = (Weight * inch) / (Height * Height);
                   BFP = (1.51f * BMI) - (0.70f * Age) - (3.6f * 1f) + 1.4f;
                   LM = (0.40f * Weight) + (0.267f * (Height * 2.54f)) - 19.2f;
                   FFW = Weight * (1 - (BFP / 100));
                   SFat =
                   Water = 2.447f - (0.09156f * Age) + (0.1074f * (Height * 2.54f)) + (0.3362f * Weight);
                   BMR = (10f * Weight) + (6.25f * 2.54f * Height) - (5f * Age);
                   Toast.makeText(getApplicationContext(),"Female occur",Toast.LENGTH_LONG).show();
                   Intent Cob = new Intent(ActivityC.this, ActivityE.class);
                   Cob.putExtra("CName", CName);
                   Cob.putExtra("Age", Age);
                   Cob.putExtra("Gender",value);
                   Cob.putExtra("Weight", Weight);
                   Cob.putExtra("Height", Height);
                   Cob.putExtra("BMI", BMI);
                   Cob.putExtra("BMR",BMR);
                   Cob.putExtra("Water", Water);
                   Cob.putExtra("BFP",BFP);
                   Cob.putExtra("LM",LM);
                   Cob.putExtra("FFW",FFW);
                   Cob.putExtra("Metabolic Age",Mage);
                   startActivity(Cob);

               }

                 else {
                    Toast.makeText(getBaseContext(), "Please fill all the entry", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
