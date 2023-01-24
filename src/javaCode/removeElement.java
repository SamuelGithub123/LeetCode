package javaCode;

public class removeElement {

    public int removeElement(int[] nums, int val) {

        if (nums == null) {
            return 0;
        }

        int counter = 0;

        for (int i = 0, index = 0; i < nums.length; i++, index++) {
            for (int j = index; j < nums.length;) {

                if (nums[j] == val) {
                    j++;
                    index++;
                }
                else {
                    nums[i] = nums[j];
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
