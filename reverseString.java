import java.util.*;
public class reverseString {
    public static void reverse(Stack<String> s,String data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        String top = s.pop();
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        s.push("e");

        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
