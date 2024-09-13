class Solution {
    public String convertToTitle(int c) {
        int r;
        char q;
        StringBuilder b = new StringBuilder();
        while (c != 0) {
            r = (c-1)%26;
            q = (char)(r+65);
            b.append(q);
            c = (c - 1) / 26;
        }
        return b.reverse().toString();
    }
}
