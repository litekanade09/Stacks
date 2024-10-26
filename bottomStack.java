import java.util.*;
public class bottomStack {
    public static void pustAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pustAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pustAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.print(s.pop());

        }
    }
}
