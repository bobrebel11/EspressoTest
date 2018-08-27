package com.example.rebelbob11.espressotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonD;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        buttonD = findViewById(R.id.buttonClick);
        textView = findViewById(R.id.textDisplay);
        editText = findViewById(R.id.enter_text);


        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredText;

                enteredText = editText.getText().toString();
                textView.setText(enteredText);

            }
        });
    }
}