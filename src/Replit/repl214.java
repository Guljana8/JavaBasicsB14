package Replit;

public class repl214 {
    public static void studentGrade(int grade) throws Exception{
        if(grade>90){
            throw new Exception();

        }else{
            System.out.println("You are a great student");
        }
    }
}
class customException{
    public static void main(String[] args){
        try{
            //studentGrade(95);
        }
        catch(Exception e){
            System.out.println(e+": You are an exceptionally awesome student");
        }
    }
}
