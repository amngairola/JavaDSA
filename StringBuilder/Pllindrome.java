package StringBuilder;

public class Pllindrome {
    public static void main(String[] args) {
        String str = "abcdcbag";
        StringBuilder sb = new StringBuilder(str);
        StringBuilder s = new StringBuilder(str).reverse();
        if (s.toString().equals(sb.toString())) {
            System.out.println("yes");

        } else {
            System.out.println("No");
        }
    }

}
