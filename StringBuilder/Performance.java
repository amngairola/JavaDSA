package StringBuilder;

//javac Performance.java
// java Performance.java
public class Performance {
    public static void main(String[] args) {
        String s = "  ";
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            System.out.println(c);
            s += c;
        }
        System.out.println(s);
    }
}
