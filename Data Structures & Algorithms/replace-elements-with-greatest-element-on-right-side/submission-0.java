class Solution {
    public int[] replaceElements(int[] arr) {

        for(int i = 0; i < arr.length; i++)
        {
            if(i == arr.length - 1)
            {
                arr[i] = -1;
                return arr;
            }
            int max = 0;
            for(int j = 1 + i; j < arr.length; j++)
            {
                if(arr[j] > max)
                {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        return arr;

        
    }
}