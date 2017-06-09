package ml.vishalbhosle.collagesearch;

import java.util.ArrayList;

/**
 * Created by vishal on 17/1/17.
 */

public class CollegeCollection {

    private static ArrayList<College> collegeList;
    private AboutCollege ac;
    private CollegeDepartment cd;
    private CollegeCutOff cf;

    public CollegeCollection() {

        collegeList = new ArrayList<>();
        //add Collages here
        ac = new AboutCollege("Saraswati Education Society is a public charitable trust which was formed on 10 Oct 2003 by Dr Nandkumar Y Tasgaonkar. He is the main founder and Chairman of the trust. Since its inception, the trust has established ten institutions at Bhivpuri Road station, Taluka Karjat, District Raigad. The trust is running various professional courses in engineering, management and pharmacy in its institutions. All the post graduate and degree courses are approved by AICTE, UGC and DTE, and affiliated to Mumbai University. ");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(7242,13009,4116,4116,10477);
        collegeList.add(new College(3282,R.drawable.sample,"Yadavrao Tasgaonkar Polytechnic","Bhivpuri Road","info@tasgaonkartech.com","02148 320 781","http://www.tasgaonkartech.com/","geo:18.963837, 73.347570?z=17"," Bhivpuri Road Railway Station, Village: Chandhai, Post: Nasrapur, Tal: Karjat, Dist: Raigad",ac,cd,"61,170",cf,"thane"));

        ac = new AboutCollege("Vidyalankar Institute of Technology is an engineering degree college approved by the All India Council For Technical Education and affiliated to University of Mumbai, India.");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(4455,8598,4116,8598,7653);
        collegeList.add(new College(532,R.drawable.vidyalankar,"Vidyalankar Institute of Technology","Wadala","principal@vit.edu.in","02224161126","http://vit.edu.in/","geo:19.021723, 72.870439?z=17","Vidyalankar campus,Vidyalankar College Marg, Wadala East, Mumbai, Maharashtra 400037",ac,cd,"96,620",cf,"mumbai"));

        ac = new AboutCollege("M. H. Saboo Siddik is an engineering college located in Byculla at Saboo Siddik Polytechnic Road, Mumbai, India, affiliated with the University of Mumbai. It is an 'A' Grade institution, and is accredited by the NBA and AICTE");
        cf = new CollegeCutOff(7242,13009,4116,4116,10477);
        collegeList.add(new College(10,R.drawable.c10,"M.H.Saboo Siddik College of Engineering","Byculla","mhssce@yahoo.in","02223012922","http://www.mhssce.ac.in/","geo:18.968555, 72.831293?z=17"," 8, Saboo Siddik Polytechnic Road, New Nagpada, Byculla, Mumbai, Maharashtra 400008",ac,cd,"66,290",cf,"mumbai"));

        ac = new AboutCollege("Bharati Vidyapeeth's College of Engineering (BVCoE) is a private engineering college in Navi Mumbai, established in the year 1990. It is located in CBD Belapur. The college is affiliated to University Of Mumbai and approved by All India Council for Technical Education (AICTE), New Delhi. The college offers Bachelor of Engineering degree in various courses namely Instrumentation Engineering, Mechanical Engineering, Computer Engineering, Information Technology, Chemical Engineering and Electronics & Telecommunications Engineering. It is also one of the respected colleges in navi mumbai");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(11818,20052,2390,1394,3026);
        collegeList.add(new College(17,R.drawable.c17,"Bharati Vidyapeeth's College of Engineering","Kharghar","mzshaikh2003@yahoo.co.in","022 2757 1074","http://bvcoenm.edu.in/","geo:19.026743, 73.055457?z=17","Sector-7, CBD Belpada, Near Kharghar Railway Station, Navi Mumbai, Maharashtra 400614",ac,cd,"1.04L",cf,"panvel"));

        ac = new AboutCollege("Fr. Conceicao Rodrigues College of Engineering, is an engineering college in Mumbai, India. It is located at Bandstand in Bandra");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(2216,2390,2390,4123,4096);
        collegeList.add(new College(55,R.drawable.c55,"Fr. Conceicao Rodrigues College of Engineering","Bandra","contact@frcrce.ac.in","022 6711 4000","http://www.frcrce.ac.in/","geo:19.044528, 72.820485?z=17","Father Angels Ashram Road, Bandra West, Mumbai, Maharashtra 400050",ac,cd,"1.18L",cf,"mumbai"));

        ac = new AboutCollege("The K. J. Somaiya College of Engineering, abbreviated as KJSCE, was established in 1983 at Somaiya Vidyavihar");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(735,829,725,735,565);
        collegeList.add(new College(93,R.drawable.c93,"K.J. Somaiya College of Engineering","Vidya vihar","enquiry@engg.somaiya.edu","022 6644 9191","https://www.somaiya.edu/","geo:19.073014, 72.900578?z=17","Vidyanagar, Vidya Vihar East, Vidyavihar, Mumbai, Maharashtra 400077",ac,cd,"1.6L",cf,"mumbai"));

        ac = new AboutCollege("Mahatma Gandhi Mission's College of Engineering and Technology is one of the chain of educational institutions set up by the Mahatma Gandhi Mission, a Charitable Trust Act 1950 and Societies Regulation Act 1860");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(26570,14382,338,3154,192779);
        collegeList.add(new College(124,R.drawable.c124,"Mahatma Gandhi Mission's College of Engineering & Technology","Kamothe","contact@mgmmumbai.ac.in","022 2743 3403","http://www.mgmmumbai.ac.in/mgmcet/","geo:19.016296, 73.105210?z=17","Plot No. 1, 2, Sion - Panvel Expressway, Sector 18, Kamothe, Navi Mumbai, Maharashtra 410209",ac,cd,"85,636",cf,"panvel"));

        ac = new AboutCollege("Shah & Anchor Kutchhi Engineering College is an engineering college in Mumbai affiliated under University Of Mumbai. The college offers technical education to students. This college was established by the Mahavir Education Trust in 1985");
        cf = new CollegeCutOff(6520,7031,6520,6520,4785);
        cd = new CollegeDepartment(true,true,true,true,true);
        collegeList.add(new College(126,R.drawable.c126,"Shah and Anchor Kutchi Enginering College","Chembur","mail@shahandanchor.com","022 2558 0854","http://www.shahandanchor.com/","geo:19.048261, 72.911771?z=17","Mahavir Education Trust Chowk, W.T Patil Marg, Next To Duke's Company, Chembur, Mumbai, Maharashtra 400088",ac,cd,"1.05L",cf,"mumbai"));

        ac = new AboutCollege("Ramrao Adik Institute of Technology is a private engineering college located in Nerul, Navi Mumbai, India.It was established in the year 1983 and is one of the institutions in the DY Patil Educational Academy.");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(6167,5724,3154,3754,11382);
        collegeList.add(new College(174,R.drawable.c174,"Ramrao Adik Institute of Technology","Nerul","rait@rait.ac.in","022 2770 9574","http://www.rait.ac.in/","geo:19.044364, 73.026403?z=17","Sector 7, Phase I, Pad. Dr. D. Y. Patil Vidyapeeth, Nerul, Navi Mumbai, Maharashtra 400706",ac,cd,"99,750",cf,"panvel"));

        ac = new AboutCollege("Terna Engineering College is a private engineering college in Nerul, Navi Mumbai, India affiliated to University of Mumbai. Terna Engineering College was established in 1991. Terna Engineering College is public A graded college. ");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(11687,21265,10395,21246,21326);
        collegeList.add(new College(237,R.drawable.c237,"Terna College of Engineering","Nerul","contact@terna.org","022 6111 5444","http://www.terna.org/","geo:19.029639, 73.016857?z=17","Plot No. 12, Sector-22, Opp. Nerul Railway Station, Phase-II, Nerul West, Navi Mumbai, Maharashtra 400706",ac,cd,"1.3L",cf,"panvel"));

        ac = new AboutCollege("Thadomal Shahani Engineering College is an engineering and research institute in Mumbai, India. Founded in 1983, the year in which the Government of Maharashtra granted permission to start private ...");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(4509,4654,4509,4132,4132);
        collegeList.add(new College(238,R.drawable.c238,"Thadomal Shahani Engineering College","Bandra","gtthampi@yahoo.com","022 2649 5808","http://tsec.edu/","geo:19.064493, 72.835908?z=17","PG Kher Marg, TPS-III Off Linking Road, Bandra West, Mumbai, Maharashtra 400050",ac,cd,"1.11L",cf,"mumbai"));

        ac = new AboutCollege("Thadomal Shahani Engineering College is an engineering and research institute in Mumbai, India. Founded in 1983, the year in which the Government of Maharashtra granted permission to start private ...");
        cd = new CollegeDepartment(true,true,true,true,true);
        cf = new CollegeCutOff(13389,20227,13400,13450,18818);
        collegeList.add(new College(356,R.drawable.c356,"Padmabhushan Vasantdada Patil Pratishthan's College of Engineering","Sion","principal@pvppcoe.ac.in","022 2407 0547","http://www.pvppcoe.ac.in/","geo:19.050285, 72.878279?z=17","Padmabhushan Vasantdada Patil Pratishthan’s College of Engineering is an engineering college in Mumbai, India.",ac,cd,"92,000",cf,"mumbai"));

    }
    public ArrayList<College> getCollegeList() {

        return collegeList;
    }

    public static ArrayList<College> getCollegesThane() {
        ArrayList<College> list = new ArrayList<>();
        for (int i = 0 ; i < collegeList.size() ; i ++) {
            if(collegeList.get(i).getArea().equalsIgnoreCase("thane") == true) {
                list.add(collegeList.get(i));
            }
        }
        return list;
    }

    public static ArrayList<College> getCollegesMumbai() {
        ArrayList<College> list = new ArrayList<>();
        for (int i = 0 ; i < collegeList.size() ; i ++) {
            if(collegeList.get(i).getArea().equalsIgnoreCase("mumbai") == true) {
                list.add(collegeList.get(i));
            }
        }
        return list;
    }

    public static ArrayList<College> getCollegesPanvel() {
        ArrayList<College> list = new ArrayList<>();
        for (int i = 0 ; i < collegeList.size() ; i ++) {
            if(collegeList.get(i).getArea().equalsIgnoreCase("panvel") == true) {
                list.add(collegeList.get(i));
            }
        }
        return list;
    }

    public College getCollageAt (int index) {
        College college = collegeList.get(index);
        return college;
    }

    public static College getCollegeByDteCode(int dteCode) {
        for(int i = 0; i < collegeList.size(); i++) {
            College college = collegeList.get(i);
            if(college.getDteCode() == dteCode) {
                return college;
            }
        }
        return null;
    }

    public static College getCollegeByName(String collegeName) {
        for(int i = 0; i < collegeList.size(); i++) {
            College college = collegeList.get(i);
            if(college.getCollegeName().equalsIgnoreCase(collegeName) == true) {
                return college;
            }
        }
        return null;
    }
}
