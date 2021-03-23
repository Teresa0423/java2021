package fju.com.stu;

public class Tester {
    public static void main(String[] args){
        Student stu = new Student("0001","Jack",60,80);
        stu.print();
        GraduateStudent gst = new GraduateStudent("1001","Mary",40,70,66);
        gst.print();
    }
}
