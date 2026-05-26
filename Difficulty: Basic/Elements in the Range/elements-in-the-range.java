class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=start && arr[i]<=end)
            cnt++;
        }
        
        int tot_elem=end-start+1;
        
        if(tot_elem==cnt)
        return true;
        else
        return false;
    }
}