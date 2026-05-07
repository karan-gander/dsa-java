import java.util.*;

public class PushBottom {

    public static void pushBottom(Stack<Integer> s, int data) {

        

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }



    

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        
        pushBottom(s,7);

        while (!s.isEmpty()) {

            System.out.print(s.peek());
            s.pop();
            
        }
    }
}
