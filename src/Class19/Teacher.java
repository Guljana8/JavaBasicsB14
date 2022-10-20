package Class19;
public class Teacher {
    /*Write a Java program called Teacher.
    *Identify features and behaviour of that Class.
    * Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    * that would have it their own features and behaviour. Test all 4 classes
     */
    String name;
    String subject;
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    void printInfo(){
         System.out.println(subject+" Teacher's name is "+name+".");}
}
class MathTeacher extends Teacher{
    public MathTeacher(String name,String subject) {
        super(name,subject);}
}
class ChemistryTeacher extends Teacher{
    ChemistryTeacher(String name, String subject){
        super(name,subject);}
}
class PianoTeacher extends Teacher{
    PianoTeacher(String name, String subject){
        super(name,subject);}
}
class TestTeacher{
    public static void main(String[] args) {
        MathTeacher teach1=new MathTeacher("Mr. John","Math");
        teach1.printInfo();
        ChemistryTeacher teach2=new ChemistryTeacher("Miss Mary","Chemistry");
        teach2.printInfo();
        PianoTeacher teach3=new PianoTeacher("Miss Nina", "Piano");
        teach3.printInfo();
    }
}

