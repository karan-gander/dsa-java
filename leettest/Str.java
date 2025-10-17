public class Str {


    public static boolean isValid(String s){
         for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)==s.charAt(i-1)){
                return true;
            }
        }
        return false;
    }
     
    public static void main(String args[]){

        isValid("{}");
    }
}