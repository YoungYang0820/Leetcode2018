class Solution {
    public boolean rotateString(String A, String B) {
        return (B + B).indexOf(A) > -1;
    }
}
