package Personel;

public class Alumni extends People {
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


    @Override
    public int payTax(int income) { // รายได้ไม่เกิน 150,000 เสียภาษี 0 ถ้าเกิน เสีย 5%
        return 0;
    }
}
