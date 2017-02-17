package com.example.lijie.mykitchen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.majiajie.pagerbottomtabstrip.PagerBottomTabLayout;

public class MainActivity extends AppCompatActivity {

    private PagerBottomTabLayout pbTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbTabLayout = (PagerBottomTabLayout) findViewById(R.id.pbTabLayout);
        pbTabLayout.builder()
                .addTabItem(R.drawable.kitchen,"厨房")
                .addTabItem(R.drawable.takeaway,"外卖")
                .addTabItem(R.drawable.mine,"我的")
                .setDefaultColor(Color.rgb(0xB2,0xD7,0xD2))
                .build().setBackgroundColor(Color.rgb(0,79,0x6B));


    }
}
