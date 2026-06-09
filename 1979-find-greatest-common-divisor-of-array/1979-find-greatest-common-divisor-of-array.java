class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0],min = nums[0];
     for(int num :nums){
         max = Math.max(max, num);
         min = Math.min(min, num);
     }   
     return gcd(max,min);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int t = b;
            b = a%b;
            a=t;
        }
        return a;
    }
}