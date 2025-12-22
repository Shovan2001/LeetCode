class Solution {
    void merge2SortedArrays(int nums[],int l,int mid,int r)
    {
        int n1=mid-l+1,n2=r-mid;
        int nums1[]=new int[n1];
        int nums2[]=new int[n2];

        int k=l;
        for(int i=0;i<n1;i++)
        {
            nums1[i]=nums[k];
            k++;
        }
        for(int i=0;i<n2;i++)
        {
            nums2[i]=nums[k];
            k++;
        }

        int i=0,j=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(nums1[i]<=nums2[j])
            {
                nums[k]=nums1[i];
                i++;
            }    
            else
            {
                nums[k]=nums2[j];
                j++;
            }    
            k++;
        }
        while(i<n1)
        {
            nums[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            nums[k]=nums2[j];
            j++;
            k++;
        }
    } 
    void mergeSort(int nums[],int l,int r)
    {
        if(l>=r)
        return;

        int mid=l+(r-l)/2;

        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);

        merge2SortedArrays(nums,l,mid,r);
    }
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}