import java.util.Stack;

public class solution {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = backChar(S);
        Stack<Character> stackT = backChar(T);
        return stackS.equals(stackT);
    }
    public static Stack<Character> backChar(String array){
        Stack<Character> stackS = new Stack<>();
        for(int i = 0;i < array.length();i++) {
            if (!stackS.isEmpty() && array.charAt(i) == '#') {
                stackS.pop();
            } else if(stackS.isEmpty() && array.charAt(i) == '#'){
                continue;
            }else {
                stackS.push(array.charAt(i));
            }
        }
        return stackS;
    }


    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s,t));
    }
}
