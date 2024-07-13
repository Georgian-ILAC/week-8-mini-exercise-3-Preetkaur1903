public class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        super(firstName, lastName);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public int getId() {
        return id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getRaise() {
        double raiseAmount = hourlyPay * 0.15;
        hourlyPay += raiseAmount;
        return hourlyPay;
    }

    public double payDay(int hoursWorked) {
        double totalPay;
        if (hoursWorked > 40) {
            totalPay = (40 * hourlyPay) + ((hoursWorked - 40) * 1.5 * hourlyPay);
        } else {
            totalPay = hoursWorked * hourlyPay;
        }
        return totalPay;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "They are " + getHeight() + " feet tall\n" +
                "They make $" + hourlyPay + "\n" +
                "They have the employee ID " + id + "\n";
    }
}
