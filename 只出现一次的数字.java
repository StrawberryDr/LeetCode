import java.util.HashSet;
import java.util.Set;

public class solution {
//    public static int singleNumber(int[] nums) {
//        int ret = 0;
//        for(int i = 0;i < nums.length;i++){
//            ret ^= nums[i];
//        }
//        return ret;
//    }

    public static int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0;i < nums.length;++i){
            if(!s.add(nums[i])){
                s.remove(nums[i]);
            }
        }
        return ;
    }

    public static void main(String[] args) {
        int[] array = {4,1,3,1,3};
        singleNumber(array);
    }
}
