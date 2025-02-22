class Solution {
    public int[] getConcatenation(int[] num) {
        int n = num.length;
        int [] ans = new int[2 * n];
        for (int i=0; i<n; i++) {
            ans[i] = num[i];
            ans[i+n] = num[i];
        } 
        return ans;
    }
}