package Cyclicsort;
public class CyclicSort {

    public static void main(String[] args) {
         int[] arr = {3,5,2,1,4};
         cyclesort(arr , arr.length);
         print(arr,arr.length );

    }
   
    static void cyclesort(int[] arr , int n){
        int i = 0;
        while(i<n-1){
         if(arr[i] == i+1){ //i+1 is currect index , we are checking that element at the i index is  equal to i-1
            i++;
         }else{
            swap(arr , i , arr[i]-1); 
         }
        }
    }
    static void swap(int[] arr , int element , int index){
        int temp = arr[element];
        arr[element] = arr[index];
        arr[index] = temp;
    }
    static void print(int[] arr , int n){
        for(int i = 0;i<=n-1 ; i++){
            System.out.println(arr[i]);
        }
    }


}

// wrost case :
//  total_swaps = n-1;
//  loop_runs = n times;

//  wrost case = total_swap + loop_runs
//               (n-1)+n;
//               (2n-1)
//               0(n) //we ignore constants 