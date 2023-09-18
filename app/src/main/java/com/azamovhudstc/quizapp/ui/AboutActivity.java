package com.azamovhudstc.quizapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toolbar;

import com.azamovhudstc.quizapp.R;

public class AboutActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;
    CardView youtube,instagram,facebook,telegram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initView();
        toolbar.setNavigationOnClickListener(v->{
            onBackPressed();
        });
        youtube.setOnClickListener(v->{
            String url = "https://www.youtube.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        instagram.setOnClickListener(v->{
            String url = "https://www.instagram.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        facebook.setOnClickListener(v->{
            String url = "https://www.facebook.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        telegram.setOnClickListener(v->{
            String url = "https://t.me/+D4wBUu10UZk4Nzdl";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }
    private void initView(){
        toolbar=findViewById(R.id.toolbar2);
        youtube=findViewById(R.id.youtube);
        instagram=findViewById(R.id.instagram);
        facebook=findViewById(R.id.facebook);
        telegram=findViewById(R.id.cardView3);
    }
}