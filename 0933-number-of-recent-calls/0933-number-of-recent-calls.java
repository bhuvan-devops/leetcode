class RecentCounter {
    List<Integer> list;
    public RecentCounter() {
        list= new ArrayList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        int c=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i) >=t- 3000){
                c++;
            }else{
                break;
            }
        }
        return c;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */