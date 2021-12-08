package com.example.a20173002_khm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;

    ImageView imageView;
    ImageView imageView2;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.menuBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.loginBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
    }
    public void onButtonClicked(View v) {
        changeImage();
    }
    public void changeImage() {
        if (imageIndex == 0) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex = 1;
        } else if (imageIndex == 1) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex = 0;
        }
    }

    public void OnClickedSiteBtn(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kofic.or.kr/kofic/business/main/main.do"));
        startActivity(myIntent);
    }


    public void OnClickedCallBtn(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 051-720-4700"));
        startActivity(myIntent);
    }
}