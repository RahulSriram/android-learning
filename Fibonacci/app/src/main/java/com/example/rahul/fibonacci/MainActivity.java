package com.example.rahul.fibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int f=1;
    private static int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView fibo = (TextView) findViewById(R.id.fiboText);
                        int temp=f;
                        f+=x;
                        x=temp;
                        fibo.setText(Integer.toString(f));
                    }
                }
        );

        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView fibo = (TextView) findViewById(R.id.fiboText);
                        f=1;
                        x=0;
                        fibo.setText(Integer.toString(f));
                    }
                }
        );
    }
}