class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n)){
set.add(n);
n=sum(n);
if(n==1){
    return true;

}        }
return false;
        
    }
    public static int sum(int n){
        int output=0;
        while(n>0){
            int digit=n%10;
            output+=digit*digit;
            n=n/10;

        }
        return output;

    }
}