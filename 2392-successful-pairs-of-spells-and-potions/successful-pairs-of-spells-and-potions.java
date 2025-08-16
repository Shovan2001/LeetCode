class Solution {
    public int advBinSearch(int[] potions,long numToFind)
    {
        int l=0,h=potions.length;

        while(l<h)
        {
            int mid=l+(h-l)/2;

            if(potions[mid]<numToFind)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) 
    {
        Arrays.sort(potions);
        int ans[]=new int[spells.length];

        for(int i=0;i<spells.length;i++)
        {
            long numToFind;

            if(success%spells[i]!=0)
                numToFind=(success/spells[i])+1;
            else
                numToFind=(success/spells[i]);
            
            int pos=advBinSearch(potions,numToFind);
            
            if(pos<potions.length)
            ans[i]=potions.length-pos;
            else
            ans[i]=0;
        }
        return ans;
    }
}