import java.util.Scanner;

public class TestDemo {
    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0 || " ".equals(s) ){
            return 0;
        }
        String[] arr = s.split(" ");  //split()——》把一个字符串按照某一字符分割成字符串数组。
        if(arr.length == 0){
            return 0;
        }
        return arr[arr.length-1].length();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ret = lengthOfLastWord(s);
        System.out.println(ret);
    }
}
