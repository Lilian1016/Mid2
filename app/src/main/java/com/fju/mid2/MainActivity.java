package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
      public  static final int FUNC_BUTTON = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,Func1Activity.class);
        Intent intent2 = new Intent(this,Func2Activity.class);
        Intent intent3 = new Intent(this,Func3Activity.class);
        Intent intent4 = new Intent(this,Func4Activity.class);
        Intent intent5 = new Intent(this,Func5Activity.class);
        Intent intent6 = new Intent(this,Func6Activity.class);
        Intent intent7 = new Intent(this,Func7Activity.class);
        Intent intent8 = new Intent(this,Func8Activity.class);
        startActivityForResult(intent,FUNC_BUTTON);
        startActivityForResult(intent2,FUNC_BUTTON);
        startActivityForResult(intent3,FUNC_BUTTON);
        startActivityForResult(intent4,FUNC_BUTTON);
        startActivityForResult(intent5,FUNC_BUTTON);
        startActivityForResult(intent6,FUNC_BUTTON);
        startActivityForResult(intent7,FUNC_BUTTON);
        startActivityForResult(intent8,FUNC_BUTTON);
    }
}
