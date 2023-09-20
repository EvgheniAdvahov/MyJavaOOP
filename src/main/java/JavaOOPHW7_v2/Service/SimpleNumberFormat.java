package JavaOOPHW7_v2.Service;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumberFormat implements IFormat {

    @Override
    public List<Integer> formatNumber(List<String> list) {
        List<Integer> myList = new ArrayList<>();
        myList.add(Integer.parseInt(list.get(0)));
        myList.add(Integer.parseInt(list.get(1)));
        return myList;
    }
}
