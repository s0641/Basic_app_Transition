package com.app.info;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MenuFragment extends ListFragment {
    String[] COVID = new String[] { "Things we have to do in order to be safe","Things we don't have to do" };
    String[] Pre = new String[]{"1) wash your hands properly \n \n  2)wear mask when you go out \n \n  3)maintain social distancing \n \n  4)While coming in home do sanitize yourself \n \n","1)Don't touch the person \n \n 2)Do not stand in crowd\n \n"};

    public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_menu, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, COVID);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        TextFragment txt = (TextFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(COVID[position],"Precautions\n: "+Pre[position]);

        getListView().setSelector(android.R.color.holo_blue_dark);

    }
}
