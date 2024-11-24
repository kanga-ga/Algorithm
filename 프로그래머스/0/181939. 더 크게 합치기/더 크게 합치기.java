class Solution {
    public int solution(int a, int b) {
        String c = String.valueOf(a)+String.valueOf(b);
        String d = String.valueOf(b)+String.valueOf(a);
        int e = Math.max(Integer.parseInt(c),Integer.parseInt(d));
        return e;
    }
}