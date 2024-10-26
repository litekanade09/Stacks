import java.util.*;
public class AreainHistogram {
    public static int Area(int arr[]){     //O(n)
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1;i>= 0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next smaller left
        s = new Stack<>();
        for(int i = 0;i< arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = arr.length;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current widht = j-i-1=nsr[i] - nsl[i] - 1
        for(int  i = 0;i<arr.length;i++){
            int height = arr[i];
            int widht = nsr[i] - nsl[i] - 1;
            int currarea = height * widht;
            maxarea = Math.max(currarea,maxarea);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.print(Area(arr));
    }
}
