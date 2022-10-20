package Class16;

public class ArrSum {
    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.

 static int sumNumber(int[] arr) {
     int sum = 0;
     for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
     }
     return sum;
 }

    public static void main(String[] args) {
         ArrSum obj= new ArrSum();
         int[] arr = {10, 20, 30, 40};
         System.out.println(sumNumber(arr));
    }
}

