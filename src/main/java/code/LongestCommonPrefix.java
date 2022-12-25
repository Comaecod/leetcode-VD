package code;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String s = prefix.longestCommonPrefix(new String[]{"vishnu", "vish", "visa"});
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
