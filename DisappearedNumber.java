import java.util.List;

// problem link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class DisappearedNumber {
    public static void main(String[] args) {
        int[] nums = {2,2};
        List<Integer> r =  findDisappearedNumbers(nums);
         for(int ele : r){
            System.out.println(ele);
         }
    }
    
    static List<Integer> findDisappearedNumbers(int[] nums){
        sort(nums);
       
        List<Integer>  list = FindMissing(nums);
        return list;
     }

    static void sort (int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != arr[arr[i]-1]){
                swap(arr, i  ,arr[i]-1);
            }else{
                i++;

            }

        }
    }
    static void swap(int[] arr , int i , int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    
    static List<Integer>  FindMissing(int[] arr){
        List<Integer> disappearedNumbers = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            if (arr[i] != i + 1) {
                disappearedNumbers.add(i + 1);
            }
          i++;
        }

        return disappearedNumbers;
    }
   

}


