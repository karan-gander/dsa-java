class Solution{

    public static boolean isPalindrome(int x){
        int originalVal = x;
        if(x<0) return false;

        int reverseNum =0;

        while(x>0){
            
            int reminder = x%10;
             reverseNum = (reverseNum*10)+reminder;
            x = x/10;
            // System.out.print("o");


        }
        System.out.print(reverseNum);
        System.out.print(x);
        if(originalVal==reverseNum) return true;
        return false;
    }

    public static void main(String args[]){

        System.out.print(isPalindrome(121));
        // int num=121;
        // System.out.print(121/10);

        // num/=10;
        // num/=10;
        // num/=10;

        // System.out.print(num);
    }
}