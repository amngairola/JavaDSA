package Numbers;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
