package com.example.cec.projectscorpio.branches;

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



public class ECSemesterListActivity extends AppCompatActivity {

    ListView semesterView;

    ArrayList<String> semesterList = new ArrayList<String>();

    ArrayAdapter semesterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester_list);

        semesterList.add(getString(R.string.Third));
        semesterList.add(getString(R.string.Fourth));
        semesterList.add(getString(R.string.Fifth));
        semesterList.add(getString(R.string.Sixth));
        semesterList.add(getString(R.string.Seventh));
        semesterList.add(getString(R.string.Eighth));

        semesterView = (ListView) findViewById(R.id.semester_list);

        semesterAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, semesterList);

        semesterView.setAdapter(semesterAdapter);

        semesterView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if( i == 0 ) {
                    Intent intent = new Intent(ECSemesterListActivity.this, YoutubeActivity.class);
                    startActivityForResult(intent, 0);
                }

            }
        });
    }
}
