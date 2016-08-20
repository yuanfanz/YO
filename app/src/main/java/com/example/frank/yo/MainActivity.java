package com.example.frank.yo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);

        final EditText editText = (EditText) findViewById(R.id.name);

        final Button btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                btn1.startAnimation(animation);
                Toast.makeText(MainActivity.this, "Hello, " + editText.getText() + "!" + " " +  btn1.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                btn2.startAnimation(animation);
                Toast.makeText(MainActivity.this, editText.getText() + "! Let's play a game!" + " " + btn2.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                btn3.startAnimation(animation);
                Toast.makeText(MainActivity.this, "How about counting stars?" + " " + btn3.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                btn4.startAnimation(animation);
                Toast.makeText(MainActivity.this, "I know it's boring. Please don't turn me off." + " " + btn4.getText() + btn4.getText() + btn4.getText() + btn4.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
