package Seminar4.HW4;

import Seminar4.Teacher;

import java.util.Comparator;

public class TeacherComarator<T extends Teacher> implements Comparator<T> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getLevel() - o2.getLevel();
    }
}
