package Seminar4.HW4;

import Seminar4.Teacher;

import java.util.List;

public interface InterfaceTeacherService<Teacher> {

    List<Teacher> viewAllTeachers();
    Teacher createTeacher(String name, String teach,Integer level);

    Teacher edtitTeacher();

}
