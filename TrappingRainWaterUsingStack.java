import java.util.*;
public class TrappingRainWaterUsingStack {
    public static int RainWater(int height[]){
        Stack<Integer> Water = new Stack<>();
        int h = height.length;
        int ans = 0;
        for(int i = 0;i<h;i++){
            while(!Water.isEmpty() && height[Water.peek()] < height[i]){
                int pop_height = height[Water.peek()];
                Water.pop();
                if(Water.isEmpty()){
                    break;
                }
                int dist = i - Water.peek() - 1;
                int min_height = Math.min(height[Water.peek()],height[i]) - pop_height;
                ans += dist * min_height;
            }
            Water.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int height[] =  {  7,0,4,2 ,5 ,0 ,6 ,4 ,0 ,5 };
        System.out.print(RainWater(height));
    }
}
