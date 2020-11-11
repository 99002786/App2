package com.example.app2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Myadapter job is to put data into each row of the listView
 */
public class Myadapter extends RecyclerView.Adapter<Myadapter.wordViewHolder> {
    String[] languages;
    LayoutInflater layoutInflater;
    public Myadapter(Context context,String[] languagesData) {
        languages=languagesData;
        layoutInflater = LayoutInflater.from(context);
    }

    /**
     * onCreateViewHolder job is to buy wooden planks
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public Myadapter.wordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowView=layoutInflater.inflate(R.layout.row_listview,parent,false);
        return new wordViewHolder(rowView);
    }

    /**
     * on BindViewHolder job is to write data on the planks
     * @param holder
     * @param position
     */

    @Override
    public void onBindViewHolder(@NonNull Myadapter.wordViewHolder holder, int position) {
        holder.titleTextView.setText(languages[position]);
    }

    /**
     * job is to keep the count of number of data items in the dataset
     * @return
     */

    @Override
    public int getItemCount() {
        return languages.length;
    }

    /**
     * wordViewHolder job is to hold the recycled stack and new stock of wooden planks
     */

    public class wordViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public wordViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.textViewRow);
        }
    }
}
