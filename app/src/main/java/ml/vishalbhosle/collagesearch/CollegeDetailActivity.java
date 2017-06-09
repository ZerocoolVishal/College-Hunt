package ml.vishalbhosle.collagesearch;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CollegeDetailActivity extends AppCompatActivity {

    private static College college;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_detail2);

        //setting activity title
        Activity activity = this;
        activity.setTitle(college.getCollegeName());


        TextView locationText = (TextView) findViewById(R.id.location);
        locationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(college.getLocation()));
                if(i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        });

        final TextView contactEmailText = (TextView) findViewById(R.id.contact_email);
        contactEmailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] addresses = {college.getEmail()};

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        TextView phoneText = (TextView) findViewById(R.id.phone);
        phoneText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + college.getContactNo()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        Button webButton = (Button) findViewById(R.id.button_web);
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = college.getWebsite();
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        Button locationButton = (Button) findViewById(R.id.button_location);
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(college.getLocation()));
                if(i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        });

        ImageView image = (ImageView) findViewById(R.id.college_image);
        image.setImageResource(college.getCollegeImage());

        TextView collegeName = (TextView) findViewById(R.id.college_name);
        collegeName.setText(college.getCollegeName());

        TextView dteCode = (TextView) findViewById(R.id.dte_code);
        dteCode.setText("DTE CODE : " + college.getDteCode());

        TextView collegeEmail = (TextView) findViewById(R.id.contact_email);
        collegeEmail.setText(college.getEmail());

        TextView collegeContactNo = (TextView) findViewById(R.id.phone);
        collegeContactNo.setText(college.getContactNo());

        TextView collegeAddress = (TextView) findViewById(R.id.location);
        collegeAddress.setText(college.getAddress());

        TextView collegeAbout = (TextView) findViewById(R.id.college_about);
        collegeAbout.setText(college.getAboutCollege().getAbout());

        TextView collefeFees = (TextView) findViewById(R.id.fees);
        collefeFees.setText(collefeFees.getText() + college.getFees() + "/-");

        //cut off lict
        TextView cutComp = (TextView) findViewById(R.id.cut_comp);
        cutComp.setText(cutComp.getText() + Integer.toString(college.getCutOff().getComp()));

        TextView cutIt = (TextView) findViewById(R.id.cut_it);
        cutIt.setText(cutIt.getText() + Integer.toString(college.getCutOff().getIt()));

        TextView cutCivil = (TextView) findViewById(R.id.cut_civil);
        cutCivil.setText(cutCivil.getText() + Integer.toString(college.getCutOff().getCivil()));

        TextView cutMech = (TextView) findViewById(R.id.cut_mech);
        cutMech.setText(cutMech.getText() + Integer.toString(college.getCutOff().getMech()));

        TextView cutExtc = (TextView) findViewById(R.id.cut_extc);
        cutExtc.setText(cutExtc.getText() + Integer.toString(college.getCutOff().getExtc()));
    }

    public static void setCollege(College c) {
        college = c;
    }
}
