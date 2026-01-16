class Solution {
    public boolean wordPattern(String pattern, String s) {
       
        String r[]=s.split(" ");
       if (r.length != pattern.length()) {
    return false;
}
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char orginal=pattern.charAt(i);
            String replacement=r[i];
            if(!map.containsKey(orginal)){
                if(!map.containsValue(replacement)){
                    map.put(orginal,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                String mapped=map.get(orginal);
                if(!mapped.equals(replacement)){
                    return false;
                }
            }

        }
        return true;
        
    }
}