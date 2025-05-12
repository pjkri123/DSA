class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int start=0;
        int end=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(end<arr.length) {
            sum+=arr[end];
            if(end-start+1<k) end++;
            else if(end-start+1==k) {
                max=Math.max(max,sum);
                sum-=arr[start];
                start++;
                end++;
            }
        }
        return max;
    }
}
