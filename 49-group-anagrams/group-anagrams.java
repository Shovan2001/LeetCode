class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> mp=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String str=strs[i];

            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch)
;
            if(!mp.containsKey(key))
            mp.put(key,new ArrayList<>());

            mp.get(key).add(str);
        }

        List<List<String>> ans=new ArrayList<>(mp.values());
        // for (List<String> list : ) {
        //     ans.add(list);
        // }

        return ans;
    }
}