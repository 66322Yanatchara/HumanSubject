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
//    public String showInfo() {
//        String info = "Alumni information :" + getId() + " " + getName() + " " + getSalary();
//        return info;
//    }


    @Override
    public int payTax(int income) { // รายได้ไม่เกิน 150,000 เสียภาษี 0 ถ้าเกิน เสีย 5%
        // รายได้ไม่เกิน 150,000 ไม่ต้องเสียภาษี
        if (income <= 150000) {
            return 0;
        } else {
            // รายได้เกิน 150,000 เสีย 5% ของรายได้ส่วนที่เกิน
            return (int) ((income - 150000) * 0.05);
        }
    }
}
