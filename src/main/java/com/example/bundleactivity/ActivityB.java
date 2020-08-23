package com.example.bundleactivity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
//import android.support.v4.app.*;
import android.media.Image;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ActivityB extends AppCompatActivity {
   ViewPager view;
   private DrawerLayout drawer;

    CardView cardview1,cardview2;
   ImageView imageview1,imageview2;
   GridLayout gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE); //Call to hide the title bar
        //getSupportActionBar().hide();
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_b);
      //  view=(ViewPager)findViewById(R.id.imageSlider);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        ImageSlider slider=(ImageSlider)findViewById(R.id.imageSlider);
        gridview=(GridLayout)findViewById(R.id.gridview);
        cardview1=(CardView)findViewById(R.id.cardview1);
        cardview2=(CardView)findViewById(R.id.cardview2);
        imageview1=(ImageView)findViewById(R.id.imageview1);
        imageview2=(ImageView)findViewById(R.id.imageView2);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.p,"image1"));
        slideModels.add(new SlideModel(R.drawable.pr,"image2"));
        slideModels.add(new SlideModel(R.drawable.pro,"image3"));

        slider.setImageList(slideModels,true);
    //    b1=(Button)findViewById(R.id.appform);
    //    b2=(Button)findViewById(R.id.Details);
       // ImageAdapter ob=new ImageAdapter(this);
     //  view.setAdapter(ob);

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityB.this,ActivityC.class);
                startActivity(intent);
            }
        });

        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(ActivityB.this,ActivityD.class);
                startActivity(intent1);
            }
        });
    }

    public void onBackPressed()
    {
        if(drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }



}
