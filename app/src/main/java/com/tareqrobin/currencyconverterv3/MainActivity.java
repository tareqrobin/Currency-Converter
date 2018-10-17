package com.tareqrobin.currencyconverterv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton radioButton1, radioButton2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.et);
        radioButton1=(RadioButton)findViewById(R.id.rb1);
        radioButton2=(RadioButton)findViewById(R.id.rb2);
        textView=(TextView)findViewById(R.id.tv);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x=Float.parseFloat(editText.getText().toString());
                float result =x/85;
                textView.setText(Float.toString(result));
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x=Float.parseFloat(editText.getText().toString());
                float result =x*85;
                textView.setText(Float.toString(result));
            }
        });
    }
}
