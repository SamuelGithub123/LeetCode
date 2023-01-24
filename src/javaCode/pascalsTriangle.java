package javaCode;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        if (numRows <= 0) {
            return null;
        }

        int counter = 2;
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 1) {
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            result.add(newList);
            return result;
        }

        if (numRows == 2) {
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            List<Integer> newList2 = new ArrayList<>();
            newList2.add(1);
            newList2.add(1);
            result.add(newList);
            result.add(newList2);
            return result;
        }

        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        result.add(newList);

        List<Integer> newList3 = new ArrayList<>();
        newList3.add(1);
        newList3.add(1);
        result.add(newList3);

        return helper(newList3, result, counter, numRows);

    }

    private List<List<Integer>> helper(List<Integer> old, List<List<Integer>> result, int counter, int numRows) {

        if (counter >= numRows) {
            return result;
        }

        List<Integer> newList2 = new ArrayList<>();

        newList2.add(0, 1);
        newList2.add(1);


        for (int i = 1; i < counter; i++) {
            newList2.add(i, old.get(i - 1) + old.get(i));

        }

        result.add(newList2);
        counter++;

        return helper(newList2, result, counter, numRows);
    }
}
