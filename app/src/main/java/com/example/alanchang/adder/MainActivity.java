package com.example.alanchang.adder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.firstNumEditTex);
                EditText secondNumEditTest = findViewById(R.id.secondNumEditText);
                TextView resultText = findViewById(R.id.resultTextView);
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditTest.getText().toString());
                int result = num1 + num2;
                resultText.setText(result+"");
            }
        });
    }
}
