class Solution {
    public int noOfSidesLessThanSumOfTwoSides(int nums[],int l,int h,int sideLength)
    {
        while(l<h)
        {
            int mid=l+(h-l)/2;

            if(nums[mid]<sideLength)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);

        int ans=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int firstSide=nums[i];

            for(int j=i+1;j<nums.length-1;j++)
            {
                int secSide=nums[j];

                int sumOfTwoSides=firstSide+secSide;

                int sidesLessThanSumOfTwoSides=noOfSidesLessThanSumOfTwoSides(nums,j+1,nums.length,sumOfTwoSides);

                int noOfTriangles=sidesLessThanSumOfTwoSides-(j+1);
                ans+=noOfTriangles;
            }
        }
        return ans;
    }
}