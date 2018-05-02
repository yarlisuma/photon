package com.mm.nycschools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mm.nycschools.adapter.SchoolAdapter;
import com.mm.nycschools.interfaces.OnItemClickListener;
import com.mm.nycschools.pojo.Schoolnfo;
import com.mm.nycschools.utils.IConstants;
import com.mm.nycschools.utils.MyUtils;

public class SchoolsListActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools_list);
        recyclerView=(RecyclerView)findViewById(R.id.rvSchoollist);
        loadSchoolList();

    }
    private void loadSchoolList() {
        SchoolAdapter schoolAdapter = new SchoolAdapter(SchoolsListActivity.this,
                MyUtils.getSchoolList(), new OnItemClickListener() {
            @Override
            public void onItemClick(Schoolnfo item) {
                Intent intent = new Intent(SchoolsListActivity.this, SchoolInfoActivity.class);
                intent.putExtra(IConstants.schoolDb, item.getSchoolDb());
                intent.putExtra(IConstants.schoolsatScore, item.getSchoolsatScore());
                startActivity(intent);

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(schoolAdapter);


    }
}
