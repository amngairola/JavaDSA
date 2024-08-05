public class Prefix {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Iterate over the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Adjust the prefix length until it matches the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

}
