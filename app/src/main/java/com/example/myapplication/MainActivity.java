package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        String url="https://firebasestorage.googleapis.com/v0/b/my-application-1a9d9.appspot.com/o/i.webp?alt=media&token=3aa060be-aceb-4b04-b54a-72993e5b424b";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}