package Seminar4;

import lombok.Data;


public class Teacher extends User{
    private String  objectToTeach;
    private Integer level;

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, String objectToTeach, Integer level) {
        super(name);
        this.objectToTeach = objectToTeach;
        this.level = level;
    }

    public void setObjectToTeach(String objectToTeach) {
        this.objectToTeach = objectToTeach;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return getName()+
                " Teaching='" + objectToTeach + '\'' +
                ", level=" + level +
                '}';
    }
}
