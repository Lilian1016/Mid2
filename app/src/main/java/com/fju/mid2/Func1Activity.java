package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

import static android.R.attr.button;

public class Func1Activity extends AppCompatActivity {
    Random x = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void roll(View view){
        int n = x.nextInt(6)+1;
        new AlertDialog.Builder(this)
                .setMessage(n+"")
                .show();
    }

}
