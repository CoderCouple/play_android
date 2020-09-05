package com.matrix.play;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public BottomNavigationViewEx bottomNav;
    public ArrayList<String> colors = new ArrayList<>();
    public FloatingActionButton fab;
    public static int nmr = 1;
    public static final int dnr = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav = findViewById(R.id.bottom_nav_view);
        fab = (FloatingActionButton) findViewById(R.id.fabPlay);
        initBottomNavigationView();

        colors.add("#3cba54");
        colors.add("#f4c20d");
        colors.add("#db3236");
        colors.add("#4885ed");

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab.setBackgroundTintList(ColorStateList.valueOf(Color
                        .parseColor(colors.get(nmr%dnr))));
                nmr++;
            }
        });
    }

    private void initBottomNavigationView() {
        bottomNav.enableAnimation(false);
        bottomNav.enableItemShiftingMode(false);
        bottomNav.enableShiftingMode(false);
        fab.setBackgroundTintList(ColorStateList.valueOf(Color
                .parseColor("#BF0C34")));
    }




}