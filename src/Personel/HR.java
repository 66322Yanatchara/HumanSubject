package Personel;

public interface HR extends Special  {
    int computeOT(int hours);
    double increaseSalary(int fstHrs, int scdHrs);
}

class Lecturer extends Person implements HR {
    @Override
    public int evaluate(int scholar) {
        return 0;
    }

    private int salary = 30000;
    private String name;
    private String id;

    @Override
    public int computeOT(int hours) {
        double hourly = salary / 240.0; // 30*8
        int totalSalary = (int)Math.round(hourly * hours);
        System.out.println("Total Salary with OT: " + totalSalary);
        return totalSalary;
    }

    @Override
    public double increaseSalary(int fstHrs, int scdHrs) {
        double workloadPerWeek = fstHrs + (scdHrs * 0.5);
        double workloadPerYear = workloadPerWeek * 52;

        double rate = (workloadPerWeek > 10 && workloadPerYear > 50) ? 0.04
                : (workloadPerWeek > 10 ? 0.03 : 0.01);

        salary += (int)Math.round(salary * rate);
        System.out.println("New Salary: " + salary);
        return salary;
    }
}

class Staff implements HR {
    private int salary = 20000;
    private String name;
    private String id;

    @Override
    public int computeOT(int hours) {
        double hourly = salary / 240.0;
        int totalSalary = (int) Math.round(hourly * hours);
        System.out.println("Total Salary with OT: " + totalSalary);
        return totalSalary;
    }

    @Override
    public double increaseSalary(int fstHrs, int scdHrs) {
        double workloadPerWeek = fstHrs + (scdHrs * 0.5);
        double workloadPerYear = workloadPerWeek * 52;

        double rate = (workloadPerWeek > 10 && workloadPerYear > 50) ? 0.04
                : (workloadPerWeek > 10 ? 0.03 : 0.01);

        salary += (int) Math.round(salary * rate);
        System.out.println("New Salary: " + salary);
        return salary;
    }

    public int evaluate(int scholar) {
        int value = 0;

        if (scholar < 100000) {
            value = 1000;
        } else if (scholar <= 500000) {
            value = 2000;
        } else {
            value = 3000;
        }
        return value;
    }

}
