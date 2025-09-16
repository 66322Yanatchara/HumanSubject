package Personel;

import Item.Subject;
import java.util.ArrayList;

public class Student extends Person {
    private int score;                 // เอาไว้ก่อน เผื่อใช้คำนวณเกรด
    private int cnUnit;                // current units ของนักศึกษา
    private final ArrayList<Subject> subjects = new ArrayList<>();

    public Student() {}

    public ArrayList<Subject> getSubjects() { return subjects; }

    public int getCnUnit() { return cnUnit; }
    public void setCnUnit(int cnUnit) { this.cnUnit = cnUnit; }

    // รวมหน่วยกิตปัจจุบันจากในลิสต์ (กันกรณี cnUnit ไม่อัปเดต)
    public int calcUnitsFromList() {
        int sum = 0;
        for (Subject s : subjects) sum += s.getUnits();
        return sum;
    }

    /** เพิ่มวิชาใหม่ ถ้ารวมหน่วยกิตไม่เกิน 21 */
    public boolean addSubject(Subject subj) {
        int totalUnits = calcUnitsFromList();     // รวมจากในลิสต์
        if (totalUnits + subj.getUnits() <= 21) {
            subjects.add(subj);
            cnUnit = totalUnits + subj.getUnits(); // อัปเดตฟิลด์ให้เห็นใน Debugger
            return true;
        }
        return false;
    }

    // ไว้ใช้ถอดออก ถ้าต้องการ
    public boolean removeSubjectById(String id) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getId().equalsIgnoreCase(id)) {
                subjects.remove(i);
                cnUnit = calcUnitsFromList();
                return true;
            }
        }
        return false;
    }

    // optional: score
    public void setScore(int score) { this.score = score; }
    public int getScore() { return score; }
}
