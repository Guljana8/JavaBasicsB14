package Class16;

public class Student {

    String name;
    String id;
    static int numberOfStudent; // => only the static variables for which we can use the class name.
    public static void main(String[] args){
        Student student=new Student();
        student.id="1";
        student.name="Roman";
        student.numberOfStudent=1; //or roman.numberOfStudent++;

        Student student1=new Student();
        student1.id="2";
        student1.name="Guljan";
        student1.numberOfStudent++;

        System.out.println(student1.numberOfStudent);
        System.out.println(student.numberOfStudent);

    }


}
