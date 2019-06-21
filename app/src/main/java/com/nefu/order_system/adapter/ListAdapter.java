package com.nefu.order_system.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nefu.order_system.DetailActivity;
import com.nefu.order_system.R;
import com.nefu.order_system.entity.Foods;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    private static final String TAG = "ListAdapter";
    private List<Foods> foods;
    private Context context;

    public ListAdapter(List<Foods> foods,Context context) {
        this.foods = foods;
        this.context=context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG, "onCreateViewHolder");
        // 每一个item对象
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        // 由VM持有
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Log.i(TAG, "onBindViewHolder: " + position + "/" + foods.get(position).name);
        holder.name.setText(foods.get(position).name);
        holder.detail.setText(foods.get(position).detail);
        holder.price.setText(foods.get(position).price);
        // 模拟图片
        holder.pic.setImageResource(R.mipmap.ic_launcher);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView detail;
        TextView price;
        ImageView pic;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.food_name);
            detail=itemView.findViewById(R.id.food_detail);
            price=itemView.findViewById(R.id.food_price);
            pic = itemView.findViewById(R.id.news_pic);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(View view, int position, Foods foods);
    }
}
