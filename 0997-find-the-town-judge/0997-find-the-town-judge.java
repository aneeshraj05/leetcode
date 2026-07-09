class Solution {
    public int findJudge(int n, int[][] trust) {
        int votes[]=new int[n+1];

        for(int vote[]:trust){
            int voter=vote[0];
            int reciever=vote[1];

             votes[voter]--;
             votes[reciever]++;
        }

        for(int i=1;i<votes.length;i++){
            if(votes[i]==n-1){
                return i;
            }
        }

        return -1;
        
    }
}