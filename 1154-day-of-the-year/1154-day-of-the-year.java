class Solution {
    public int dayOfYear(String date) {
        String d[]=date.split("-");
        int dat=Integer.parseInt(d[2]);
        int month=Integer.parseInt(d[1]);
        int year=Integer.parseInt(d[0]);

       
        int leap=leap(year)?1:0;
        int feb=leap+28;
        int noOfDays=0;
        int days[]={31,feb,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
           
            noOfDays+=days[i];
        }
        return noOfDays + dat;
        
    }
    static boolean leap(int year){
      if(year%400==0){
        return true;
      }
      if(year%100==0){
        return false;
      }
      if(year%4==0){
        return true;
      }
        return false;
    }
}