package Seminar4.Task2;

import Seminar4.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> users);
}
