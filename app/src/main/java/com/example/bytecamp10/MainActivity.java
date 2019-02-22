package com.example.bytecamp10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void victimtologin(View view) {
        Intent intent=new Intent(this,Main2ActivityLogin.class);
        startActivity(intent);
    }

    public void policelogin(View view) {
        Intent intent=new Intent(this,Main2ActivityLogin.class);
        startActivity(intent);

    }
}
