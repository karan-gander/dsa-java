
public class Maxsubarrayprefix {

    public static void maxsubarraysum(int array[]) {

        int prefixarray[] = new int[array.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        prefixarray[0] = array[0];

        for (int i = 1; i < array.length; i++) {

            prefixarray[i] = prefixarray[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            int start=i;
            for (int j = i; j < array.length; j++) {
                int end=j;
                currSum=i==0?prefixarray[end]:prefixarray[end]-prefixarray[start-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }

            }
        }
        System.out.print(maxSum);

    }


    public static void main(String[] args) {
            int num[]={2,4,-5,4,2,1};
            maxsubarraysum(num);
    }

}
