package com.col.commo.caiquan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int num = (int) (Math.random()*3);

                switch (num){
                    case 0:
                        imageView.setImageResource(R.mipmap.shitou);
                        textView.setText("石头");
                        break;
                    case 1:
                        imageView.setImageResource(R.mipmap.jiandao);
                        textView.setText("剪刀");
                        break;
                    case 2:
                        imageView.setImageResource(R.mipmap.bu);
                        textView.setText("布");
                        break;
                }
            }
        });

    }
}
