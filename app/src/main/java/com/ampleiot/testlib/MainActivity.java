package com.ampleiot.testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Model> list;
    Model model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        adapter.setData(populateData());
    }
    private List<Model> populateData(){
        list = new ArrayList<>();

        model = new Model();
        model.setName("Lotus");
        list.add(model);

        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);

        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);
        model = new Model();
        model.setName("Lotus");
        list.add(model);

        return list;
    }
}
