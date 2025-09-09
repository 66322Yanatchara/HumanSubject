package Personel;

import Item.Subject;

import java.util.ArrayList;

public class Student extends Person {
    private int score;
    ArrayList<Subject> subjects = new ArrayList<Subject>();

    public boolean addSubject(Subject subj) {
        int totalUnits = 0;
        for (Subject s : subjects) {
            totalUnits += s.getUnit();
        }

        if (totalUnits + subj.getUnit() <= 21) {
            subjects.add(subj);
            return true;
        } else {
            return false;
        }
    }



//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public String calculateGrade() {
//        if (score >= 80) return "A";
//        else if (score >= 70) return "B";
//        else if (score >= 60) return "C";
//        else if (score >= 50) return "D";
//        else return "F";
//    }
}
