package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumbersRvAdapter extends RecyclerView.Adapter<NumbersRvAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(position+1+"");
    }

    @Override
    public int getItemCount() {
        return 10000;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ViewHolder(View view){
            super(view);
            this.textView = view.findViewById(android.R.id.text1);
        }
    }
}
