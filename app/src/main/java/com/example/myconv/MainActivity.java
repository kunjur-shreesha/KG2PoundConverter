package com.example.myconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText box;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        box = findViewById(R.id.editTextTextPersonName);
        Toast.makeText(this, "Made By ComradeXBeast❤", Toast.LENGTH_LONG).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s =box.getText().toString();
                if(s.isEmpty())
                    Toast.makeText(MainActivity.this, "Please Enter the kg value", Toast.LENGTH_SHORT).show();
                else
                {
                    int x = Integer.parseInt(s);
                    double val = x*2.20462;
                    textView.setText("The corresponding value in pounds is : " + val);
                }
            }
        });
    }
}