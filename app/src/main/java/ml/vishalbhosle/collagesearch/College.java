package ml.vishalbhosle.collagesearch;

/**
 * Created by vishal on 16/1/17.
 */

public class College {

    private String collegeName;
    private String place;
    private int collegeImage;
    private String location;
    private String website;
    private int dteCode;
    private String area;
    private String contactNo;
    private String email;
    private String address;
    private AboutCollege aboutCollege;
    private CollegeDepartment collegeDepartment;
    private CollegeCutOff cf;
    private String fees;

    public College(int collegeImage, String collageName, String place) {
        this.collegeImage = collegeImage;
        this.collegeName = collageName;
        this.place = place;
    }

    public College(int dteCode, int collegeImage, String collageName, String place, String email, String contactNo, String website, String location, String address, AboutCollege ac, CollegeDepartment cd, String fees, CollegeCutOff cf, String area) {
        this.dteCode = dteCode;
        this.collegeImage = collegeImage;
        this.collegeName = collageName;
        this.place = place;
        this.email = email;
        this.contactNo = contactNo;
        this.website = website;
        this.location = location;
        this.address = address;
        this.aboutCollege = ac;
        this.collegeDepartment = cd;
        this.fees = fees;
        this.cf = cf;
        this.area = area;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getPlace() {
        return place;
    }

    public int getCollegeImage() {
        return collegeImage;
    }

    public String getEmail() {
        return email;
    }

    public int getDteCode() {
        return dteCode;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getLocation() {
        return location;
    }

    public String getWebsite() {
        return website;
    }

    public String getAddress() {
        return address;
    }

    public AboutCollege getAboutCollege() {
        return aboutCollege;
    }

    public CollegeDepartment getCollegeDepartment() {
        return collegeDepartment;
    }

    public String getFees() {
        return fees;
    }

    public CollegeCutOff getCutOff() {
        return cf;
    }

    public String getArea() {
        return area;
    }
}

class AboutCollege {

    private String about;


    AboutCollege(String about) {

        this.about = about;
    }

    public String getAbout() {
        return about;
    }
}

class CollegeDepartment {

    private boolean computer;
    private boolean it;
    private boolean civil;
    private boolean mechanical;
    private boolean extc;

    public CollegeDepartment(boolean comp, boolean it, boolean civ, boolean mech,boolean extc) {
        this.computer = comp;
        this.it = it;
        this.civil = civ;
        this.mechanical = mech;
        this.extc = extc;
    }

    public boolean isComputer() {
        return computer;
    }

    public boolean isIt() {
        return it;
    }

    public boolean isCivil() {
        return civil;
    }

    public boolean isMechanical() {
        return mechanical;
    }

    public boolean isExtc() {
        return extc;
    }

}

class CollegeCutOff {

    int comp;
    int it;
    int civil;
    int mech;
    int extc;

    CollegeCutOff(int comp, int it, int civil,int mech, int extc) {
        this.comp = comp;
        this.it = it;
        this.civil = civil;
        this.mech = mech;
        this.extc = extc;
    }

    public int getComp() {
        return comp;
    }

    public int getIt() {
        return it;
    }

    public int getCivil() {
        return civil;
    }

    public int getMech() {
        return mech;
    }

    public int getExtc() {
        return extc;
    }
}