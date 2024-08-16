class Solution {
    public int reverse(int x) {
        int temp=Math.abs(x);
        long sum=0;
        while(temp>0){
           int rem=temp%10;
            sum=(sum*10)+rem;
            temp/=10;
        }
        if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE)
        {
            return 0;
    }
    if(x<0)
    {
        sum=-sum;
    }
    return (int)sum;

    }
}