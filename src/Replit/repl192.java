package Replit;

import java.util.LinkedList;

public class repl192 {
        static boolean isPrime(int number){
            // Corner case
            if (number <= 1)
                return false;

            // Check from 2 to n-1
            for (int i = 2; i < number; i++)
                if (number % i == 0)
                    return false;

            return true;
        }
        public static void main(String[] args){
            LinkedList<Integer> primeNumbers = new LinkedList<>();

            for(int i=0; i<=100; i++){
                if(isPrime(i)){
                    primeNumbers.add(i);//2,3,
                }
            }
            System.out.println(primeNumbers);
        }
    }
