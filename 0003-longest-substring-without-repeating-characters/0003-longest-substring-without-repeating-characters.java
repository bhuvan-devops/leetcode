class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,l=0;
        Set<Character> dub=new HashSet<>();
        while(j<s.length()){
            if(!dub.contains(s.charAt(j))){
                dub.add(s.charAt(j));
                j++;
            }else{
                while(dub.contains(s.charAt(j))){
                    dub.remove(s.charAt(i));
                    i++;
                }

            }
            l=Math.max(l,dub.size());
        }
        return l;
    }
}