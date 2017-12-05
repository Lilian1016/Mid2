package com.fju.mid2;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.button;
import static com.fju.mid2.R.id.button2;

public class Func2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func2);
    }
    public void Func2(View view){
        EditText edButton = (EditText) findViewById(button2);
        getIntent().putExtra("FUNC_BUTTON",button2);
        setResult(RESULT_OK,getIntent());
        finish();

    }}
