class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i < details.length; i++)
        {
            if((int)details[i].charAt(11) == 54 && (int)details[i].charAt(12) != 48)
            count++;
            if((int)details[i].charAt(11) > 54)
            count++;
        }
        return count;
        
    }
}