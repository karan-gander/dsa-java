public class Subarray{



    public static void main(String[] args) {
        
        int nums[]= {10,45,44,12,45,13,66};

        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){

                for(int k=i ;k<=j;k++){

                    System.out.print(nums[k]+ " ");
                }
            System.out.println();
            }
            System.out.println();
        }

        
    }
}