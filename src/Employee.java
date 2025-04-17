public class Employee {
    String name;
    int employeeId;
    double salary;

    public Employee(String name, Integer employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculatePay(){
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    String banefitsPackage;

    public FullTimeEmployee(String name, int employeeId, double salary, String banefitsPackage) {
        super(name, employeeId, salary);
        this.banefitsPackage = banefitsPackage;
    }
    @Override
    public double calculatePay()
    {

        return  salary;
    }
}


class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorkedPerWeek;

    public PartTimeEmployee(String name, int employeeId, double salary, double hourlyRate, int hoursWorkedPerWeek) {
        super(name, employeeId, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public double calculatePay() {

        return hourlyRate * hoursWorkedPerWeek*4;
    }

}
