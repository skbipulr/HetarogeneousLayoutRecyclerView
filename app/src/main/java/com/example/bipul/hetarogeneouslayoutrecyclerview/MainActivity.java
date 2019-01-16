package com.example.bipul.hetarogeneouslayoutrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private  ObjectAdapter objectAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Car(R.drawable.car,"Totoyta Colrla","ToYOTA"));
        objects.add(new Movie("Monpura","Action"));
        objects.add(new Car(R.drawable.car," Colrla","ToYOTA"));
        objects.add(new Movie("Monpura2","Action"));
        objects.add(new Car(R.drawable.car,"Totoyta Colrla","ToYOTA"));
        objects.add(new Movie("Monpura3","Action"));
        objects.add(new Car(R.drawable.car,"Totoyta Colrla","ToYOTA"));
        objects.add(new Movie("Monpura4","Action"));

        objectAdapter = new ObjectAdapter(this,objects);
       LinearLayoutManager manger = new LinearLayoutManager(this);
        manger.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manger);
        mRecyclerView.setAdapter(objectAdapter);
    }
}
