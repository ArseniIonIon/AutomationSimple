package HomeWork3.employeeProblem;


public class EmployeeHourlyPaid extends EmployeeFixedSalary implements Employee {

    public int getMonthSallary() {
        int days = 21;
        int hours = 8;
        int montlySalary = days * hours * getRandomNumber(30,50);

        System.out.println("Frelancer Salary " + montlySalary);
        return montlySalary;
    }
}

