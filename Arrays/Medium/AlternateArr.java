package Arrays.Medium;

//https://www.naukri.com/code360/problems/alternate-numbers_6783445?leftPanelTab=0
public class AlternateArr {
    public static void main(String[] args) {

    }

    public static int[] alternateNumbers(int[] a) {

        int[] arr = new int[a.length];

        int pInd = 0;
        int nInd = 1;

        for (int i = 0; i < arr.length; i++) {
            if (a[i] < 0) {
                arr[nInd] = a[i];
                nInd += 2;
            } else {
                arr[pInd] = a[i];
                pInd += 2;
            }
        }

        return arr;
    }

}
