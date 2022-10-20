package Class15;

import Class16.Person;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.salary);=> cannot access it as this is a different package
       // System.out.println(person.password);=> cannot access it as this is a different package
       System.out.println(person.name);
    }
}
