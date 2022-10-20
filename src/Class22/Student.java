package Class22;
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
*Define common behavior within parent class and override some of the methods in child classes
*Define some methods specific to child classes
*Write example of achieving run time polymorphism*/

public class Student {
   public void study(){
       System.out.println("All Students are study");
   }

    public void homeWork() {
        System.out.println("Student has a home work");

    }
}
class SyntaxStudent extends Student{
    @Override
    public void study(){
        System.out.println("Syntax students are study Java");
    }
    public void homeWork(){
        System.out.println("Syntax students have a lot of home work.");
    }
}
class CollegeStudent extends Student{
    @Override
    public void study() {
        System.out.println("Student at College should choose a subject");
    }
    void freedom(){
        System.out.println("College students have to socialize");
    }
}
class SchoolStudent extends Student{
    @Override
    public void study(){
        System.out.println("School students are study");
    }
    void school(){
        System.out.println("School students must graduate from school to go to College");
    }
}