package codecool.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {


    public List<Integer> sort(List<Integer> list) {

        Integer pivot = null;
        List<Integer> less = null;
        List<Integer> greater = null;

        if (list.size() <= 1) {
            return list;
        } else {
           pivot = list.get(0);
           less = getLess(list.subList(1,list.size()), pivot);
           greater = getGreater(list.subList(1,list.size()), pivot);
           return combine(sort(less), sort(greater), pivot);
        }
    }

    private List<Integer> combine(List<Integer> less, List<Integer> greater,Integer pivot) {
        List<Integer> all = new ArrayList<>();
        all.addAll(less);
        all.add(pivot);
        all.addAll(greater);

        return all;
    }

    private List<Integer> getGreater(List<Integer> list, int pivot) {
        List<Integer> greater = new ArrayList<>();

        for (int number : list) {
            if (number > pivot) {
                greater.add(number);
            }
        }

        return greater;
    }

    private List<Integer> getLess(List<Integer> list, int pivot) {
        List<Integer> less = new ArrayList<>();

        for (int number : list) {
            if (number <= pivot) {
                less.add(number);
            }
        }
        return less;
    }
}
