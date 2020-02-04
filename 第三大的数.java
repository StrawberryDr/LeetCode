import java.util.Scanner;

public class solution {
    public static int thirdMax(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(nums.length < 3){
            return Max(nums);
        }
        //对数组中第一大、第二大、第三大的数据进行保存
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        // 数组中是否含有值Integer.MIN_VALUE
        boolean hasMinInteger = false;

        // 遍历数组找出最大值、第二大的值和第三大的值，注意重复值的处理
        for(int num : nums) {
            // 判断数组中是否含有值Integer.MIN_VALUE
            if(!hasMinInteger && num == Integer.MIN_VALUE) {
                hasMinInteger = true;
            }

            if(num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }else if(num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            }else if(num > thirdMax && num != secondMax && num != firstMax) {
                thirdMax = num;
            }
        }
        // 判断thirdMax和secondMax中的值Integer.MIN_VALUE是初始值还是数组中的值
        if(thirdMax == Integer.MIN_VALUE) {
            if(secondMax == Integer.MIN_VALUE) {
                return firstMax;
            }else {
                if(hasMinInteger) {
                    return thirdMax;
                }else {
                    return firstMax;
                }
            }
        }
        return thirdMax;
    }

    public static int Max(int[] nums){
        int max = nums[0];
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for(int i = 0;i < 4;i++){
            nums[i] = scanner.nextInt();
        }
        int ret = thirdMax(nums);
        System.out.println(ret);
    }
}
