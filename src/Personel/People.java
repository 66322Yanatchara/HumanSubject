package Personel;

import java.util.HashMap;
import java.util.Map;

public abstract class People {
    // นับลำดับแยกตามปีของแต่ละเพศ
    private static final Map<Integer, Integer> maleCount = new HashMap<>();
    private static final Map<Integer, Integer> femaleCount = new HashMap<>();

    public abstract int payTax(int income);
    public abstract int getWelfare(String type);

    // รูปแบบรหัส = [เพศ][ปี2หลัก][ลำดับเฉพาะเพศในปีนั้น]
    public String register(int year, String gender) {
        String idType;
        int order;

        if (gender.equalsIgnoreCase("male")) {
            idType = "1";
            maleCount.put(year, maleCount.getOrDefault(year, 0) + 1);
            order = maleCount.get(year);
        } else {
            idType = "2";
            femaleCount.put(year, femaleCount.getOrDefault(year, 0) + 1);
            order = femaleCount.get(year);
        }

        // รวมเป็น [เพศ][ปี][ลำดับ] เช่น 1 35 2 -> "1352"
        return idType + String.valueOf(year) + order;
    }
}
