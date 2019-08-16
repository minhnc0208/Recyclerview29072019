package com.example.recyclerview29072019;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
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
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(monanAdapter);

    }
}
