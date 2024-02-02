package BasicRecursion;

//javac BasicRecursion.java
// java BasicRecursion.java
public class BasicRecursion {
    static int count = 0;

    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        if (count < 3) {
            count++;
            sum();
        }
        return count;
    }

}
