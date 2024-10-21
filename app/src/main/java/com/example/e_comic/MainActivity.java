package com.example.e_comic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 TextView linktextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linktextview=(TextView)findViewById(R.id.link_reg);
        linktextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,regist.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void gomenu(View view) {startActivity(new Intent(this, beranda.class));
    }
}