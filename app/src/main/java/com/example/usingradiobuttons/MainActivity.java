package com.example.usingradiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton RBCampus;
    RadioGroup RGCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RGCampus = (RadioGroup) findViewById(R.id.RGRB);

       }

    public void onclickbuttonMethod(View view) {
        int RGBselectedId = RGCampus.getCheckedRadioButtonId();
        
        RBCampus = (RadioButton) findViewById(RGBselectedId);
        
        
        if(RGBselectedId==-1){
            Toast.makeText(MainActivity.this,"No Campus is selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,RBCampus.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}