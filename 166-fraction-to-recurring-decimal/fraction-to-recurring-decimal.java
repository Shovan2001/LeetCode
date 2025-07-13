class Solution {
    public String fractionToDecimal(int num, int den) {
        if(num==0)
        return "0";

        String ans="";
        Long numerator=Long.valueOf(num);
        Long denominator=Long.valueOf(den);
        if(numerator<0 && denominator<0)
        {
            numerator=Math.abs(numerator);
            denominator=Math.abs(denominator);
        }
        else if(numerator<0)
        {
            ans+='-';
            numerator=Math.abs(numerator);
        }else if(denominator<0)
        {
            ans+='-';
            denominator=Math.abs(denominator);
        }

        long before_decimal=numerator/denominator;
        ans+=Long.toString(before_decimal);
        
        if(numerator%denominator==0)
        return ans;

        ans+='.';

        Long rem=Long.valueOf(numerator%denominator);

        Map<Long,Integer>mp=new HashMap<>();
        
        while(rem!=0)
        {
            if(mp.containsKey(rem))
            {
                StringBuilder sb = new StringBuilder(ans);
                sb.insert(mp.get(rem), "(");
                ans=sb.toString();
                ans+=")";
                break;
            }

            mp.put(rem,ans.length());

            rem*=10;
            long q=rem/denominator;
            ans+=Long.toString(q);
            rem%=denominator;            
        }
        return ans;
    }
}