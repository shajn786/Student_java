public class Student {

    String name,college;
    int rollno,adno;

    public Student(String name, String college, int rollno, int adno) {
        this.name = name;
        this.college = college;
        this.rollno = rollno;
        this.adno = adno;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public int getRollno() {
        return rollno;
    }

    public int getAdno() {
        return adno;
    }
}

