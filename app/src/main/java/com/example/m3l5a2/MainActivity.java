package com.example.m3l5a2;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnOurButton;
    EditText txtNumberOne;
    EditText txtNumberTwo;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOurButton = (Button) findViewById(R.id.submit);
        txtNumberOne = (EditText) findViewById(R.id.num1);
        txtNumberTwo = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.Result);

        btnOurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNumberOne.length()>0 && txtNumberTwo.length()>0)
                {
                    int addedSum = Integer.parseInt(txtNumberOne.getText().toString()) +
                            Integer.parseInt(txtNumberTwo.getText().toString()) ;
                    result.setText("Added Sum = " + Integer.toString(addedSum));
                }
            }
        });
    }
}