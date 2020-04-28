package com.app.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Act3 extends AppCompatActivity{

    static final String[] music = new String[] {
            "Party on my mind", "kal ho na ho", "Despacito", "havana", "Locked Away",
            "Tamma", "Raske qamar", "closer", "Intensions", "Starboy",
            "graveyard", "Let it be me", "blank space", "criminal", "Only the young",
            "Play", "shameless", "liar", "Saas", "Till the world ends",
            "so am i", "lonely", "lily", "ignite", "darkside", "dilbar"};

    GridView gridView;
    TextView Tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);

        gridView = (GridView) findViewById(R.id.gridView1);
        Tv1=findViewById(R.id.textView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, music);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Tv1.setText(music[position]);

            }
        });
    }
}
