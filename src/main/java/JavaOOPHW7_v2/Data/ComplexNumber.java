package JavaOOPHW7_v2.Data;

import JavaOOPHW7_v2.Service.ComplexNumberFormat;

import java.util.List;

public class ComplexNumber extends Number {

    public ComplexNumber(String argument1, String argument2) {
        super(argument1, argument2);
    }

    ComplexNumberFormat numberFormat = new ComplexNumberFormat();

    @Override
    public String sum(List<String> list) {
        List<Integer> integerList = numberFormat.formatNumber(list);
        int Sum1, Sum2;
        Sum1 = integerList.get(0) + integerList.get(2);
        Sum2 = integerList.get(1) + integerList.get(3);
        if (Sum2 == 1) {
            return String.valueOf(Sum1) + "+i";
        } else if (Sum2 == -1) {
            return String.valueOf(Sum1) + "-i";
        } else if (Sum2 > 1) {
            return String.valueOf(Sum1) + "+" + String.valueOf(Sum2) + "i";
        } else if (Sum2 == 0) {
            return String.valueOf(Sum1);
        } else {
            return String.valueOf(Sum1) + String.valueOf(Sum2) + "i";
        }
    }

    @Override
    public String multiply(List<String> list) {
        List<Integer> integerList = numberFormat.formatNumber(list);
        int sum1, sum2, sum3, sum4;
        sum1 = integerList.get(0) * integerList.get(2);
        sum2 = integerList.get(0) * integerList.get(3);
        sum3 = integerList.get(1) * integerList.get(2);
        sum4 = (integerList.get(1) * integerList.get(3)) * -1;
        if (sum2 + sum3 == 1) {
            return String.valueOf(sum1 + sum4) + "+i";
        } else if (sum2 + sum3 == -1) {
            return String.valueOf(sum1 + sum4) + "-i";
        } else if (sum2 + sum3 == 0) {
            return String.valueOf(sum1 + sum4);
        } else if ((sum2 + sum3) < 0) {
            return String.valueOf(sum1 + sum4) + String.valueOf(sum2 + sum3) + "i";
        } else {
            return String.valueOf(sum1 + sum4) + "+" + String.valueOf(sum2 + sum3) + "i";
        }
    }

    @Override
    public String devide(List<String> list) {
        List<Integer> integerList = numberFormat.formatNumber(list);
        int s1, s2, s3, s4, s5, s6;
        s1 = integerList.get(0) * integerList.get(2);
        s2 = integerList.get(0) * (integerList.get(3) * -1);
        s3 = integerList.get(1) * integerList.get(2);
        s4 = integerList.get(1) * integerList.get(3);
        s5 = integerList.get(2) * integerList.get(2);
        s6 = integerList.get(3) * integerList.get(3);
        if (s2 + s3 == 1) {
            return String.valueOf(1 + s4) + "+i/" + String.valueOf(s5 + s6);
        } else if (s2 + s3 == -1) {
            return String.valueOf(s1 + s4) + "-i/" + String.valueOf(s5 + s6);
        } else if (s2 + s3 == 0) {
            return String.valueOf(s1 + s4) + "/" + String.valueOf(s5 + s6);
        } else if ((s2 + s3) < 0) {
            return String.valueOf(s1 + s4) + String.valueOf(s2 + s3) + "i/" + String.valueOf(s5 + s6);
        } else {
            return String.valueOf(s1 + s4) + "+" + String.valueOf(s2 + s3) + "i/" + String.valueOf(s5 + s6);
        }
    }
}
