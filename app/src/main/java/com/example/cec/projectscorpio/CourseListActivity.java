package com.example.cec.projectscorpio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        courseList.add(getString(R.string.PCycle));
        courseList.add(getString(R.string.CCycle));
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
                if ( i == 0 ) {
                    Intent intent = new Intent(CourseListActivity.this, PCycleSubjectsListActivity.class);
                    startActivityForResult(intent,0);
                }
                if ( i == 1 ) {
                    Intent intent = new Intent(CourseListActivity.this, CCycleSubjectsListActivity.class);
                    startActivity(intent);
                }
                if ( i == 2 ) {
                    Intent intent = new Intent(CourseListActivity.this, CSESemesterListActivity.class);
                    startActivity(intent);
                }
                if ( i == 3 ) {
                    Intent intent = new Intent(CourseListActivity.this, CESemesterListActivity.class);
                    startActivity(intent);
                }
                if ( i == 4 ) {
                    Intent intent = new Intent(CourseListActivity.this, ECSemesterListActivity.class);
                    startActivity(intent);
                }
                if ( i == 5 ) {
                    Intent intent = new Intent(CourseListActivity.this, MESemesterListActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
