package Class21;

public class EmployeeTester {
        public static void main(String[] args) {
            OfficeBoy officeBoy=new OfficeBoy();
            officeBoy.calculateSalary();

            Tester tester=new Tester();
            tester.calculateSalary();
            
            Developper developper=new Developper();
            developper.calculateSalary();
        }
    }


