class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++)
        {
            ans[i] = arr[i];
        }
        int j = 0;
        for(int i = n; i < 2*n; i++)
        {
            ans[i] = arr[j];
            j++;
        }
        return ans;
        
    }
}