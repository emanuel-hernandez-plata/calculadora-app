package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.myfirstapp.adapter.ItemRecordAdapter;

import java.util.ArrayList;

public class RecordActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemRecordAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        ArrayList<String> list = getExtraList();
        initRecycleView(list);

    }

    private ArrayList<String> getExtraList() {
        Intent intent = getIntent();
        if (intent.hasExtra("list")) {
            ArrayList<String> listRecord = intent.getStringArrayListExtra("list");
            return listRecord;
        }
        return new ArrayList<>();
    }

    private void initRecycleView(ArrayList<String> extraList) {
        recyclerView = findViewById(R.id.menu_history);
        adapter = new ItemRecordAdapter(extraList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("holaaa");
        list.add("perro");
        list.add("hpptt");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        list.add("soy un ser humano");
        return list;
    }
}