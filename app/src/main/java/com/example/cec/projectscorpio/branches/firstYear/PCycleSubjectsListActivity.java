package com.example.cec.projectscorpio.branches.firstYear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cec.projectscorpio.R;
import com.example.cec.projectscorpio.YoutubeActivity;


public class PCycleSubjectsListActivity extends AppCompatActivity {

    ListView subjectsView;

    ArrayAdapter subjectsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects_list);

        String[] subjectsList = getResources().getStringArray(R.array.p_cycle_subjects);

        subjectsView = (ListView) findViewById(R.id.subjects_list);

        subjectsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, subjectsList);

        subjectsView.setAdapter(subjectsAdapter);

        subjectsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PCycleSubjectsListActivity.this, YoutubeActivity.class);
                startActivity(intent);
            }
        });

    }
}
