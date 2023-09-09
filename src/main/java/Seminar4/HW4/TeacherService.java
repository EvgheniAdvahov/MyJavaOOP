package Seminar4.HW4;

import Seminar4.Teacher;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeacherService extends Teacher implements InterfaceTeacherService {
    List<Teacher> myTeacherList = new ArrayList<>();
    public TeacherService(String name) {
        super(name);
    }

    public TeacherService(String name, String objectToTeach, Integer level) {
        super(name, objectToTeach, level);
    }


    @Override
    public List<Teacher> viewAllTeachers() {
        return myTeacherList;
    }

    @Override
    public Teacher createTeacher(String name, String teach, Integer level) {
        Teacher teacher = new Teacher(name,teach,level);
        myTeacherList.add(teacher);
        return teacher;
    }

    @Override
    public Teacher edtitTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input name of the Teacher for editing");
        String userInput = scanner.next();
        for (Teacher teacher : myTeacherList) {
            System.out.println(teacher.getName());
            if(teacher.getName().equals(userInput)){
                System.out.println("Type 1 for name change \n" +
                                    "Type 2 for object change \n" +
                                    "Type 3 for level change" );
                userInput = scanner.next();
                if (userInput.equals("1")){
                    System.out.println("Type name for change: ");
                    userInput = scanner.next();
                    teacher.setName(userInput);
                }
                else if (userInput.equals("2")){
                    System.out.println("Type object for change: ");
                    userInput = scanner.next();
                    teacher.setObjectToTeach(userInput);
                } else if (userInput.equals("3")){
                    System.out.println("Type level for change: ");
                    Scanner scanner2 = new Scanner(System.in);
                    Integer userInput2 = Integer.valueOf(scanner2.next());
                    teacher.setLevel(userInput2);
                }

            }
        }
        System.out.println(myTeacherList);
        return null;
    }
}
