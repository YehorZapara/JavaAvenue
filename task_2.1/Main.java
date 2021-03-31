public class Main {
    public static void main(String[] args) {
        String[] nums = {"Мама","Мыла","Раму"};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    System.out.println(nums[i] + nums[j]  + nums[k]);
                }
            }
        }
    }
}
