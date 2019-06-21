package com.nefu.order_system;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nefu.order_system.adapter.PayAdapter;
import com.nefu.order_system.entity.Pay;

import java.util.ArrayList;
import java.util.List;

public class PayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
private PayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        recyclerView = findViewById(R.id.rv_grid);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        adapter=new PayAdapter(payList(),PayActivity.this);
        recyclerView.setAdapter(adapter);
    }
    private List<Pay> payList(){
        Pay f1=new Pay("宫保鸡丁","1","20元/份","已上");
        Pay f2=new Pay("油闷大虾","2","60元/份","催菜");
        Pay f3=new Pay("清蒸鲍鱼","1","99元/份","已上");
        Pay f4=new Pay("红烧猪肉","3","50元/份","已上");
        Pay f5=new Pay("水晶燕窝","2","90元/份","催菜");
        List<Pay> payList=new ArrayList<>();
        payList.add(f1);payList.add(f2);payList.add(f3);payList.add(f4);payList.add(f5);
        return payList;
    }
}
