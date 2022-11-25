package Class28;
/*Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000*/

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("Lena Smith", 95000);
        employee.put("Anna Williams", 80000);
        employee.put("George Adams", 60000);
        employee.put("Kate Jones", 100000);

        var iterator=employee.entrySet().iterator();
        Integer maxSalary=0;
        String empName="";
        while(iterator.hasNext()){
            var emp=iterator.next();
            empName=emp.getKey();
            var empSalary=emp.getValue();
            if(empSalary > maxSalary){
                maxSalary=empSalary;

            }
        }
        System.out.println(empName+"=$"+maxSalary);
    }
}
