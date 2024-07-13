public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", 12345, 20.0);

        System.out.println(employee.toString());

        System.out.println("Employee's new hourly pay after raise: $" + employee.getRaise());

        int hoursWorked = 45; // Example: Employee worked 45 hours
        double totalPay = employee.payDay(hoursWorked);
        System.out.println("Total pay for the week: $" + totalPay);
    }
}
