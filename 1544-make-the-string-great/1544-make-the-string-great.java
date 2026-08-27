class Solution {
    public String makeGood(String k) {
        Stack<Character> m=new Stack<>();
        for(int i=0;i<k.length();i++){
            if(!m.empty() && Math.abs(m.peek()-k.charAt(i))==32){
                m.pop();
            }else{
                m.add(k.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!m.empty()){
            char ch=m.pop();
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}