package javaCode;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle_II {

    public List<Integer> getRow(int rowIndex) {

        if (rowIndex < 0) {
            return null;
        }

        int counter = 1;
        List<Integer> result = new ArrayList<>();

        if (rowIndex == 0) {
            result.add(1);
            return result;
        }

        if (rowIndex == 1) {
            result.add(1);
            result.add(1);
            return result;
        }

        List<List<Integer>> result1 = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        result1.add(newList);

        List<Integer> newList3 = new ArrayList<>();
        newList3.add(1);
        newList3.add(1);
        result1.add(newList3);

        return helper(newList3, result1, counter, rowIndex);

    }

    private List<Integer> helper(List<Integer> old, List<List<Integer>> result, int counter, int rowIndex) {

        if (counter == rowIndex) {
            return result.get(rowIndex);
        }

        List<Integer> newList2 = new ArrayList<>();

        newList2.add(0, 1);
        newList2.add(1);


        for (int i = 1; i < counter + 1; i++) {
            newList2.add(i, old.get(i - 1) + old.get(i));

        }

        result.add(newList2);
        counter++;

        return helper(newList2, result, counter, rowIndex);
    }


    public static void main(String[] args) {

        pascalsTriangle_II solution = new pascalsTriangle_II();
        System.out.println(solution.getRow(2));
    }

}
