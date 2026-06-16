class Solution {
    void swap(int x,int y,int arr[])
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    void pushZerosToEnd(int[] arr) {
        // code here
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                swap(s,i,arr);
                s++;
            }
        }
    }
}