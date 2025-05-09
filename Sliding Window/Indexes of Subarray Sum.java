class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int sum=0;
        int j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            while(sum>target && j<i) sum-=arr[j++];
            if(sum==target) {
                ans.add(j+1);
                ans.add(i+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
