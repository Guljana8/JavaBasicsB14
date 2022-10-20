package Class17;

public class HomeWork1 {
    /*
    *Write a java class that will have a constructor: one with parameters and second without any parameters.
    * Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

    private String name;
    private String level;
    private String instructor;


    public HomeWork1(String homeWorkName, String homeWorkLevel,
                     String instructorName ){
        name=homeWorkName;
        level=homeWorkLevel;
        instructor=instructorName;

    }

    public HomeWork1() {

    }

     void make(){
        System.out.println("task: "+name+ ", level: "+level+ ", Instructor: "+instructor);
    }

    public static void main(String[] args) {
        HomeWork1 task=new HomeWork1();
        task.name="Home Work";
        task.level="medium";
        task.instructor="Asghar";


    }

}
