class Lab5 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }



public static void main(String[] args) {
        Lab5 solution = new Lab5();
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 7;
        System.out.println("Output: " + solution.searchInsert(nums1, target1));
    }
}
