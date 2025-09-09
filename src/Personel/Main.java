package Personel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== รับข้อมูลนักศึกษา =====
        System.out.print("กรอกรหัสนักศึกษา: ");
        String studentId = sc.nextLine().trim();

        System.out.print("กรอกชื่อนักศึกษา: ");
        String studentName = sc.nextLine().trim();

        System.out.print("กรอกหน่วยกิตที่มีอยู่แล้ว: ");
        int currentUnits = readNonNegativeInt(sc);

        System.out.println("\n===== สรุปข้อมูลเบื้องต้น =====");
        System.out.println("รหัสนักศึกษา: " + studentId);
        System.out.println("ชื่อนักศึกษา: " + studentName);
        System.out.println("หน่วยกิตปัจจุบัน: " + currentUnits);

        // ถ้าเกิน/เท่ากับ 21 แล้ว ลงเพิ่มไม่ได้
        if (currentUnits >= 21) {
            System.out.println("\n❌ ไม่สามารถลงทะเบียนเพิ่มได้ (หน่วยกิตถึง/เกิน 21 แล้ว)");
            sc.close();
            return;
        }

        // ===== วนลูปลงทะเบียนรายวิชาใหม่ =====
        while (true) {
            System.out.println("\n===== ลงทะเบียนรายวิชาใหม่ =====");
            System.out.print("กรอกรหัสวิชา: ");
            String subId = sc.nextLine().trim();

            System.out.print("กรอกชื่อวิชา: ");
            String subName = sc.nextLine().trim();

            System.out.print("กรอกหน่วยกิตของวิชา: ");
            int addUnits = readPositiveInt(sc);

            int newTotal = currentUnits + addUnits;

            System.out.println("\n===== ผลการลงทะเบียน =====");
            if (newTotal <= 21) {
                System.out.println("✅ ลงทะเบียนสำเร็จ");
                System.out.println("วิชา: " + subId + " - " + subName + " (" + addUnits + " หน่วยกิต)");
                System.out.println("หน่วยกิตเดิม: " + currentUnits);
                System.out.println("หน่วยกิตที่เพิ่มมา: " + addUnits);
                System.out.println("รวมหน่วยกิตใหม่: " + newTotal + " (ไม่เกิน 21)");
                currentUnits = newTotal; // update หน่วยกิต
            } else {
                System.out.println("❌ ไม่สามารถลงทะเบียนได้ (จะกลายเป็น " + newTotal + " หน่วยกิต ซึ่งเกิน 21)");
                System.out.println("หน่วยกิตเดิมยังคงเป็น: " + currentUnits);
                break; // จบการลงทะเบียนเพราะเกิน 21
            }

            // ถามต่อว่าจะเพิ่มอีกไหม
            System.out.print("\nต้องการเพิ่มรายวิชาอีกหรือไม่? (Y/N): ");
            String ans = sc.nextLine().trim();
            if (!ans.equalsIgnoreCase("Y")) {
                break; // ออกจากลูป
            }
        }

        System.out.println("\n=== สรุปสุดท้าย ===");
        System.out.println("รหัสนักศึกษา: " + studentId);
        System.out.println("ชื่อ: " + studentName);
        System.out.println("รวมหน่วยกิตสุดท้าย: " + currentUnits);

        sc.close();
    }

    // อ่านจำนวนเต็มที่ไม่ติดลบ
    private static int readNonNegativeInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine(); // เคลียร์ buffer
                if (val >= 0) return val;
            } else {
                sc.nextLine();
            }
            System.out.print("กรอกเป็นจำนวนเต็มที่ไม่ติดลบอีกครั้ง: ");
        }
    }

    // อ่านจำนวนเต็มบวก (> 0)
    private static int readPositiveInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine();
                if (val > 0) return val;
            } else {
                sc.nextLine();
            }
            System.out.print("กรอกเป็นจำนวนเต็มบวก (>0) อีกครั้ง: ");
        }
    }
}
