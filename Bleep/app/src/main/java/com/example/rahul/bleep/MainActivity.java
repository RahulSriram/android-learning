package com.example.rahul.bleep;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private static RelativeLayout relativeLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        Button bleepButton = (Button) findViewById(R.id.bleepButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);


        bleepButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int rValue = (int) (Math.random()*255);
                        int gValue = (int) (Math.random()*255);
                        int bValue = (int) (Math.random()*255);

                        String rHex = Integer.toHexString(0x100 | rValue).substring(1);
                        String gHex = Integer.toHexString(0x100 | gValue).substring(1);
                        String bHex = Integer.toHexString(0x100 | bValue).substring(1);
                        relativeLayout.setBackgroundColor(Color.parseColor("#" + rHex + gHex + bHex));
                    }
                }
        );

        resetButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                }
        );
    }
}
