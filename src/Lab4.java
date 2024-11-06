public class Lab4 {
    public static void Twice (int[] nums){
        boolean answer=false;
        int[] count = new int[256];
        for (int i : nums) {
            count[i]++;
        }

        for (int i : nums) {
            if (count[i] == 2) {
                answer = true;
            } else {
                answer = false;
            }
        }
        System.out.println(answer);
    }


    public static void main(String[] args) {
        Twice(new int[]{1,1,1,3,3,4,3,2,4,2});
    }
}
