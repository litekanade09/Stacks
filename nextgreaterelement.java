import java.util.Stack;
public class nextgreaterelement{
// NEXT GRAETER ELEMNET RIGHTNN
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s =new Stack<>();
        int nextgerater[] = new int[arr.length];

        for(int i = arr.length - 1;i>=0 ;i--){
            //1 while
           while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
               s.pop();
           }
            //2 if else
            if(s.isEmpty()){
                nextgerater[i] = -1;
            }else{
                nextgerater[i] = arr[s.peek()];
            }
            //3 push in s
            s.push(i);


        }
        for(int i = 0;i<nextgerater.length;i++){
            System.out.print(nextgerater[i] + " ");
        }
        System.out.println();
    }
}
//next greater left
//for(int i = 0;i >= arr.length; i--)

//next smaller right
//while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//               s.pop();
//           }
//nextsmaller left
//for(int i = 0;i >= arr.length; i--)
//while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//              s.pop();
//           }

