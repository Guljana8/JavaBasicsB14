package Replit;

import java.util.Scanner;

public class Repl215 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String s){
        int checkBracket = 0;
        for(int i=0; i< s.length(); i++){
            if(checkBracket < 0){
                return false;
            }
            String oneSymbol = s.substring(i, i+1);
            if(oneSymbol.equals("(")){
                checkBracket++;
            } else{
                checkBracket--;
            }
        }
        if(checkBracket==0){
            return true;
        }
        else{
            return false;
        }
       /* if(s.length()%2==0){
            return true;
        }
        else{
            return false;
        }*/

    }
/*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

        System.out.println(isBalanced(s));


    }

    public static boolean isBalanced(String s){

        if(s.length()%2==0){
            return true;
        }
        else{
            return false;
        }

    }*/
}
