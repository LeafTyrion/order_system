package com.nefu.order_system;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Button button01 = findViewById(R.id.bt_table01);
        Button button03 = findViewById(R.id.bt_table03);


        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog1();
            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog2();
            }


        });
    }

    protected void openDialog1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(TableActivity.this);
        builder.setTitle("1号桌可用");
        builder.setMessage("是否确认开台？");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(TableActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(TableActivity.this, "取消成功", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    protected void openDialog2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(TableActivity.this);
        builder.setTitle("3号桌不可用");
        builder.setMessage("请重新选择");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(TableActivity.this, "请重新选择", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
}
