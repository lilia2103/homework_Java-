package inheritance.aggregation.aggregation2;
import java.util.*;
public class Bank {
    private List<Employee> employees;

    public Bank(){

    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmloyee(Employee employee){
        employees.remove(employee);
    }

}
