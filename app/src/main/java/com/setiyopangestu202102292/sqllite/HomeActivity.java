package com.setiyopangestu202102292.sqllite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.denzcoskun.imageslider.constants.ScaleTypes;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private ImageSlider imageSlider;

    Button btnmaha, btnbuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageSlider = findViewById(R.id.imageSlider);
        btnmaha = findViewById(R.id.btnMahasiswa);
        btnbuku = findViewById(R.id.btndatabuku);

        btnmaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MahasiswaActivity.class);
                startActivity(intent);
            }
        });

        btnbuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BukuActivity.class);
                startActivity(intent);
            }
        });


        imageSlider = findViewById(R.id.imageSlider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.slide1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide4, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}