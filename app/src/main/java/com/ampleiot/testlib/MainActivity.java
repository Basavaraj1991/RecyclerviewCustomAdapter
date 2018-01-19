package com.ampleiot.testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Callback{

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
        //Item click callback to Activity/Fragment
        //adapter = new Adapter(this,this);

        //Normal
        adapter = new Adapter(this);
        //adapter.addData(your list here);
        //adapter.addElement(T);
        //adapter.clear();//remove all items
        //adapter.removeItemAt(0);
        //recyclerView.setHasFixedSize(true);
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

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, "on item click"+ position, Toast.LENGTH_SHORT).show();
    }
}
