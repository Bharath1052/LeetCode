class Solution {
    public boolean isPalindrome(int x) {
          if(x<0){
            return false;
          }
          int temp=0;
          int s=x;
          while(x>0){
            temp=(temp*10)+(x%10);
            x/=10;
          }
          if(temp==s){
            return true;
          }else{
            return false;
          }
    }
}