import java.util.*;

public class solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ;i < tokens.length;i++){
            String str = tokens[i];
            if (str.length() == 1){
                char ch = str.charAt(0);
                if (ch-'0' >= 0 && ch - '0' <= 9 ){
                    Integer a = Integer.valueOf(str);
                    stack.push(a);
                }
                else{
                    if (stack.size() < 2)
                        return 0;
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    switch(ch){
                        case '+':
                            stack.push(num1 + num2);
                            break;
                        case '-':
                            stack.push(num1 - num2);
                            break;
                        case '*':
                            stack.push(num1 * num2);
                            break;
                        case '/':
                            stack.push(num1 / num2);
                            break;
                    }

                }
            }else{
                int n = Integer.valueOf(str);
                stack.push(n);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] str = new String[]{"2","1","+","3","*"};
        System.out.println(evalRPN(str));
    }
}
