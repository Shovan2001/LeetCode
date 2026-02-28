class Solution {
    void swap(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    void pushZerosToEnd(int[] arr) {
        // code here
        int last_non_zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                swap(arr,i,last_non_zero);
                last_non_zero++;
            }
        }
        
        // return arr;
    }
}