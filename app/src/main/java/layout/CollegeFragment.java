package layout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import ml.vishalbhosle.collagesearch.College;
import ml.vishalbhosle.collagesearch.CollegeAreaActivity;
import ml.vishalbhosle.collagesearch.CollegeCollection;
import ml.vishalbhosle.collagesearch.CollegeDetailActivity;
import ml.vishalbhosle.collagesearch.R;

public class CollegeFragment extends Fragment {

    private CollegeCollection collegeCollection;

    public CollegeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_collage, container, false);

        collegeCollection = new CollegeCollection();
        ArrayList<College> collegeList = collegeCollection.getCollegeList();

        CollegeAdapter listAdapter = new CollegeAdapter(getContext(), collegeList);

        ListView list = (ListView) rootView.findViewById(R.id.collage_list);
        list.setAdapter(listAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getContext(), CollegeDetailActivity.class);
                College college = collegeCollection.getCollageAt(position);
                //setting The collage Object
                CollegeDetailActivity.setCollege(college);

                startActivity(i);
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                College college = collegeCollection.getCollageAt(position);
                i.setData(Uri.parse(college.getLocation()));
                startActivity(i);
                return true;
            }
        });

        return rootView;
    }
}
