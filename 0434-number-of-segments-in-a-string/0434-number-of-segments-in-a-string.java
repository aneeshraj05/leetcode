class Solution {
    public int countSegments(String s) {
        int segs = 0;
char[] chars = s.toCharArray();
for(int i=0;i<chars.length;i++) {
    if(chars[i]!=' ') segs++;
    while(i<chars.length && chars[i]!=' ') i++;
}
return segs;
        
    }
}