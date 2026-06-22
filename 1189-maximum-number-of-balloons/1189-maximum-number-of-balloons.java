class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int b=map.getOrDefault('b',0);
        int a=map.getOrDefault('a',0);
        int l=map.getOrDefault('l',0)/2;
        int o=map.getOrDefault('o',0)/2;
        int n=map.getOrDefault('n',0);


       int first=Math.min(o,n);
       int second=Math.min(o,first);
       int third=Math.min(second,l);
       int fourth=Math.min(a,third);
       int fifth=Math.min(b,fourth);



       return fifth;






        

      

        
    }
}