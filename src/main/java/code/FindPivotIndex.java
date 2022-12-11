package code;

public class FindPivotIndex {
    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        int rightSum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}