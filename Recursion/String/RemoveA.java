package Recursion.String;

public class RemoveA {
    public static void main(String[] args) {
        String s = "bababa";
        // System.out.println(remove(s));
        System.out.println(removea(s));
    }

    static String remove(String s) {
        StringBuilder sb = new StringBuilder();
        // removea(s, 0, sb);
        // skipAB(s);
        return sb.toString();
    }

    static void removea(String s, int low, StringBuilder sb) {

        if (s.isEmpty())
            return;

        char c = s.charAt(low);
        if (c == 'a' || c == 'A') {
            removea(s, low + 1, sb);
            // removea(s.substring(1) , sb);
        } else {
            sb.append(c);
            removea(s, low + 1, sb);
        }

    }

    static String removea(String s) {
        if (s.isEmpty())
            return "";

        char c = s.charAt(0);
        if (c == 'a' || c == 'A') {
            return removea(s.substring(1));
        } else {
            String st = c + removea(s.substring(1));
            return st;
        }
    }

    // remove a substringjj
    static String skipAB(String s) {
        if (s.isEmpty())
            return "";

        if (s.startsWith("ab")) {
            return skipAB(s.substring(2));
        } else {
            return s.charAt(0) + skipAB(s.substring(1));
        }
    }

    static String skip(String s) {
        if (s.isEmpty())
            return "";

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAB(s.substring(2));
        } else {
            return s.charAt(0) + skipAB(s.substring(1));
        }
    }
}
