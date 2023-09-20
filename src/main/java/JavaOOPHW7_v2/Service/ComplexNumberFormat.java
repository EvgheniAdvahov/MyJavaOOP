package JavaOOPHW7_v2.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexNumberFormat implements IFormat {

    @Override
    public List<Integer> formatNumber(List<String> list) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).replace("+", " ")
                    .replace("-", " -");
            String[] result = str.split(" ");
            for (int j = 0; j < result.length; j++) {
                if (result[j].equals("-i")) {
                    integerList.add(-1);
                } else if (result[j].contains("i") && result[j].length() > 1) {
                    result[j] = result[j].replace("i", "");
                    integerList.add(Integer.parseInt(result[j]));
                } else if (result[j].contains("i") && result[j].length() == 1) {
                    integerList.add(1);
                } else {
                    integerList.add(Integer.parseInt(result[j]));
                }
            }
        }
        return integerList;
    }
}
