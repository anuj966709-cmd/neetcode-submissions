class Solution {
    public int maxProductDifference(int[] arr) {
        int max = 0;
        int smax = 0;
        int min = 10001;
        int smin = 10001;
        int count = 0;
        int scount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                count = i;
            }
            
            if(arr[i] < min)
            {
                min = arr[i];
                scount = i;
            }  
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > smax && arr[i] <= max && i != count)
            smax = arr[i];
            if(arr[i] < smin && arr[i] >= min && i != scount)
            smin = arr[i];
        }
        return (max*smax) - (min*smin); 
    }
}