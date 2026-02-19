class Solution {
    public int countBinarySubstrings(String s) 
    {
        ArrayList<Integer> res=new ArrayList<>();
        int z=0,o=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                if(o!=0)
                {
                    res.add(o);
                    o=0;
                }
                z++;
            }
            else if(s.charAt(i)=='1')
            {
                if(z!=0)
                {
                    res.add(z);
                    z=0;
                }
                o++;
            }
        }
        if(z!=0)
        res.add(z);
        else
        res.add(o);
        
        for(int i=0;i<res.size();i++)
        {
            System.out.println(res.get(i));
        }
        int cnt=0;
        for(int i=1;i<res.size();i++)
        {
            cnt+=Math.min(res.get(i-1),res.get(i));
        }
        return cnt;
    }
}