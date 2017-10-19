package com.example.cec.projectscorpio.branches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cec.projectscorpio.R;
import com.example.cec.projectscorpio.branches.civil.EighthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.FifthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.FourthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.SeventhSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.SixthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.ThirdSemCivilSubjectsListActivity;


public class CESemesterListActivity extends AppCompatActivity {

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
                    Intent intent = new Intent(CESemesterListActivity.this, ThirdSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 0);
                }
                if( i == 1 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, FourthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 1);
                }
                if( i == 2 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, FifthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 2);
                }
                if( i == 3 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, SixthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 3);
                }
                if( i == 4 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, SeventhSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 4);
                }
                if( i == 5 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, EighthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 5);
                }
            }
        });
    }
}
