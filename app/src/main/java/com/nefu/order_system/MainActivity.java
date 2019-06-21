package com.nefu.order_system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.bt_1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userName.getText().toString();
                String password = passWord.getText().toString();
                if (username.equals("2016214403")&&password.equals("123456")) {
                    Toast.makeText(MainActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, TableActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "用户名或密码错误！", Toast.LENGTH_SHORT).show();
                }

            }
        });

        userName = findViewById(R.id.et_1);
        userName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("用户名："+userName.getText());
            }
        });

        passWord = findViewById(R.id.et_2);
        passWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("密码："+passWord.getText());
            }
        });

    }
}
