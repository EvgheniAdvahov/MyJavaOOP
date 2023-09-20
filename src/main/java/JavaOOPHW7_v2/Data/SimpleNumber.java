package JavaOOPHW7_v2.Data;

import JavaOOPHW7_v2.Service.SimpleNumberFormat;

import java.util.List;

public class SimpleNumber extends Number {
    public SimpleNumber(String argument1, String argument2) {
        super(argument1, argument2);
    }

    SimpleNumberFormat simpleNumberFormat = new SimpleNumberFormat();

    @Override
    public String sum(List<String> list) {
        List<Integer> myList = simpleNumberFormat.formatNumber(list);
        int result = myList.get(0) + myList.get(1);
        return String.valueOf(result);
    }

    @Override
    public String multiply(List<String> list) {
        List<Integer> myList = simpleNumberFormat.formatNumber(list);
        int result = myList.get(0) * myList.get(1);
        return String.valueOf(result);
    }

    @Override
    public String devide(List<String> list) {
        List<Integer> myList = simpleNumberFormat.formatNumber(list);
        double result;
        result = (double) myList.get(0) / myList.get(1);
        return String.valueOf(result);
    }


}
