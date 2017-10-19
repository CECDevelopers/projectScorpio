package com.example.cec.projectscorpio.branches.electronicsAndCommunications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cec.projectscorpio.R;
import com.example.cec.projectscorpio.YoutubeActivity;

import java.util.ArrayList;



public class FifthSemECSubjectsListActivity extends AppCompatActivity {

    ListView subjectsView;

    ArrayList<String> subjectsList = new ArrayList<String>();

    ArrayAdapter subjectsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects_list);

        subjectsList.add("Subject 1");
        subjectsList.add("Subject 2");
        subjectsList.add("Subject 3");
        subjectsList.add("Subject 4");
        subjectsList.add("Subject 5");
        subjectsList.add("Subject 6");

        subjectsView = (ListView) findViewById(R.id.subjects_list);

        subjectsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, subjectsList);

        subjectsView.setAdapter(subjectsAdapter);

        subjectsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FifthSemECSubjectsListActivity.this, YoutubeActivity.class);
                startActivity(intent);
            }
        });

    }
}
