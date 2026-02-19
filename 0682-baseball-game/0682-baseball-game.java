class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                int newscore=a+st.peek();
                st.push(a);
                st.push(newscore);
            }
            else if(s.equals("D")){
                st.push(2*st.peek());

            }
            else if(s.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int total=0;
        while(!st.isEmpty()){
            total+=st.pop();
        }
        return total;
    }
}