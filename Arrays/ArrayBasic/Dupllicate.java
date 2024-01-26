
// problem : https://leetcode.com/problems/find-the-duplicate-number/description/
public class Dupllicate {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int r = findDuplicate(nums);
        System.out.println(r);
    }
    public static int findDuplicate(int[] nums) {
         int i = 0;
         while(i< nums.length){
            if(nums[i] != nums[nums[i]-1]){
            swap(nums , i , nums[i]-1);
              }else{
                i++;
              }
         } 

        int ans = findD(nums);

        return ans;
    }

   static void swap(int[] arr , int a , int b){
           int temp = arr[a];
           arr[a] = arr[b];
           arr[b] = temp;
    }

    static int findD(int[] arr ){
        int D = -1;
        for(int i = 0  ; i<arr.length ; i++){
         if(arr[i] <= i ){
            D = arr[i];
         }
        }

        return D;
    }
}
