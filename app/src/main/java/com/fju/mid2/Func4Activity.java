package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.fju.mid2.R.id.button4;

public class Func4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func4);
    }
    public void Func4(View view){
        EditText edButton = (EditText) findViewById(button4);
        getIntent().putExtra("FUNC_BUTTON",button4);
        setResult(RESULT_OK,getIntent());
        finish();
}}
