package javaCode;

public class searchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        if (nums == null) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
