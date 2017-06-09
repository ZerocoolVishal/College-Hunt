package layout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import ml.vishalbhosle.collagesearch.College;
import ml.vishalbhosle.collagesearch.R;

/**
 * Created by vishal on 16/1/17.
 */

public class CollegeAdapter extends ArrayAdapter<College>{

    public CollegeAdapter(Context context, ArrayList<College> collegeList) {
        super(context,0, collegeList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        try {
            view = convertView;
            if(view == null) {
                view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
            }

            College college = getItem(position);

            ImageView image = (ImageView) view.findViewById(R.id.list_collage_image);
            image.setImageResource(college.getCollegeImage());

            TextView collageName = (TextView) view.findViewById(R.id.list_collage_name);
            collageName.setText(college.getCollegeName());

            TextView collageLocation = (TextView) view.findViewById(R.id.list_collage_location);
            collageLocation.setText(college.getPlace());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return view;
    }
}
