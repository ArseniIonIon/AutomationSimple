package HomeWork3.employeeProblem;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static class Pair {

       public Pair (EmployeeFixedSalary employeeFixedSalary, EmployeeHourlyPaid employeeHourlyPaid){
       }
    }
    public static void main(String[] args) {

       EmployeeFixedSalary employeeFixedSalary = new EmployeeFixedSalary();
       EmployeeHourlyPaid employeeHourlyPaid = new EmployeeHourlyPaid();


        List<Pair> employees = new ArrayList<Pair>();
        for (int i = 0; i <10; i++){
            employees.add(new Pair(employeeFixedSalary,employeeHourlyPaid));
        }

        int sum = 0;
        for (Pair pair: employees) {
            sum = sum + employeeFixedSalary.getMonthSallary() + employeeHourlyPaid.getMonthSallary();
        }

        System.out.println("Sum of all Employee's salary is "+ sum);

    }
}
