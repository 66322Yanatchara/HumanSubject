package Personel;

public class Alumni extends Person {
    private int salary;
    private int persen;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPersen(int persen) {
        this.persen = persen;
    }

    public int getSalary() {
        return salary;
    }

    public int computeGrade(){
        int Bonus = salary *persen /100;
        return Bonus;
    }
}
