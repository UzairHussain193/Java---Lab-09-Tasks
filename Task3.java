
// Lab 09 Q3: Demonstrate the use of the following Keywords.
// i.	Super
// ii.	This
// iii.	Final
// iv.	Extends
// v.	Implements

interface Department {
    public void BestDept(String name);
}

class SW implements Department {
    public void BestDept(String n) {
        System.out.println("\n\t\tUniversity has Best Department of " + n);
    }
}

class orientation {
    public void text() {
        System.out.println("\n\t\tVice Chancellor said; \"This is My University\" ");
    }
}

class greet extends orientation {
    public void text() {
        super.text();
        System.out.println("\n\t\tand then he thanked all teachers. ");
    }
}

class Admin {

    String HeadDirector;
    int members;

    public void setHeadDirector(String h) {
        HeadDirector = h;
    }

    public String getHeadDirector() {
        return HeadDirector;
    }

    public void setmembers(int s) {
        members = s;
    }

    public int getmembers() {
        return members;
    }
}

class Examination extends Admin {
    String dptHead;

    public void setdptHead(String d) {
        dptHead = d;
    }

    public String getdptHead() {
        return dptHead;
    }
}

public class Task3 {
    final int noDept = 10;
    int rank = 0;

    Task3(int rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {

        Task3 t = new Task3(1);
        Examination e = new Examination();
        greet g = new greet();
        SW s = new SW();

        g.text();
        s.BestDept("Software Engineering");
        System.out.println("Rank is : " + t.rank);
        // t.noDept = 8; // it shows error and it resist to change its value because of
        // final keyword.

        System.out.println("Number of Departments: " + t.noDept);
        e.setHeadDirector("VC: TAUHA HUSSAIN ALI");
        e.setdptHead("AD: ASLAM UQAILI");
        e.setmembers(52);

        System.out.println(e.getHeadDirector());
        System.out.println(e.getdptHead());
        System.out.println("Members: " + e.getmembers());

    }

}
