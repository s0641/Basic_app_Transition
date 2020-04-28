package com.app.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Act2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] Quotes =
            {
                    "The purpose of our lives is to be happy.",
                    "Life is what happens when you’re busy making other plans.",
                    "Get busy living or get busy dying.",
                    "You only live once, but if you do it right, once is enough.",
                    "Many of life’s failures are people who did not realize how close they were to success when they gave up.",
                    "If life were predictable it would cease to be life, and be without flavor.",
                    "The whole secret of a successful life is to find out what is one’s destiny to do, and then do it.",
                    "In order to write about life first you must live it.",
                    "The big lesson in life, baby, is never be scared of anyone or anything.",
                    "Curiosity about life in all of its aspects, I think, is still the secret of great creative people.",
                    "Life is not a problem to be solved, but a reality to be experienced.",
                    "The unexamined life is not worth living.",
                    "Turn your wounds into wisdom.",
                    "The way I see it, if you want the rainbow, you gotta put up with the rain.",
            };

    ListView listView;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        listView =(ListView) findViewById(R.id.listView1);
        tv1=(TextView) findViewById(R.id.textView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,
                android.R.layout.simple_list_item_1,Quotes);
        //.simple_spinner_item
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        tv1.setText(Quotes[position] );
    }

}
