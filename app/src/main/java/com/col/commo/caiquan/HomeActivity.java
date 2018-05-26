package com.col.commo.caiquan;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by commo on 2017/3/10.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(HomeActivity.this,MainActivity.class);
        startActivity(intent);

    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
    }
}
