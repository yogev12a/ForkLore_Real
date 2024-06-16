package com.example.forklore_real;

import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;

public class PageMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page_main);
        ImageButton buttonB = findViewById(R.id.imageButton2);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BatteryManager bm = (BatteryManager) getApplicationContext().getSystemService(Context.BATTERY_SERVICE);
                int batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
                Toast.makeText(PageMain.this, "You Have " + batLevel + "%", Toast.LENGTH_LONG).show();


            }
        });
    }
    public void OnToast (View view) {
        Intent t1=new Intent(this,Toast.class);
        startActivity(t1);
    }

    public void OnBorgol (View view) {
        Intent t1=new Intent(this,Borgol.class);
        startActivity(t1);
    }
    public void OnSandwich (View view) {
        Intent t1=new Intent(this,PannuzoSandwich.class);
        startActivity(t1);
    }
    public void OnPasta(View view) {
        Intent t1=new Intent(this,Pasta.class);
        startActivity(t1);
    }
    public void OnFalafel (View view) {
        Intent t1=new Intent(this,Falafel.class);
        startActivity(t1);
    }
    public void OnPancakes(View view) {
        Intent t1=new Intent(this,AmericanPancakes.class);
        startActivity(t1);
    }


}

