package HomeWork3.employeeProblem;

public class EmployeeFixedSalary implements Employee {

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public int getMonthSallary() {

        int monthlySalary = getRandomNumber(5000, 10000);
        System.out.println("Monthly fixed salary " + monthlySalary);
        return monthlySalary;
    }

}
