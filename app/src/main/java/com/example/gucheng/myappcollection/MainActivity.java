package com.example.gucheng.myappcollection;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();

        Button button = (Button) findViewById(R.id.app_zero);
        Button button1 = (Button) findViewById(R.id.app_one);
        Button button2 = (Button) findViewById(R.id.app_two);
        Button button3 = (Button) findViewById(R.id.app_three);
        Button button4 = (Button) findViewById(R.id.app_four);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.app_zero:
                        Toast toast = Toast.makeText(context, R.string.app_zero,Toast.LENGTH_SHORT);
                        toast.show();
                        break;
                    case R.id.app_one:
                        Toast toast1 = Toast.makeText(context, R.string.app_one,Toast.LENGTH_SHORT);
                        toast1.show();
                        break;
                    case R.id.app_two:
                        Toast toast2 = Toast.makeText(context, R.string.app_two,Toast.LENGTH_SHORT);
                        toast2.show();
                        break;
                    case R.id.app_three:
                        Toast toast3 = Toast.makeText(context, R.string.app_three,Toast.LENGTH_SHORT);
                        toast3.show();
                        break;
                    case R.id.app_four:
                        Toast toast4 = Toast.makeText(context, R.string.app_four,Toast.LENGTH_SHORT);
                        toast4.show();
                        break;
                }
            }
        };

        button.setOnClickListener(clickListener);
        button1.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);
    }
}
