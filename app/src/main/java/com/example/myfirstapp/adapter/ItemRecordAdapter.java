package com.example.myfirstapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstapp.R;

import java.util.List;

public class ItemRecordAdapter extends RecyclerView.Adapter<ItemRecordAdapter.ItemRecordViewHolder> {

    final private List<String> listRecord;

    public ItemRecordAdapter(List<String> listRecord) {
        this.listRecord = listRecord;
    }

    @NonNull
    @Override
    public ItemRecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.record_item, parent, false);
        return new ItemRecordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemRecordViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return listRecord.size();
    }

    public class ItemRecordViewHolder extends RecyclerView.ViewHolder {
        TextView textRecord;

        public ItemRecordViewHolder(View itemView) {
            super(itemView);
            textRecord = itemView.findViewById(R.id.textRecord);

        }

        void bind(int position) {
            textRecord.setText(listRecord.get(position));
        }
    }
}

