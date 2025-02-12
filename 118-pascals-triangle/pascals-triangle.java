class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        if(numRows==0)
        return new ArrayList<>();
        if(numRows==1)
        {        
            List<List<Integer>>ans=new ArrayList<>();
            List<Integer>res=new ArrayList<>();
            res.add(1);
            ans.add(res);
            return ans;
        }
        
        List<List<Integer>>prev_ans =generate(numRows-1);
        List<Integer>new_ans=new ArrayList<>();
        
        for(int i=0;i<numRows;i++)
        new_ans.add(1);

        for(int i=1;i<numRows-1;i++)
        new_ans.set(i,prev_ans.get(numRows-2).get(i-1)+prev_ans.get(numRows-2).get(i));

        prev_ans.add(new_ans);
        return prev_ans;
    }
}