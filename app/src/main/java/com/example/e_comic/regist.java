package com.example.e_comic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class regist extends AppCompatActivity {
    TextView linktextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        linktextview=(TextView)findViewById(R.id.link);
        linktextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(regist.this,MainActivity.class);
                startActivity(intent);

                Toast.makeText(regist.this, "login", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void sucsreg(View view) {
        startActivity(new Intent(this, congra.class));
    }
}