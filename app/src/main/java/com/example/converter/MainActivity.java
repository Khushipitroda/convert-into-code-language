package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText w,l,h;
    Button ans;
    double h_c,w_c,l_c,answer;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans = (Button)findViewById(R.id.ans);
        w = (EditText)findViewById(R.id.w);
        h = (EditText)findViewById(R.id.h);
        l = (EditText)findViewById(R.id.l);
        result = (TextView) findViewById(R.id.answer);
        ans.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                h_c = Double.parseDouble(h.getText().toString());
                w_c = Double.parseDouble(w.getText().toString());
                l_c = Double.parseDouble(l.getText().toString());
                // add both number and store it to sum
                answer = (h_c*w_c*l_c)/1728;
                // set it ot result textview
                result.setText(Double.toString(answer));
            }
        });
    }

}