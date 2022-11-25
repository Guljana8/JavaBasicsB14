package Class26;

import java.util.HashSet;
/*Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
    */
public class Student {
    String studentName;
    String studentID;
    Student(String studentName, String studentID){
        this.studentName=studentName;
        this.studentID=studentID;
    }
    void displayInfo(){
        System.out.println("Student name is "+studentName+ " and Id: "+studentID);
    }
    public static void main(String[] args) {
        Student student1=new Student("John","123456");
        Student student2=new Student("Anna","678919");
        Student student3=new Student("Lena","246751");

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);

        for( Student studentType : hashSet) {
            studentType.displayInfo();
        }
    }
}
