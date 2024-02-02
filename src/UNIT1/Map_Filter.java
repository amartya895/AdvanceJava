package UNIT1;


import java.util.ArrayList;
import java.util.List;

class Employee {
    int empId;
    String empName;
    int Salary;

    public Employee ( int empId , String empName , int salary ) {
        this.empId = empId;
        this.empName = empName;
        Salary = salary;
    }
}

public class Map_Filter {

    public static void main ( String[] args ) {

        List < Employee > eL = new ArrayList <> ( );

        eL.add ( new Employee ( 121 , "Shubham" , 10000 ) );
        eL.add ( new Employee ( 122 , "Shivam" , 8000 ) );
        eL.add ( new Employee ( 123 , "Lakshay" , 2000 ) );
        eL.add ( new Employee ( 124 , "Amartya" , 100000 ) );


        List < Integer > strm = eL.stream ( )
                .filter ( e -> e.Salary > 2000 )
                .map ( e -> e.Salary + 2000 ).toList ( );

        System.out.println ( strm );


    }
}
