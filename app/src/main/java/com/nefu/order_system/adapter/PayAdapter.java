package com.nefu.order_system.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nefu.order_system.R;
import com.nefu.order_system.entity.Pay;

import java.util.List;

public class PayAdapter extends RecyclerView.Adapter<PayAdapter.MyViewHolder> {
    private List<Pay> payList;
    private Context context;
    public PayAdapter(List<Pay> payList,Context context){
        this.payList=payList;
        this.context=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_pay,parent,false);

        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.name.setText(payList.get(position).name);
        holder.num.setText(payList.get(position).num);
        holder.price.setText(payList.get(position).price);
        holder.status.setText(payList.get(position).status);
    }

    @Override
    public int getItemCount() {
        return payList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView num;
        TextView price;
        Button status;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            name=itemView.findViewById(R.id.name);
            num=itemView.findViewById(R.id.num);
            price=itemView.findViewById(R.id.price);
            status= itemView.findViewById(R.id.status);
        }
    }

}
