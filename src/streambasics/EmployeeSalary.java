package streambasics;

import models.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(1,"Alok","UHG",100L),
                new Employee(2,"Pritam","AppliedECE",60000l),
                new Employee(3,"Sayan","ECE",100000l),
                new Employee(4,"Anik","CSE",80000l),
                new Employee(5,"Prosun","Civil",50000l),
                new Employee(6,"Arup","ECE",80000l),
                new Employee(7,"Subhamay","ECE",86000l),
                new Employee(8,"Prakhar","AppliedECE",90000l));
        
        empList.stream().filter(emp -> emp.getSalary() >50000L).forEach( employee -> System.out.println(employee.getName()));
    }

}
