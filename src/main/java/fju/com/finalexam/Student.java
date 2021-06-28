package fju.com.finalexam;

public class Student {
    String name;
    String id;
    int chinese;
    int english;
    int math;

    public Student(String name, String id, int chinese, int english, int math) {
        this.name = name;
        this.id = id;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public int average() {
        return (chinese + english + math) / 3;
    }

    public Student() {
        super();
    }

    public void print() {
        System.out.println("name:" + name + "\t" + "id:" + id + "\t" + "chinese:" + chinese + "\t" + "english:" + english + "\t" + "math:" + math + "\t"
                + "average:" + average());
    }

    public String toString() {
        int avg = average();
        String grades = "AABCDFFFFF";
        String grading = null;
        if (avg >= 90 && avg <= 100) {
            grading = "A";
        } else if (avg >= 80 && avg <= 89) {
            grading = "B";
        } else if (avg >= 70 && avg <= 79) {
            grading = "C";
        } else if (avg >= 60 && avg <= 69) {
            grading = "D";
        }
            return name + "\t" + english + "\t" + math + "\t" + average() + "\t" + grading;
        }
}
