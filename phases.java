

public class phases {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=s1;
        Student s3=new Student(2111981173,"Shreya");
        Student s4=new Student(s1);
        System.out.println(s1.rollNo+" "+s1.name);
        System.out.println(s3.rollNo+" "+s3.name);
    }
}

class Student{
    int rollNo;
    String name;
    Student(){
        rollNo=2111981176;
        name="Siddhant";
    }
    Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    Student(Student s){
        this.rollNo=s.rollNo;
        this.name=s.name;
    }

};
