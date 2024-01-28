public class Employee {
    //constructor
    //<Identification
    //1.1same name as class name
    //1.2 no return type

    //<purpose>
    //1.1 it creates/initializes object in Memory(Ram)
    //1.2 you can use constructor Block to initialize some default vales.

    int employeeId;
    int salary;
    String dept;
   Employee(int empid,int sal,String d){
    employeeId=empid;
    salary=sal;
    dept=d;
   }

    public static void main(String[] args) {

        Employee harsha = new Employee(101,3000,"Testing");
        Employee varsha = new Employee(102,5000,"Engineering");

        System.out.println(harsha.employeeId+" Salary "+harsha.salary+" Dept "+harsha.dept);
        System.out.println(varsha.employeeId+" Salary "+varsha.salary+" Dept "+varsha.dept);

    }
}