import java.util.Scanner;

public class TestDemo {
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        if(target < nums[0]){
            return 0;
        }
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        int n = 0;
        while (n < nums.length && nums[n] < target){
            n++;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0;i < 4;i++){
            arr[i] = sc.nextInt();
        }
        //int target = sc.nextInt();
        int ret = searchInsert(arr,7);
        System.out.println(ret);
    }
}
