package com.example.cec.projectscorpio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 007 on 10/8/2017.
 */

public class CourseListActivity extends AppCompatActivity {

    ListView courseView;

    ArrayList<String> courseList = new ArrayList<String>();

    ArrayAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cec_courses_list);

        courseList.add(getString(R.string.CS));
        courseList.add(getString(R.string.CE));
        courseList.add(getString(R.string.EC));
        courseList.add(getString(R.string.ME));

        courseView = (ListView) findViewById(R.id.list);

        courseAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, courseList);

        courseView.setAdapter(courseAdapter);

        courseView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CourseListActivity.this, SemesterListActivity.class);
                startActivity(intent);
            }
        });

    }
}
