package fju.com.finalexam;

public class Student {
    String name;
    String id;
    int chinese;
    int english;
    int math;

    public Student(String name, String id, int chinese, int english, int math){
        this.name = name;
        this.id = id;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public Student(){
        super();
    }

    public void print(){
        System.out.println("name:"+name+"\t"+"id:"+id+"\t"+"chinese:"+chinese+"\t"+"english:"+english+"\t"+"math:"+math+"\t"
        +"average:"+(chinese+english+math)/3);
    }
}
