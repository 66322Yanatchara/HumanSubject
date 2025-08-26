package Personel;

public class Merchant extends People {

    @Override
    public int payTax(int income) {
        // สมมติว่า Merchant เสียภาษี 10%
        return (int)(income * 0.10);
    }

    @Override
    public int getWelfare(String type) {
        // สมมติ Merchant มีแต่สวัสดิการตกงาน 5000
        if (type.equalsIgnoreCase("ตกงาน")) {
            return 5000;
        }
        return 0;
    }
}