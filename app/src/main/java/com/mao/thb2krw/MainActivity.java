package com.mao.thb2krw;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText I1,I2;
    private Button bt;
    private ImageView image1;
    private String KRW2;
    private double THB,KRW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I1 = findViewById(R.id.edit1);
        I2 = findViewById(R.id.edit2);
    }

    public void exchange(View view) {
        THB = Double.parseDouble(I1.getText().toString());
        KRW = (THB*33.96);
        KRW2 = Double.toString(KRW);
        I2.setText(KRW2);
    }
}

