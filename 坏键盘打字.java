import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //输出所有的坏键 & 坏键出现多次只输出一次 & 坏键必须按照输入的顺序进行输出
    //坏键如果是字母--->输出大写
    /*
    * 正常的键：保存  set---HashSet
    * 坏键：遍历正常输入-->每拿到一个字符，检测
    * 是否在set中出现：
    *                出现：正常键
    *                未出现：坏键
    */
    //1.接收用户所给的输入：right/wrong---》将字符转换为大写
    //2.将wrong中的每个字符放到HashSet中
    //3.检测right中的每个字符是否在wrong中出现过--->HashSet--->O(1)
    //  出现：继续读取下一个字符
    //  未出现：如果该字符已经输出过了，则不需要再次输出



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String right = sc.nextLine().toUpperCase();
            String wrong = sc.nextLine().toUpperCase();

            Set<Character> s = new HashSet<>();
            for(int i = 0;i < wrong.length();++i){
                s.add(wrong.charAt(i));
            }

            Set<Character> broken = new HashSet<>();
            for(int i = 0;i < right.length();++i){
                char ch = right.charAt(i);
                //检测是否为坏键
                if(!s.contains(ch)){
                    //检测是否输出过
                    if(broken.add(ch)){
                        System.out.print(ch);
                    }
                }
            }

//            for(Character ch : brokens){
//                System.out.print(ch);
//            }
            System.out.println();
        }
    }
}
