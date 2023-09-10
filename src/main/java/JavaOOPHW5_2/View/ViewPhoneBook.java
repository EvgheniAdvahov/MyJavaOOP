package JavaOOPHW5_2.View;

public class ViewPhoneBook implements InterfacePhoneBook{

    @Override
    public void viewPhoneBook(String name) {
        System.out.println("We can view "+ name);
    }
}
