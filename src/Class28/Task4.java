package Class28;

import java.util.TreeMap;

class Task4 {
    /*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.*/
}
class Person{
    private String name;
    private String lastNAme;
    private int age;
    private double salary;
    Person(String name, String lastNAme, int age, double salary){
        this.name=name;
        this.lastNAme=lastNAme;
        this.age=age;
        this.salary=salary;
    }
    void userDetails(){
        System.out.println("User name : "+name+", "+"User Lastname : "+lastNAme+", "+"User age is "+age+", and salary is "+salary);
    }
}
class Test{
    public static void main(String[] args) {
        TreeMap<Integer, Person> personData=new TreeMap<>();
        personData.put(12345, new Person("Emily", "Cooper", 29,5000));
        personData.put(23456, new Person("Gabriel", "Adams", 34, 10000 ));
        personData.put(34567, new Person("Anna", "Adams", 32, 7000));

        for(var data: personData.keySet()){
            personData.get(data).userDetails();
        }
    }
}
