package com.app.info;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {

    TextView text,vers;

    public TextFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_text, container, false);

        text= (TextView) view.findViewById(R.id.AndroidOs);
        vers= (TextView)view.findViewById(R.id.Version);

        return view;
    }

    public void change(String txt, String txt1){
        text.setText(txt);
        vers.setText(txt1);
    }

}
