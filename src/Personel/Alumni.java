package Personel;

public class Alumni extends People {

    /*private int salary;
    private int rate;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String showInfo() {
        String info = "Alumni information :" + getId() + " " + getName() + " " + getSalary();
        return info;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public double computeSalary() {
        return salary + (salary * (rate / 100.0));
    }*/

    @Override
    public int payTax(int income) {
        if (income <= 150000) {
            return 1000; // รายได้ไม่เกิน 150,000 เสีย 1,000 บาท
        } else {
            return (int)(income * 0.05) + 1000; // รายได้เกิน 150,000 เสีย 5% ของรายได้ + 1,000 บาท
        }
    }

    @Override
    public int getWelfare(String type){
        if (type.equalsIgnoreCase("ถอนฟัน")) {
            return 400;
        } else if (type.equalsIgnoreCase("คลอดบุตร")) {
            return 10000;
        } else if (type.equalsIgnoreCase("ตกงาน")) {
            return 15000;
        } else {
            return 0; // ถ้าไม่ตรงเงื่อนไข
        }
    }
}
    /*@Override
    public int payTax(int income) {
        if (income <= 150000) {
            return 0; // ไม่เกิน 150,000 ไม่เสียภาษี
        } else {
            return (int) ((income - 150000) * 0.05); // ส่วนที่เกิน 150,000 คิดภาษี 5%
        }
    }*/
