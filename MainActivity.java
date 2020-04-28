package com.app.info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button B1,B2,B3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
    }

    public void addListenerOnButton() {

        B1 = (Button) findViewById(R.id.button);

        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, Act2.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton1() {

        B2 = (Button) findViewById(R.id.button1);

        B2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, Act3.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton2() {

        B3 = (Button) findViewById(R.id.button2);

        B3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, Act4.class);
                startActivity(intent);

            }

        });

    }

}