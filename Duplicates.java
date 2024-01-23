import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        int [] arr = {2,2};
       findDuplicates(arr);
    //    for(int i = 0; i<arr.length; i++){
    //     System.out.println(arr[i]);
    //  }
       ArrayList<Integer> r =  ans(arr);
     for(int i = 0; i<r.size(); i++){
        System.out.println(r.get(i));
     }
    }

   static  public void findDuplicates(int[] nums) {
         int i = 0;
         while (i<nums.length) {
             if(nums[i]!=nums[nums[i] -1]){ 
                 swap(nums , i , nums[i]-1);
             }else{
                i++;
             }
         }
    }

    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
 }

 static public ArrayList<Integer> ans(int[] nums) {
    int i = 0;
    ArrayList<Integer> myArray = new ArrayList<>();
     while (i<nums.length) {
        
        if( nums[i] != i+1  ){ 
            myArray.add(nums[i]);
            }i++;
   }
      return myArray;
 }
}
