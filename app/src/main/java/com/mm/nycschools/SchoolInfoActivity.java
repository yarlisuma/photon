package com.mm.nycschools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mm.nycschools.utils.IConstants;

public class SchoolInfoActivity extends AppCompatActivity {
    TextView textViewDb,textViewScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_info);
        textViewDb=(TextView)findViewById(R.id.textViewschoolDb);
        textViewScore=(TextView)findViewById(R.id.textViewsatScore);

        Intent intent=getIntent();
        textViewDb.setText("DB : \n"+intent.getStringExtra(IConstants.schoolDb));
        textViewScore.setText("SAT Score(Math,Reading,Writing) : \n "+intent.getStringExtra(IConstants.schoolsatScore));
    }

}
