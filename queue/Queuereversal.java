import java.util.*;

public class Queuereversal {


    public static void qReverse(Queue<Integer> q){

        Stack<Integer> s1 = new Stack<>();

        int size = q.size();

        for(int i=0;i<size;i++){

            s1.push(q.remove());
        }

        while (!s1.isEmpty()) {

            q.add(s1.pop());
            
        }

    }


    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        qReverse(q);

         while(!q.isEmpty()){
            // System.out.print("okkk");
            System.out.print(" "+ q.peek());
            q.remove();
        }
    }
    
}
