package ml.vishalbhosle.collagesearch;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import layout.CollegeAdapter;

public class CollegeAreaActivity extends AppCompatActivity {

    private static String title;
    private static ArrayList<College> collegeList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_branch);

        Activity activity = this;
        activity.setTitle(title);

        CollegeAdapter listAdapter = new CollegeAdapter(this, collegeList);

        ListView list = (ListView) findViewById(R.id.collage_list);
        list.setAdapter(listAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), CollegeDetailActivity.class);
                College college = collegeList.get(position);
                //setting The collage Object
                CollegeDetailActivity.setCollege(college);
                startActivity(i);
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                College college = collegeList.get(position);
                i.setData(Uri.parse(college.getLocation()));
                startActivity(i);
                return true;
            }
        });

    }

    public static void setTitle(String title) {
        CollegeAreaActivity.title = title;
    }

    public static void setCollegeList(ArrayList<College> list) {
        CollegeAreaActivity.collegeList = list;
    }
}
