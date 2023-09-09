package Seminar4.HW4;

import Seminar4.Teacher;

import java.util.List;

public interface InterfaceTeacherView<T extends Teacher> {
    void TeacherView(List<T> Teachers);
}
