package com.example.reversestringproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView tv;
    EditText et;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv);
        et=findViewById(R.id.et);
        b1=findViewById(R.id.btn);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=et.getText().toString();

                StringBuffer sb=new StringBuffer(msg);
                msg=sb.reverse().toString();

                Toast.makeText(getApplicationContext(),"REVERSE = "+msg,Toast.LENGTH_LONG).show();
            }
        });
    }
}
