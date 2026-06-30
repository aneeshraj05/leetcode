class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!isAnagram(list.get(list.size()-1),words[i])){
                list.add(words[i]);
            }
        }
        return list;
        
    }

    public static boolean isAnagram(String a,String b){
        char x[]=a.toCharArray();
        char y[]=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x,y );
    }
}