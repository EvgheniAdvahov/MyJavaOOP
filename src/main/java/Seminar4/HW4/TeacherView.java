package Seminar4.HW4;

import Seminar4.Teacher;

import java.util.List;

public class TeacherView<T extends Teacher> implements InterfaceTeacherView  {

    @Override
    public void TeacherView(List Teachers) {
        for (Object teacher : Teachers) {
            System.out.println(teacher);
        }
    }
}
