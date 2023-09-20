package JavaOOPHW7_v2.Data;

public class NumberFactory {
    String regex = "\\d+";

    public Number createNumber(String arg1, String arg2) {
        if (arg1.contains("i") && arg2.contains("i")) {
            return new ComplexNumber(arg1, arg2);
        } else if (arg1.matches(regex) && arg2.matches(regex)) {
            return new SimpleNumber(arg1, arg2);
        } else {
            throw new RuntimeException("Неправильный ввод числа");
        }
    }
}
