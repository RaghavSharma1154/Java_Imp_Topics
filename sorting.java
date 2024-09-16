class sorting{
    // public static void main(String args[]){
    //     int[] arr = {7,8,3,1,2};
    //     int n = arr.length;

        //Bubble sort -->
        //loop for passes-->
        // for(int i=0;i<n;i++){
        //     //loop for iterations and swapping -->
        //     boolean flag = false;
        //     for(int j=0;j<n-1;j++){
        //         //condition for swapping -->
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             flag = true;
        //         }
        //     }
        //     if(flag == false){
        //         break;
        //     }
        // }

        //selection sort -->
        //outer loop
        // for(int i=0;i<n;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[smallest] > arr[j]){
        //             smallest = j;
        //         }
        //     }
        //     //swapping -->
        //     int temp = arr[i];
        //     arr[i] = arr[smallest];
        //     arr[smallest] = temp;
        // }

        //Insertion Sort -->
    //     for(int i = 1 ; i<n;i++){
    //         int current = arr[i];
    //         int j = i-1;
    //         while(j>=0 && current<arr[j]){
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j+1] = current;
    //     }
    //     printArray(arr);
    // }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    // public static void merge(int arr[],int si,int mid , int ei){
    //     int merged[] = new int[ei - si +1];

    //     int idx1 = si;
    //     int idx2 = mid + 1;
    //     int x = 0;
    //     while (idx1 <= mid && idx2 <= ei) {
    //         if(arr[idx1] <= arr[idx2]){
    //             merged[x++] = arr[idx1++];
    //         }else{
    //             merged[x++] = arr[idx2++];
    //         }
    //     }
    //     while(idx1 <= mid){
    //         merged[x++] = arr[idx1++];
    //     }
    //     while(idx2 <= ei){
    //         merged[x++] = arr[idx2++];
    //     }

    //     //copy all element from merged array to original array arr-->
    //     for(int i=0,j=si;i<merged.length;i++,j++){
    //         arr[j] = merged[i];
    //     }
    // }
    // public static void divide(int[] arr,int si,int ei){
    //     if(si >= ei){
    //         return;
    //     }
    //     int mid = si + (ei - si)/ 2;
    //     divide(arr,si,mid);
    //     divide(arr,mid+1,ei);
    //     merge(arr,si,mid,ei);
    // }
    // public static void main(String args[]){
    //     int arr[] = {6,3,9,5,2,8,7,1};
    //     int n = arr.length;
    //     divide(arr, 0, n-1);
    //     printArray(arr);
    // }

    //Merge Sort -->
    // public static void merge(int[] arr,int si,int mid,int ei){
    //     int idx1 = si;
    //     int idx2 = mid+1;
    //     int[] merged = new int[ei-si+1];
    //     int x = 0;
    //     while(idx1 <= mid && idx2 <= ei){
    //         if(arr[idx1] <= arr[idx2]){
    //             merged[x++] = arr[idx1++];
    //         }else{
    //             merged[x++] = arr[idx2++];
    //         }
    //     }
    //     while(idx1 <= mid){
    //         merged[x++] = arr[idx1++];
    //     } 
    //     while(idx2 <= ei){
    //         merged[x++] = arr[idx2++];
    //     } 
    //     //copy the elements from merged array to original array arr-->
    //     for(int i=0,j=si;i<merged.length;i++,j++){
    //         arr[j] = merged[i];
    //     }
    // }
    // public static void divide(int[] arr,int si ,int ei){
    //     if(si >= ei){
    //         return;
    //     }
    //     int mid = si + (ei -si)/2;
    //     divide(arr, si, mid);
    //     divide(arr, mid+1, ei);
    //     merge(arr,si,mid,ei);
    // }
    // public static void main(String args[]){
    //     int[] arr = {6,3,9,5,2,8,7,1};
    //     int n = arr.length;
    //     divide(arr, 0, n-1);
    //     printArray(arr);
    // }

    //Quick Sort -->
    // public static int partition(int[] arr,int low,int high){
    //     int pivot = arr[high];
    //     int i = low - 1;
    //     for(int j = low;j<high;j++){
    //         if(arr[j] < pivot){
    //             i++;
    //             //swap
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     i++;
    //     //swap pivot -->
    //     int temp = arr[i];
    //     arr[i] = pivot;
    //     arr[high] = temp;
    //     return i;
    // }
    // public static void quickSort(int[] arr,int low,int high){
    //     if(low < high){
    //         int pivot = partition(arr,low,high);
    //         quickSort(arr, low, pivot-1);
    //         quickSort(arr, pivot+1, high);
    //     }
    // }
    // public static void main(String args[]){
    //     int[] arr = {6,3,9,5,2,11,8};
    //     int n = arr.length;
    //     quickSort(arr, 0, n-1);
    //     printArray(arr);
    // }

}