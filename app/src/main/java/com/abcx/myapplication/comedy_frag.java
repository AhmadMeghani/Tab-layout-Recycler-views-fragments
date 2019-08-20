package com.abcx.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class comedy_frag extends Fragment {

    public RecyclerView.Adapter recyclerViewAdapter;


    public List<listItem> listItems;
    private String[] abc = {"3The Hangover","Bridesmaides","Superbad","Hot Fuzz","Antman","Joker","Shazam","IronMan","CapA","Daredevil"};
    private String[] xyz3 = {"Blah blah feminist","husband of evil queen?!","Mowgliee?","best movie EVER?!","Old is gold?","upcoming DC shizz","omg the best","HODOR","Where's tinker bell tho?!","HAHAHAHA"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.comedy_frag_layout, container, false);


        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        setRecyclerView(recyclerView);
        return root;// = inflater.inflate(R.layout.comedy_frag_layout,container,false);
    }

    public void setRecyclerView(RecyclerView recyclerView){

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        listItems = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            listItem listItem = new listItem(abc[i],xyz3[i]);
            listItems.add(listItem);
        }

        recyclerViewAdapter = new Adapter(listItems, getActivity());
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.UP| ItemTouchHelper.DOWN) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

            listItems.remove(viewHolder.getAdapterPosition());
            recyclerViewAdapter.notifyDataSetChanged();
        }
    };
}
