package Array;

import java.util.Arrays;
import java.util.Collections;

class Employee implements Comparable<Employee>{
        private String name;
        private int age;
        private int salary;


    public Employee(String name,int age,int salary){
        this.name= name;
        this.age=age;
        this.salary=salary;
    }


    public int compareTo(Employee employee){
        if(age==employee.age){
            return (salary-employee.salary);
        }
        return age-employee.age;
    }

  
    public String toString() {
       return String.format("(%s, %d, %s)", name,salary,age);
    }}
    public class CustomObjectsort {
    public static void main(String[] args) {
        Employee[] employees=new Employee[4];
        employees[0]=new Employee("vicky", 52, 200000);
        employees[1]=new Employee("chakri", 40  , 10000)   ;
        employees[2]=new Employee("briy", 25, 26000);
        employees[3]=new Employee("charan", 27, 25000);    
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees,Collections.reverseOrder());
        System.out.println(Arrays.toString(employees));
    }
}
