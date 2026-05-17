import java.util.*;

public class Validparin {

    public static boolean validParinthis(String str){

        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            
            char ch = str.charAt(i);

            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }
            else{

                //)))))) -> opening nahi  then stack me kuhc push nahi hua so satch is full already
                if(s.isEmpty()){
                    return false;
                }
                
                if(
                    (s.peek()=='{'&&ch=='}')||
                    ((s.peek()=='('&&ch==')'))||
                    (s.peek()=='['&&ch==']')

                ){
                    s.pop();
                }
                else{
                    return false;
                }
            }

        }

        if(s.isEmpty()){
            return true;
        }
        else{
          return false;
        }

        
    }

    public static void main(String args[]) {

        System.out.print(validParinthis("((({{{]}}})))"));

    }
}
