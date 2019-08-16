package com.example.recyclerview29072019;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements HandleClick {
    RecyclerView recyclerView;
    ArrayList<Monan> monans;
    MonanAdapter monanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        monans = new ArrayList<>();
        monans.add(new Monan("Cá Kho", 35000, R.drawable.cakho));
        monans.add(new Monan("Cá Kho", 35000, R.drawable.cakho));
        monans.add(new Monan("Cá Kho", 35000, R.drawable.cakho));
        monans.add(new Monan("Cá Kho", 35000, R.drawable.cakho));
        monans.add(new Monan("Cá Kho", 35000, R.drawable.cakho));
        monanAdapter = new MonanAdapter(monans);
        monanAdapter.listen(new HandleClick() {
            @Override
            public void onClick(View v, int position) {
                if (position >= 0)
                    Log.d("BBB", position + "");
                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View v1, int position1) {
                if (position1 >= 0) {
                    Log.d("BBB", "Bạn đã click vào dòng " + position1);
                    Toast.makeText(MainActivity.this, "Bạn đã click vào dòng " + position1, Toast.LENGTH_SHORT).show();
                }
            }
        });


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(monanAdapter);
        recyclerView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }

    @Override
    public void onClick(View v, int position) {
        Log.d("BBB", position + "");
    }

    @Override
    public void onLongClick(View v1, int position1) {
        Log.d("BBB", "Bạn đã click vào dòng " + position1);
    }
}
