package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.button;
import static com.fju.mid2.R.id.button8;

public class Func8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func8);
    }
    public void Func8(View view){
        EditText edButton = (EditText) findViewById(button8);
        getIntent().putExtra("FUNC_BUTTON",button8);
        setResult(RESULT_OK,getIntent());
        finish();
}}