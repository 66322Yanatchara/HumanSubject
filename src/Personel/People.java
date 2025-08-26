package Personel;

public abstract class People {
    // counts[0][yy] = ลำดับของผู้ชายปี yy
    // counts[1][yy] = ลำดับของผู้หญิงปี yy
    private static final int[][] counts = new int[2][100]; // 0..99 สำหรับปี 2 หลัก

    public abstract int payTax(int income);
    public abstract int getWelfare(String type);

    // รูปแบบรหัส = [เพศ][ปี2หลัก][ลำดับเฉพาะเพศในปีนั้น]
    public synchronized String register(int year, String gender) {
        // กันกรณีใส่ปีเกินช่วง 0..99
        int yy = ((year % 100) + 100) % 100;

        int gIndex = gender.equalsIgnoreCase("male") ? 0 : 1;
        String idType = (gIndex == 0) ? "1" : "2";

        // เพิ่มลำดับเฉพาะเพศ-ปีนั้น ๆ
        int order = ++counts[gIndex][yy];  // เริ่มนับจาก 1

        // รวมเป็น [เพศ][ปี][ลำดับ] เช่น 1 35 2 -> "1352"
        // ถ้าอยากให้ปีเป็น 2 หลักเสมอใช้ %02d
        return idType + String.format("%02d", yy) + order;
    }
}
