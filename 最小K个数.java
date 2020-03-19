import java.util.PriorityQueue;

public class solution {
    public static int[] smallestK(int[] arr, int k) {
        if (null == arr || k <= 0) {
            return new int[0];
        }
        PriorityQueue<Integer> num = new PriorityQueue<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            num.offer(arr[i]);
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = num.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,2,6,7};
        int[] ret = smallestK(arr,4);
        for (int x:ret) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
