package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        recyclerView.setAdapter(new NumbersRvAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        /*
        ListView list = (ListView) this.findViewById(R.id.recycleview);
        list.setAdapter(new ResultAdapter(this, generate(10000)));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), i+"", Toast.LENGTH_LONG).show();
            }
        });
    }

    static public int[] generate(int n){
        int[] digitals = new int[n];
        for (int i = 0; i < n; i++) {
            digitals[i] = i;
        }
        return digitals;
    }

         */
    }
}