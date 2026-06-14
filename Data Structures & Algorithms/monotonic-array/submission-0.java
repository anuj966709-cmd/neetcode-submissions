class Solution {
    public boolean isMonotonic(int[] arr) {
        int i = 0;
        int j = 1;
        boolean flag = true;
        if(arr[i] <= arr[j])
        flag = false;
        if(flag == false)
        {
            while(j < arr.length)
            {
                if(arr[i] <= arr[j])
                {
                    i++;
                    j++;
                }
                else
                return false;
            }
        }
        else
        {
            while(j < arr.length)
            {
                if(arr[i] >= arr[j])
                {
                    i++;
                    j++;
                }
                else
                return false;
            }
        }
        return true;
         
    }
}