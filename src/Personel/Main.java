package Personel;

import Item.Subject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ===== สร้างออบเจ็กต์นักศึกษา =====
        Student std1 = new Student();

        System.out.print("กรอกรหัสนักศึกษา: ");
        std1.setId(scan.nextLine().trim());

        System.out.print("กรอกชื่อนักศึกษา: ");
        std1.setName(scan.nextLine().trim());

        System.out.print("กรอกหน่วยกิตที่มีอยู่แล้ว: ");
        int cur = readNonNegativeInt(scan);
        std1.setCnUnit(cur);

        if (std1.getCnUnit() >= 21) {
            System.out.println("❌ หน่วยกิตถึง/เกิน 21 แล้ว ไม่สามารถลงเพิ่มได้");
            return;
        }

        // ===== วนลูปเพิ่มรายวิชา =====
        while (true) {
            int remaining = 21 - std1.getCnUnit();
            System.out.println("\nหน่วยกิตที่ยังเพิ่มได้: " + remaining);

            Subject sub = new Subject();

            System.out.print("กรอกรหัสวิชา: ");
            sub.setId(scan.nextLine().trim());

            System.out.print("กรอกชื่อวิชา: ");
            sub.setName(scan.nextLine().trim());

            System.out.print("กรอกหน่วยกิตของวิชา: ");
            sub.setUnits(readPositiveInt(scan));

            if (std1.addSubject(sub)) {
                System.out.println("✅ ลงทะเบียนสำเร็จ: " + sub);
                System.out.println("รวมหน่วยกิตใหม่: " + std1.getCnUnit() + "/21");
            } else {
                System.out.println("❌ เกินลิมิต: ถ้าเพิ่ม " + sub.getUnits() +
                        " จะเป็น " + (std1.getCnUnit() + sub.getUnits()) + " (>21)");
            }

            if (std1.getCnUnit() == 21) {
                System.out.println("หน่วยกิตครบ 21 พอดี ✅");
                break;
            }

            System.out.print("Continue? (Y/N): ");
            String ans = scan.nextLine().trim();
            if (!ans.equalsIgnoreCase("Y")) break;
        }

        // ===== สรุป =====
        System.out.println("\n=== สรุปสุดท้าย ===");
        System.out.println("ID : " + std1.getId());
        System.out.println("Name : " + std1.getName());
        System.out.println("Subjects (" + std1.getSubjects().size() + "):");
        for (Subject s : std1.getSubjects()) {
            System.out.println(" - " + s);
        }
        System.out.println("Total Units: " + std1.getCnUnit() + "/21");
    }

    private static int readNonNegativeInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int v = sc.nextInt(); sc.nextLine();
                if (v >= 0) return v;
            } else sc.nextLine();
            System.out.print("กรอกเป็นจำนวนเต็มที่ไม่ติดลบอีกครั้ง: ");
        }
    }

    private static int readPositiveInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int v = sc.nextInt(); sc.nextLine();
                if (v > 0) return v;
            } else sc.nextLine();
            System.out.print("กรอกเป็นจำนวนเต็มบวก (>0) อีกครั้ง: ");
        }
    }
}
