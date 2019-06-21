package com.nefu.order_system;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nefu.order_system.adapter.ListAdapter;
import com.nefu.order_system.entity.Foods;

import java.util.ArrayList;
import java.util.List;
public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView=findViewById(R.id.re_01);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(ListActivity.this, LinearLayoutManager.VERTICAL));
        adapter=new ListAdapter(listFoods(),ListActivity.this);
        recyclerView.setAdapter(adapter);


    }
    private List<Foods> listFoods(){
        Foods f1=new Foods(1,"宫保鸡丁","好吃不贵","20元/份");
        Foods f2=new Foods(2,"油闷大虾","好吃又贵","60元/份");
        Foods f3=new Foods(3,"清蒸鲍鱼","难吃不贵","300元/份");
        Foods f4=new Foods(4,"红烧猪肉","难吃又贵","50元/份");
        Foods f5=new Foods(5,"水晶燕窝","好吃不贵","100元/份");
        List<Foods> foods=new ArrayList<>();
        foods.add(f1);foods.add(f2);foods.add(f3);foods.add(f4);foods.add(f5);
        return foods;
    }
}
