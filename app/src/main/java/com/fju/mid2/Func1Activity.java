package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.button;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void Func1(View view){
        EditText edButton = (EditText) findViewById(R.id.button)
        getIntent().putExtra("FUNC_BUTTON",button);
        setResult(RESULT_OK,getIntent());
        finish();
    }
}