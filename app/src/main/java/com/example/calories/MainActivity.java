package com.example.calories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText t1;
    private EditText t2;
    private EditText t3;
    private EditText t4;
    private Button ButtonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t1 = (EditText)findViewById(R.id.editTextTextfoodName1);
        EditText t2 = (EditText)findViewById(R.id.editTextTextfoodName2);
        EditText t3 = (EditText)findViewById(R.id.editTextTextfoodName3);
        EditText t4 = (EditText)findViewById(R.id.editTextTextfoodName4);
        TextView result = (TextView)findViewById(R.id.result);
        Button ButtonCalculate = (Button)findViewById(R.id.button2);

        ButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().length()==0){
                    t1.setText("0");
                }
                if(t2.getText().toString().length()==0){
                    t2.setText("0");
                }
                if(t3.getText().toString().length()==0){
                    t3.setText("0");
                }
                if(t4.getText().toString().length()==0){
                    t4.setText("0");
                }
                int x = Integer.parseInt(t1.getText().toString());
                int y = Integer.parseInt(t2.getText().toString());
                int a = Integer.parseInt(t3.getText().toString());
                int b = Integer.parseInt(t4.getText().toString());

                int z = 900*x + 580*y + 450*a + 600*b;
                result.setText(z + "calories");


            }
        });





    }
}