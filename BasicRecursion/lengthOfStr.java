package BasicRecursion;

// javac  lengthOfStr.java

public class lengthOfStr {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(len(s));

    }

    static int len(String s) {
        if (s.equals("")) {
            return 0;
        }

        return len(s.substring(1)) + 1;
    }
}
