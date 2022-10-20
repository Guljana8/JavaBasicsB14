package Class22;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student a:students) {
            a.study();
            a.homeWork();

        }
    }
}
