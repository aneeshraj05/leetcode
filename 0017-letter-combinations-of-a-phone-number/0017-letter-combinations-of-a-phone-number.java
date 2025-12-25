class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0){
            return new ArrayList<>();
        }
        Map<Character,String> map=Map.of(
            '2',"abc",
            '3',"def",
            '4',"ghi",
            '5',"jkl",
            '6',"mno",
            '7',"pqrs",
            '8',"tuv",
            '9',"wxyz"
        );
        List<String> s=new ArrayList<>();
         helper(map,s,digits,"");
         return s;
   
    }
    static void helper(Map<Character,String> map,List<String> s,String digits,String p){
        if(digits.length()==0){
          s.add(p);
          return ;
        }

        char ch=digits.charAt(0);
        digits=digits.substring(1);
        String words=map.get(ch);
        for(int i=0;i<words.length();i++){
         helper(map,s,digits,p+words.charAt(i));
        }
    }
}