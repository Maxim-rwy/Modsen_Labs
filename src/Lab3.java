public class Lab3 {
    public static void Twice(int[] nums) {
        if (nums.length == 0 || nums.length >= 3*Math.pow(10,4)) {
            System.out.println("The array is empty or does not comply with the restriction");
        } else {
            int[] count = new int[nums.length];
            for (int i: nums) {
                if (i <= 3*Math.pow(10,4) && i>= -3*Math.pow(10,4)) {
                    count[i]++;
                } else {
                    System.out.println("The array is incorrect");
                    break;
                }
            }
            for (int i : nums) {
                if (count[i] == 1) {
                    System.out.println(i);
                }
            }
        }
    }


    public static void main(String[] args) {
        Twice(new int[]{4,1,2,1,2});
    }
}
