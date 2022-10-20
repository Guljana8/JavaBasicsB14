package Class17;

public class Students {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each student name.
    //NOTE: please use different names for instance and local variables.

    String name;
    int grade1;
    int grade2;
    int grade3;

    public Students(String studentName, int firstGrade, int secondGrade,
                    int thirdGrade){
        name=studentName;
        grade1=firstGrade;
        grade2=secondGrade;
        grade3=thirdGrade;
    }

    public Students(){

    }
    void averageGrade(){
        int average=(grade1+grade2+grade3)/3;
        System.out.println("Student name is "+name+ " and average " +
                "grade is "+average);
    }

}
