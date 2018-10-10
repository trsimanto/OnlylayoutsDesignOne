package com.binarygeek.onlylayoutsone;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<ItemsDetails> mData;
    public RecyclerViewAdapter(Context mcontext, List<ItemsDetails> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view=LayoutInflater.from(mcontext).inflate(R.layout.items,parent,false);
        final MyViewHolder viewHolder =new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.hotel_name.setText(mData.get(position).getHotel_name());
        holder.hotel_plase.setText(mData.get(position).getHotel_plase());
        holder.hotel_cost.setText(mData.get(position).getHotel_cost());
        holder.hotel_rating.setText(mData.get(position).getHotel_rating());
        holder.img.setImageResource(mData.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return mData.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView hotel_name;
        private TextView hotel_plase;
        private TextView hotel_cost;
        private TextView hotel_rating;
        private ImageView img;

        public MyViewHolder(View itemView) {

            super(itemView);
            hotel_name=(TextView) itemView.findViewById(R.id.item_hotel_name);
            hotel_plase=(TextView) itemView.findViewById(R.id.item_hotel_place);
            hotel_cost=(TextView) itemView.findViewById(R.id.item_hotel_cost);
            hotel_rating=(TextView) itemView.findViewById(R.id.item_hotel_rating);
            img=(ImageView) itemView.findViewById(R.id.item_hotel_image);


        }
    }
}
