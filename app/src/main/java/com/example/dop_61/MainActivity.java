package com.example.dop_61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private EditText et_email,et_password;
    private Button btn_sign;
    private LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);
        btn_sign=findViewById(R.id.btn_sign_in);
        container=findViewById(R.id.container);

    }

}