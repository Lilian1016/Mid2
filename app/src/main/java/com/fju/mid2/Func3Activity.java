package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.fju.mid2.MainActivity.FUNC_BUTTON;
import static com.fju.mid2.R.id.button3;

public class Func3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNC_BUTTON){
            if (resultCode == RESULT_OK){

            }
        }
    }

    public void Func3(View view) {
        EditText edButton = (EditText) findViewById(button3);
        getIntent().putExtra("FUNC_BUTTON", button3);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}