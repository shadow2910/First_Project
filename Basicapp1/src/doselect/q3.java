package doSelect;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
class Employee {
    String name;
    int salary;
    Employee(){}
    Employee(String name ,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
        BYNAME,BYSALARY
    };
    public List<Employee> sort(List<Employee> emps,final SortMethod method){
        List<Employee> sortedEmp=new ArrayList<>();
        if(method == SortMethod.BYNAME){
            Comparator<Employee> name=(emp1,emp2)->emp1.name.compareTo(emp2.name);
            sortedEmp=emps.stream().sorted(name).collect(Collectors.toList());
        }
        else if(method==SortMethod.BYSALARY){
            Comparator<Employee> salary=(emp1,emp2)->{
                if(emp1.getSalary()==emp2.getSalary())
                    return emp1.name.compareTo(emp2.name);
                else
                    return emp1.salary-emp2.salary;
                };
            sortedEmp=emps.stream().sorted(salary).collect(Collectors.toList());
        }
        return sortedEmp;
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities,String character){
        List<Employee> emps=entities.stream().filter(emp->emp.getName().toLowerCase().charAt(0)==character.charAt(0)).collect(Collectors.toList());
        if(emps.size()==entities.size() )
            return true;
        else
            return false;
    }
}