package layout;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import ml.vishalbhosle.collagesearch.College;
import ml.vishalbhosle.collagesearch.CollegeAreaActivity;
import ml.vishalbhosle.collagesearch.CollegeBranchActivity;
import ml.vishalbhosle.collagesearch.CollegeCollection;
import ml.vishalbhosle.collagesearch.CollegeDetailActivity;
import ml.vishalbhosle.collagesearch.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    private EditText dteCode;
    private ImageButton dteCodeButton;
    private EditText collegeName;
    private ImageButton collegeNameButton;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);

        ImageButton com = (ImageButton) rootView.findViewById(R.id.com);
        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeBranchActivity.class);
                CollegeBranchActivity.setTitle("Computer");
                startActivity(i);
            }
        });

        ImageButton it = (ImageButton) rootView.findViewById(R.id.it);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeBranchActivity.class);
                CollegeBranchActivity.setTitle("IT");
                startActivity(i);
            }
        });

        ImageButton civil = (ImageButton) rootView.findViewById(R.id.civil);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeBranchActivity.class);
                CollegeBranchActivity.setTitle("Civil");
                startActivity(i);
            }
        });

        ImageButton mech = (ImageButton) rootView.findViewById(R.id.mech);
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeBranchActivity.class);
                CollegeBranchActivity.setTitle("Mechanical");
                startActivity(i);
            }
        });

        ImageButton extc = (ImageButton) rootView.findViewById(R.id.extc);
        extc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeBranchActivity.class);
                CollegeBranchActivity.setTitle("Electronics");
                startActivity(i);
            }
        });

        dteCode = (EditText) rootView.findViewById(R.id.dte_code);

        dteCodeButton = (ImageButton) rootView.findViewById(R.id.dte_code_btn);
        dteCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int code = Integer.parseInt(dteCode.getText().toString());
                College college = CollegeCollection.getCollegeByDteCode(code);
                if(college != null) {
                    Intent i = new Intent(getContext(), CollegeDetailActivity.class);
                    //setting The collage Object
                    CollegeDetailActivity.setCollege(college);
                    startActivity(i);
                } else {
                    Toast.makeText(getContext(), "Sorry ! College not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        collegeName = (EditText) rootView.findViewById(R.id.college_name);

        collegeNameButton = (ImageButton) rootView.findViewById(R.id.college_name_search);
        collegeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = collegeName.getText().toString();
                College college = CollegeCollection.getCollegeByName(name);
                if(college != null) {
                    Intent i = new Intent(getContext(), CollegeDetailActivity.class);
                    //setting The collage Object
                    CollegeDetailActivity.setCollege(college);
                    startActivity(i);
                } else {
                    Toast.makeText(getContext(), "Sorry ! College not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TextView thane = (TextView) rootView.findViewById(R.id.thane);
        thane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeAreaActivity.class);
                CollegeAreaActivity.setTitle("Colleges in Thane");
                CollegeAreaActivity.setCollegeList(CollegeCollection.getCollegesThane());
                startActivity(i);
            }
        });

        TextView mumbai = (TextView) rootView.findViewById(R.id.mumbai);
        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeAreaActivity.class);
                CollegeAreaActivity.setTitle("Colleges in Mumbai");
                CollegeAreaActivity.setCollegeList(CollegeCollection.getCollegesMumbai());
                startActivity(i);
            }
        });

        TextView panvel = (TextView) rootView.findViewById(R.id.panvel);
        panvel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CollegeAreaActivity.class);
                CollegeAreaActivity.setTitle("Colleges in Panvel");
                CollegeAreaActivity.setCollegeList(CollegeCollection.getCollegesPanvel());
                startActivity(i);
            }
        });

        return rootView;
    }

}
