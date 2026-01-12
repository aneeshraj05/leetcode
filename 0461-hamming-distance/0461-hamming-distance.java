class Solution {
    public int hammingDistance(int x, int y) {
        int ans=x^y;
        int count =0;
        for(int i=0;i<32;i++){
            count+=ans&1;
            ans=ans>>1;

        }
        return count;
        
    }
}