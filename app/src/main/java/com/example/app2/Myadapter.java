package com.example.app2;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Myadapter job is to put data into each row of the listView
 */
public class Myadapter extends RecyclerView.Adapter<Myadapter.wordViewHolder> {
    String[] languages;
    public Myadapter(String[] languagesData) {
        languages=languagesData;
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
        return null;
    }

    /**
     * on BindViewHolder job is to write data on the planks
     * @param holder
     * @param position
     */

    @Override
    public void onBindViewHolder(@NonNull Myadapter.wordViewHolder holder, int position) {

    }

    /**
     * job is to keep the count of number of data items in the dataset
     * @return
     */

    @Override
    public int getItemCount() {
        return 0;
    }

    /**
     * wordViewHolder job is to hold the recycled stack and new stock of wooden planks
     */

    public class wordViewHolder extends RecyclerView.ViewHolder {

        public wordViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
