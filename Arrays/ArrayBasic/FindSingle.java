public class FindSingle {
    // https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
    }

    public static int getSingleElement(int[] arr) {
        // Write your code here.
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                ans = arr[i];
                break;
            }
        }

        return ans;
    }
}
