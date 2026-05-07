import java.util.*;
public class NextGrater {

    public static void main(String args[]){

        int arr[] = {7,9,2,1,10};

        int nextGreat[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){

            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreat[i]= -1;

            }
            else{
                nextGreat[i]=arr[s.peek()];

            }
            s.push(i);
        }

        for(int i=0;i<nextGreat.length;i++){
            System.out.print(nextGreat[i]+ " ");
        }

        

    }
    
}
