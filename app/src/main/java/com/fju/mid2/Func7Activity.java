package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.button;
import static com.fju.mid2.R.id.button7;

public class Func7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func7);
    }
    public void Func7(View view){
        EditText edButton = (EditText) findViewById(button7);
        getIntent().putExtra("FUNC_BUTTON",button7);
        setResult(RESULT_OK,getIntent());
        finish();
}}
