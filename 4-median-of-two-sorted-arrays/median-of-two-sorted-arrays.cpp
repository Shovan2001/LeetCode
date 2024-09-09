class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) 
    {
        int m=nums1.size();
        int n=nums2.size();
        int size=m+n;

        int idx1=(size/2)-1;
        int elem1;
        int idx2=(size/2);
        int elem2;

        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                if(k==idx1)
                elem1=nums1[i];
                if(k==idx2)
                elem2=nums1[i];
                i++;
            }
            else
            {
                if(k==idx1)
                elem1=nums2[j];
                if(k==idx2)
                elem2=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            if(k==idx1)
            elem1=nums1[i];
            if(k==idx2)
            elem2=nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            if(k==idx1)
            elem1=nums2[j];
            if(k==idx2)
            elem2=nums2[j];
            j++;
            k++;
        }
        if(size%2==1)
        return elem2;
        else
        return (elem1+elem2)/2.0;
        
    }
};