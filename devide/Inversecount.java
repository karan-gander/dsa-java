public class Inversecount {

    public static int mergeSort(int arr[], int si, int ei) {

        if (si < ei) {

            int mid = si + (ei - si) / 2;

            int left = mergeSort(arr, si, mid);
            int right = mergeSort(arr, mid + 1, ei);

            int inverseCount = merge(arr, si, mid, ei);

            return left+right+inverseCount;
        }
        return 0;
    }

    public static int merge(int arr[], int si, int mid, int ei) {

        int i = si;
        int j = mid + 1;
        int k = 0;
        int inCount = 0;
        int temp[] = new int[ei - si + 1]; // temp arr

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inCount+=(mid-i+1);
            }
        }

        while (i<=mid) {
            temp[k++] = arr[i++];
            
        }
        while (j<=ei) {
            temp[k++] = arr[j++];
            
        }

         for (k = 0, i = si; k < temp.length; k++,i++) {

            arr[i] = temp[k];

        }
        return inCount;

    }

    public static void main(String args[]) {
        int arr[]={6,3,5,2,7};
        int res = mergeSort(arr, 0, arr.length-1);
        System.out.println(res);
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
