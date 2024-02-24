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

        ArrayList<RecordModel> list = getExtraList();
        initRecycleView(list);

    }

    private ArrayList<RecordModel> getExtraList() {
        Intent intent = getIntent();
        if (intent.hasExtra("bundle")) {
            Bundle bundle = intent.getBundleExtra("bundle");
            if (bundle != null && bundle.containsKey("list")) {
                return bundle.getParcelableArrayList("list");
            }
        }
        return new ArrayList<>();
    }

    private void initRecycleView(ArrayList<RecordModel> extraList) {
        recyclerView = findViewById(R.id.menu_history);
        adapter = new ItemRecordAdapter(extraList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


}