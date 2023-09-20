package JavaOOPHW7_v2.Data;

import java.util.List;

/**
 * Буква O
 * Дочерние классы только расширяют функционал.
 * У дочерних классов своя реализация методов sum, multiply, devide.
 */

public abstract class Number {
    String argument1;
    String argument2;

    public Number(String argument1, String argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    public abstract String sum(List<String> list);

    public abstract String multiply(List<String> list);

    public abstract String devide(List<String> list);

}
