public class Lab2 {
    public static void TwoSum (int[] nums, int target) {
        int sum = 0;
        int[] answer;
        for (int i=0; i<nums.length-1; i++){
            int current = nums[i];
            int nextIter = nums[i+1];
            int nextIndex = i+1;
            sum = current+nextIter;
            if (sum == target){
                System.out.println(i + " " + nextIndex);
            } else {
                sum = 0;
            }
        }
    }

    public static void main(String[] args) {
        TwoSum(new int[]{3,2,4}, 6);
    }
}
