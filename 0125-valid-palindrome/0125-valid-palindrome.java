class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder d=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                d.append(c);
            }
        }
        if(d.length()==0) return true;
        
        for(int i=0;i<d.length()/2;i++){
            if(d.charAt(i)!=d.charAt(d.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}