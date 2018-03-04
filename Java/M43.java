class Solution {
    public String multiply(String num1, String num2) {
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] pos = new int[num1.length() + num2.length()];
        for (int i = num1Array.length - 1; i >= 0; i--) {
            for (int j =  num2Array.length - 1; j >= 0; j--) {
                int tmp = (num1Array[i] - '0') * (num2Array[j] - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = tmp + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }

        for (int p : pos) if (!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
