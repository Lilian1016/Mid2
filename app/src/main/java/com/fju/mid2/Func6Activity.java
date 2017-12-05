package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.button;
import static com.fju.mid2.R.id.button6;

public class Func6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func6);
    }
    public void Func6(View view){
        EditText edButton = (EditText) findViewById(button6);
        getIntent().putExtra("FUNC_BUTTON",button6);
        setResult(RESULT_OK,getIntent());
        finish();
}}
