package Personel;

public class Merchant {
    public int payTax(int income) {
        if (income <= 150000) {
            // รายได้ไม่เกิน 150,000 เสียภาษี 1000 บาท
            return 1000;
        } else {
            // รายได้เกิน 150,000 เสียภาษี 1000 + 5% ของรายได้ส่วนเกิน
            return 1000 + (int) ((income - 150000) * 0.05);
        }
    }

}
