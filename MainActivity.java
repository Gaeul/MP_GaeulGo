package com.example.gaeul.mpexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Minimum(View v){
        MyMinimum myMinimum = new MyMinimum();
        Toast.makeText(this, "Minimum is " + myMinimum.getResult() ,Toast.LENGTH_LONG).show();
    }

    public void Average(View v){
        MyAverage myAverage = new MyAverage();
        Toast.makeText(this, "Average is " + myAverage.getResult() ,Toast.LENGTH_LONG).show();
    }

}
