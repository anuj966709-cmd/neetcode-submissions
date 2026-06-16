class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int j = 1;
        int sum = 0;
        while(j < s.length())
        {
            int x = (int)s.charAt(j) - (int)s.charAt(i);
            if(x < 0)
            x = x*(-1);
            sum = sum + x;
            i++;
            j++;
        }
        return sum;
        
    }
}