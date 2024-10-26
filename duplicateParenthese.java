import java.util.*;
public class duplicateParenthese {
    public static boolean Duplicate(String str2){ // O(n)
        Stack<Character> s = new Stack<>();
        for(int i = 0;i < str2.length();i++){
            //opening.operand,operteor
            char ch = str2.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while( s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a + b))";
        String str2 = "(a - b)";
        System.out.print(Duplicate(str2));
    }
}
