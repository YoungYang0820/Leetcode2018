public class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int l = s.length();
        for (int i = 0; i < l / 2; i++)
        {
            char t = c[i];
            c[i] = c[l - i - 1];
            c[l - i - 1] = t;
    }
    return new String(c);
    }
}
