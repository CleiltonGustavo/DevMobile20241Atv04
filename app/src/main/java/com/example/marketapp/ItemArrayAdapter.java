package com.example.marketapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder> {
    private int listItemLayout;

    private ArrayList<Item> itemList;

    public ItemArrayAdapter(int layoutId, ArrayList<Item> itemList) {
        listItemLayout = layoutId;
        this.itemList = itemList;
    }

    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    public void onBindViewHolder(final ViewHolder holder, final int listPosition) {
        TextView item = holder.item;
        item.setText(itemList.get(listPosition).getName());
    }



    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView item;
        public int position;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            item = (TextView) itemView.findViewById(R.id.tv_list_item);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            position = getAdapterPosition();
            if (position == 0){
                imageView.setBackgroundResource(R.drawable.fruits);
            }
        }

        public void onClick(View view) {

            Toast.makeText(view.getContext(), "" + item.getText(), Toast.LENGTH_SHORT).show();
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + item.getText());
        }


    }


}
