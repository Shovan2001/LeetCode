class Solution {
  public:
    int findMinPos(vector<int>& arr) 
    {
        int l=0,h=arr.size()-1;

        while(l<h)
        {
            int mid=l+(h-l)/2;

            if(arr[mid]>arr[h])
            l=mid+1;
            else if(arr[mid]<arr[h])
            h=mid;
            else
            h--;
        }
        return l;
    }
    int modBinSearch(vector<int>& arr,int l,int h,int x)
    {
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            if(arr[mid]<x)
            l=mid+1;
            
            else
            h=mid;
        }
        return l;
    }
    int search(vector<int>& arr, int key) {
        // Code Here
        int minPos=findMinPos(arr);
        
        int pos;
        if(key>arr[arr.size()-1]) //leftPart
        {
            pos=modBinSearch(arr,0,minPos-1,key);
        }
        else //rightPart
        {
            pos=modBinSearch(arr,minPos,arr.size(),key);
        }
        
        if(pos==arr.size() || arr[pos]!=key)
        return -1;
        else
        return pos;
    }
};