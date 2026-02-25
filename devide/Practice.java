package devide;

public class Practice {

    public static void mergeSort(String array[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = si + (ei + si) / 2;
        mergeSort(array, si, mid); // For left
        mergeSort(array, mid + 1, ei); // For left

        merge(array, si, ei, mid);

    }

    public static void merge(String array[], int si, int ei, int mid) {

        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
           
            if (array[i].charAt(i) < array[j].charAt(i)) {
                temp[k] = array[i++].charAt(i);
            } else {
                temp[k] = array[j++].charAt(j);
            }
            k++;
        }


        while(i<=mid){
            temp[k++] = array[i++].charAt(i);
        }
        while(j<=ei){
            temp[k++] = array[j++].charAt(j);
        }

        // for( k=0,i=si;k<=temp.length;k++,i++){
        //     array[i]= (int)temp[k];
        // }
    }


    public static int majorElement(int arr[],int si,int ei){
            int cand=-1;
            int vote=0;
        for(int i=si;i<ei;i++){

            if(vote==0){
                cand=arr[i];
                vote=1;
            }
            else{

                if(cand==arr[i]){
                    vote++;
                }
                else{
                    vote--;
                }
            }
        }
        if(cand>=-1){
            return cand;
        }
        return -1;
    }


    public static void main(String args[]) {
        // int ch = 'b';
        // System.out.print(ch);
        // String arr[] = { "sun", "earth", "mars", "mercury"};
        // mergeSort(arr, 0, arr.length-1);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }

        int arr[]={3,2,3};

        int res = majorElement(arr, 0, arr.length);
        System.out.print(res);
        // System.out.print("okkkk");
        



    }

}
