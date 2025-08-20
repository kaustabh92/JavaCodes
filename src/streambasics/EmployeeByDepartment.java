package streambasics;

import models.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeByDepartment {

    public static void main(String[] args) {
        List<Employee> emplist = List.of(new Employee(1,"Kaustabh","CSE",80000l),
                new Employee(2,"Pritam","AppliedECE",60000l),
                new Employee(3,"Sayan","ECE",100000l),
                new Employee(4,"Anik","CSE",80000l),
                new Employee(5,"Prosun","Civil",50000l),
                new Employee(6,"Arup","ECE",80000l),
                new Employee(7,"Subhamay","ECE",86000l),
                new Employee(8,"Prakhar","AppliedECE",90000l));
        Map<String,List<Employee>> empByDept = employeeByEachDept(emplist);
        empByDept.entrySet().forEach(emp -> System.out.println("Department ->"+emp.getKey()+" Employees -> "+emp.getValue()));
    }

    private static Map<String, List<Employee>> employeeByEachDept(List<Employee> emplist){
        return emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
