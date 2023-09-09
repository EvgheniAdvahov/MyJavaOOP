package Seminar4;

import Seminar4.HW4.TeacherComarator;
import Seminar4.HW4.TeacherService;
import Seminar4.HW4.TeacherView;
import Seminar4.Task2.StudentService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService("ServiceFoTeachers");
        teacherService.createTeacher("Maxim", "Fizic",1);
        teacherService.createTeacher("Irina", "Python",2);
        teacherService.createTeacher("Sabina", "Java",3);
        System.out.println(teacherService.viewAllTeachers());
        TeacherView<Teacher> teacherList = new TeacherView<>();
        teacherList.TeacherView(teacherService.viewAllTeachers());
        teacherService.edtitTeacher();
        teacherList.TeacherView(teacherService.viewAllTeachers());


    }
}
