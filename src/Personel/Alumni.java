package Personel;

public class Alumni extends Person {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void showOccupation() {
        if (salary > 40000) {
            System.out.println("System analyst");
        } else if (salary > 15000) {
            System.out.println("Developer");
        } else {
            System.out.println("Administrator");
        }
    }
}