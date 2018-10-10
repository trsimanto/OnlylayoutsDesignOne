package com.binarygeek.onlylayoutsone;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FoodFirstFragment extends Fragment {
    View view;
    private RecyclerView myrecyclerView;
    private List<ItemsDetails> lstContact;

    public FoodFirstFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_food_first, container, false);
        myrecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstContact=new ArrayList<>();
        lstContact.add(new ItemsDetails("Casa Pop","Cafe,Italian,Chinese","cost $300 for one","4.6",R.drawable.hotel2));
        lstContact.add(new ItemsDetails("Winston","Melrose Estate, Johannesburg","cost $500 for one","3.4",R.drawable.hotel3));
        lstContact.add(new ItemsDetails("Crown Towers ", "Perth, Australia","cost $700 for one","4.2",R.drawable.hotel4));
        lstContact.add(new ItemsDetails("Casa Pop","Cafe,Italian,Chinese","cost $300 for one","4.6",R.drawable.hotel2));
        lstContact.add(new ItemsDetails("Winston","Melrose Estate, Johannesburg","cost $500 for one","3.4",R.drawable.hotel3));
        lstContact.add(new ItemsDetails("Crown Towers ", "Perth, Australia","cost $700 for one","4.2",R.drawable.hotel4));
        lstContact.add(new ItemsDetails("Casa Pop","Cafe,Italian,Chinese","cost $300 for one","4.6",R.drawable.hotel2));
        lstContact.add(new ItemsDetails("Winston","Melrose Estate, Johannesburg","cost $500 for one","3.4",R.drawable.hotel3));
        lstContact.add(new ItemsDetails("Crown Towers ", "Perth, Australia","cost $700 for one","4.2",R.drawable.hotel4));
        lstContact.add(new ItemsDetails("Casa Pop","Cafe,Italian,Chinese","cost $300 for one","4.6",R.drawable.hotel2));
        lstContact.add(new ItemsDetails("Winston","Melrose Estate, Johannesburg","cost $500 for one","3.4",R.drawable.hotel3));
        lstContact.add(new ItemsDetails("Crown Towers ", "Perth, Australia","cost $700 for one","4.2",R.drawable.hotel4));
        lstContact.add(new ItemsDetails("Casa Pop","Cafe,Italian,Chinese","cost $300 for one","4.6",R.drawable.hotel2));
        lstContact.add(new ItemsDetails("Winston","Melrose Estate, Johannesburg","cost $500 for one","3.4",R.drawable.hotel3));
        lstContact.add(new ItemsDetails("Crown Towers ", "Perth, Australia","cost $700 for one","4.2",R.drawable.hotel4));
        lstContact.add(new ItemsDetails("Casa Pop","Cafe,Italian,Chinese","cost $300 for one","4.6",R.drawable.hotel2));
        lstContact.add(new ItemsDetails("Winston","Melrose Estate, Johannesburg","cost $500 for one","3.4",R.drawable.hotel3));
        lstContact.add(new ItemsDetails("Crown Towers ", "Perth, Australia","cost $700 for one","4.2",R.drawable.hotel4));
        }
}



