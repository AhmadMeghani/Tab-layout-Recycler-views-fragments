package com.abcx.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.abcx.myapplication.ui.main.SectionsPagerAdapter0;

import java.util.ArrayList;
import java.util.List;

public class action_frag extends Fragment {

    public RecyclerView.Adapter recyclerViewAdapter;



    public List<listItem> listItems;
    public int tab_position,tab_position1=0;
    public RecyclerView recyclerView;
    private String[] abc = {"0Thor","John Wick","The Avengers","The Raid","Taken","Hitman","Avatar","Star Trek","Die Hard","300"};
    private String[] abc1 = {"1The Hangover","Bridesmaides","Superbad","Hot Fuzz","Antman","Joker","Shazam","IronMan","CapA","Daredevil"};
    private String[] abc2 = {"2Captain Marvel","Robin Hood","Jungle Book","Jurassic Park","Star Wars","Joker","The Hobbit","Star Trek","Peter Pan","King Kong"};
    private String[] abc3 = {"3Captain Marvel","Robin Hood","Jungle Book","Jurassic Park","Star Wars","Joker","The Hobbit","Star Trek","Peter Pan","King Kong"};


    private String[] xyz = {"0The God of Thunder","Savior of Dogs","World's Mightiest Heroes","IDK about this","this neither","a guy who kills a lot?","now #2 best movie","copy of SW","dude movie","all hail Zack SNyder"};
    private String[] xyz1 = {"Those guys never learn","some funny movie?","shouldn't it be DAD?","Pffft really?","marvel comedy lol","sadistic comedy?","Shazam LMAO","that's not FUNNY","Seriously?!","I hate netflix"};
    private String[] xyz2 = {"Blah blah feminist","husband of evil queen?!","Mowgliee?","best movie EVER?!","Old is gold?","upcoming DC shizz","omg the best","HODOR","Where's tinker bell tho?!","HAHAHAHA"};
    private String[] xyz3 = {"Blah blah feminist","husband of evil queen?!","Mowgliee?","best movie EVER?!","Old is gold?","upcoming DC shizz","omg the best","HODOR","Where's tinker bell tho?!","HAHAHAHA"};

    TabLayout tabs;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.action_frag_layout, container, false);
        tabs = getActivity().findViewById(R.id.tabs);
        tab_position1=tabs.getSelectedTabPosition();
        TabLayout tabs1 = root.findViewById(R.id.tabs1);
        //tab_position1=tabs.getSelectedTabPosition();

        recyclerView = root.findViewById(R.id.recyclerView);
        //setRecyclerView(recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));



        listItems = new ArrayList<>();
            for (int i = 0; i < 10; i++){
                listItem listItem = new listItem(abc[i],xyz[i]);
                listItems.add(listItem);
            }
        recyclerViewAdapter = new Adapter(listItems, getActivity());
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(recyclerViewAdapter);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab_position = tab.getPosition();

                listItems = new ArrayList<>();
                switch (tab_position){

                    case 0:
                        Toast.makeText(getActivity(), "Tab  " + tab_position, Toast.LENGTH_SHORT).show();
                        //listItems.clear();

                        for (int i = 0; i < 10; i++){
                            listItem listItem = new listItem(abc[i],xyz[i]);
                            listItems.add(listItem);
                        }


                        break;
                    case 1:
                        Toast.makeText(getActivity(), "Tab  " + tab_position, Toast.LENGTH_SHORT).show();
                        //listItems.clear();
                        for (int i = 0; i < 10; i++) {
                            listItem listItem = new listItem(abc1[i],xyz1[i]);
                            listItems.add(listItem);
                        }

                        break;
                    case 2:
                        Toast.makeText(getActivity(), "Tab  " + tab_position, Toast.LENGTH_SHORT).show();
                        //listItems.clear();
                        for (int i = 0; i < 10; i++) {
                            listItem listItem = new listItem(abc2[i],xyz2[i]);
                            listItems.add(listItem);
                        }

                        break;
                    case 3:
                        Toast.makeText(getActivity(), "Tab  " + tab_position, Toast.LENGTH_SHORT).show();
                        //listItems.clear();
                        for (int i = 0; i < 10; i++) {
                            listItem listItem = new listItem(abc3[i],xyz3[i]);
                            listItems.add(listItem);
                        }



                }
                recyclerViewAdapter = new Adapter(listItems, getActivity());
                new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);
                recyclerView.setAdapter(recyclerViewAdapter);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



       /* if (tab_position==0){
            for (int i = 0; i < 10; i++){
                listItem listItem = new listItem(abc[i]);
                listItems.add(listItem);
            }
        } else if (tab_position==1){
            for (int i = 0; i < 10; i++){
                listItem listItem = new listItem(abc1[i]);
                listItems.add(listItem);
            }
        }
        else if(tab_position==2){
            for (int i = 0; i < 10; i++){
                listItem listItem = new listItem(abc2[i]);
                listItems.add(listItem);
            }

        }
        else if(tab_position==3){
            for (int i = 0; i < 10; i++){
                listItem listItem = new listItem(abc3[i]);
                listItems.add(listItem);
            }
        }*/




        return root;// = inflater.inflate(R.layout.action_frag_layout,container,false);
    }



    public void setRecyclerView(RecyclerView recyclerView){


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
