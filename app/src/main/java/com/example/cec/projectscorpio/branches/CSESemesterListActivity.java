package com.example.cec.projectscorpio.branches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cec.projectscorpio.R;
import com.example.cec.projectscorpio.branches.computerScience.EighthSemCSSubjectsListActivity;
import com.example.cec.projectscorpio.branches.computerScience.FifthSemCSSubjectsListActivity;
import com.example.cec.projectscorpio.branches.computerScience.FourthSemCSSubjectsListActivity;
import com.example.cec.projectscorpio.branches.computerScience.SeventhSemCSSubjectsListActivity;
import com.example.cec.projectscorpio.branches.computerScience.SixthSemCSSubjectsListActivity;
import com.example.cec.projectscorpio.branches.computerScience.ThirdSemCSSubjectsListActivity;



public class CSESemesterListActivity extends AppCompatActivity {

    ListView semesterView;

    ArrayAdapter semesterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester_list);

        String[] semesterList = getResources().getStringArray(R.array.semesters);

        semesterView = (ListView) findViewById(R.id.semester_list);

        semesterAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, semesterList);

        semesterView.setAdapter(semesterAdapter);

        semesterView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if( i == 0 ) {
                    Intent intent = new Intent(CSESemesterListActivity.this, ThirdSemCSSubjectsListActivity.class);
                    startActivityForResult(intent, 0);
                }
                if( i == 1 ) {
                    Intent intent = new Intent(CSESemesterListActivity.this, FourthSemCSSubjectsListActivity.class);
                    startActivityForResult(intent, 1);
                }
                if( i == 2 ) {
                    Intent intent = new Intent(CSESemesterListActivity.this, FifthSemCSSubjectsListActivity.class);
                    startActivityForResult(intent, 2);
                }
                if( i == 3 ) {
                    Intent intent = new Intent(CSESemesterListActivity.this, SixthSemCSSubjectsListActivity.class);
                    startActivityForResult(intent, 3);
                }
                if( i == 4 ) {
                    Intent intent = new Intent(CSESemesterListActivity.this, SeventhSemCSSubjectsListActivity.class);
                    startActivityForResult(intent, 4);
                }
                if( i == 5 ) {
                    Intent intent = new Intent(CSESemesterListActivity.this, EighthSemCSSubjectsListActivity.class);
                    startActivityForResult(intent, 5);
                }

            }
        });
    }
}
